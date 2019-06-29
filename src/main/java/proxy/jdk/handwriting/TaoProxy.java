package proxy.jdk.handwriting;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * 生成代理对象的代码
 */
public class TaoProxy {

    private static String ln = "\r\n";

    public static Object newProxyInstance(TaoClassLoader classLoader,
                                          Class<?>[] interfaces,
                                          TaoInvocationHandler h){

        //1,生成源代码
        String proxyStr = generateSrc(interfaces[0]);//这里为了简单先只从接口数组取一个接口

        try {
            //2，将生成的源代码输出到磁盘，保存为.java文件
            String filePath = TaoProxy.class.getResource("").getPath();
            //$Proxy0命名中的$符号可以不用，这只是个规则，只要跟类名一样就行，
            //动态代理规则，$符号开始的表示这个类代表被代理过的对象，0代表已经生成类多少个代理类，代表序号
            File f = new File(filePath, "$Proxy0.java");
            FileWriter fileWriter = new FileWriter(f);
            fileWriter.write(proxyStr);
            fileWriter.flush();
            fileWriter.close();

            //3，编译源代码，并且生成.class文件
            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager manager = compiler.getStandardFileManager(null,null,null);
            Iterable iterable = manager.getJavaFileObjects(f);
            JavaCompiler.CompilationTask task = compiler.getTask(null,manager,null,null,null,iterable);
            task.call();
            manager.close();

            //4，将class文件中的内容动态加载到jvm中
            Class proxyClass = classLoader.findClass("$Proxy0");
            Constructor c = proxyClass.getConstructor(TaoInvocationHandler.class);
            f.delete();

            //5，返回被代理后的代理对象
            return c.newInstance(h);

        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    private static String generateSrc(Class<?> interfaces){
        StringBuffer src = new StringBuffer();
        src.append("package proxy.jdk.handwriting;" + ln);
        src.append("import java.lang.reflect.Method;" + ln);
        src.append("public class $Proxy0 implements " + interfaces.getName() + "{" + ln);
        src.append("TaoInvocationHandler h;" + ln);
        src.append("public $Proxy0(TaoInvocationHandler h) {" + ln);
        src.append("this.h = h;" + ln);
        src.append("}" + ln);
        for (Method m : interfaces.getMethods()){
            src.append("public " + m.getReturnType().getName() + " " + m.getName() + "() {" + ln);
            src.append("try{" + ln);
            src.append("Method m = " + interfaces.getName() + ".class.getMethod(\"" + m.getName() + "\", new Class[]{});" + ln);
            src.append("this.h.invoke(this, m, null);" + ln);
//            if (!m.getReturnType().getName().equals("void")){
//                src.append("return " + );
//            }
            src.append("} catch (Throwable e){e.printStackTrace();}" + ln);
            src.append("}" + ln);
        }
        src.append("}" + ln);
        return src.toString();
    }
}

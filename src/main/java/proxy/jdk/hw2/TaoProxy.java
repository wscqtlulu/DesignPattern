package proxy.jdk.hw2;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class TaoProxy {
    public static Object newProxyInstance(TaoClassLoader classLoader,
                                          Class<?>[] interfaces,
                                          TaoInvocationHandler h){
        try {
            //生成源代码
            String src = generateSrc(interfaces[0]);

            //生成的源代码输出到磁盘，保存为.java文件
            String filePath = TaoProxy.class.getResource("").getPath();
            File f = new File(filePath + "$Proxy0.java");

            FileWriter fw = new FileWriter(f);
            fw.write(src);
            fw.flush();
            fw.close();

            //编译源代码生成.class文件
            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager manager = compiler.getStandardFileManager(null, null, null);
            Iterable iterable = manager.getJavaFileObjects(f);
            JavaCompiler.CompilationTask task = compiler.getTask(null, manager, null, null, null, iterable);
            task.call();
            manager.close();

            //将class文件中的内容动态加载到jvm中


            //返回生成的代理对象
            Class proxyClass = classLoader.findClass("$Proxy0");
            Constructor c = proxyClass.getConstructor(TaoInvocationHandler.class);
            f.delete();

            return c.newInstance(h);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    private static String generateSrc(Class<?> interfaces){

        String ln = "\r\n";

        StringBuffer sb = new StringBuffer();
        sb.append("package proxy.jdk.hw2;" + ln);
        sb.append("import java.lang.reflect.Method;" + ln);

        sb.append("public class $Proxy0 implements " + interfaces.getName() + "{" + ln);

        sb.append("TaoInvocationHandler h;" + ln);

        sb.append("public $Proxy0(TaoInvocationHandler h){" + ln);
        sb.append("this.h = h;" + ln);
        sb.append("}" + ln);

        for (Method m : interfaces.getMethods()){
            sb.append("public " + m.getReturnType().getName() + " " + m.getName() + "() {" + ln);
            sb.append("try{");
            sb.append("Method m = " + interfaces.getName() + ".class.getMethod(\"" + m.getName()+ "\", new Class[]{});" + ln);
            sb.append("this.h.invoke(this, m, null);" + ln);
            sb.append("} catch (Throwable e){e.printStackTrace();}" + ln);
//            if (!"void".equals(m.getReturnType().getName())){
//                sb.append("return " + m.getReturnType().getName());
//            }
            sb.append("}" + ln);
        }

        sb.append("}" + ln);

        return sb.toString();
    }
}

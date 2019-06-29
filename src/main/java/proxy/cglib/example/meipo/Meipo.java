package proxy.cglib.example.meipo;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class Meipo implements MethodInterceptor {

    public Object getInstance(Class clazz) throws Exception{
        Enhancer enhancer = new Enhancer();
        //设置父类
        //告诉cglib生成的子类需要继承哪个类
        enhancer.setSuperclass(clazz);
        //设置回调
        enhancer.setCallback(this);
        //第一步生成源代码
        //第二步编译成class文件
        //第三步加载到jvm中，并返回被代理对象
        return enhancer.create();
    }

    /**
     * 同样是做类字节码重组这样一件事情
     * 对于使用API的用户来说，是无感的
     */
    @Override
    public Object intercept(Object obj, Method method, Object[] objects, MethodProxy proxy) throws Throwable {
        System.out.printf("开始进行海选。。。" + "\n");
        /**
         * 这个obj的引用是由cglib给我们new出来的
         * cglib new出来以后的对象，是被代理对象的子类（继承我们自己写的那个类）
         * OOP，在new子类之前，实际上默认先调用了我们super()方法的，
         * new了子类的同时也必须先new出来父类，这就相当于是间接的持有了我们父类的引用
         * 子类重写了父类的所有方法
         * 我们改变子类对象的某些属性，是可以间接的操作父类的属性
         */
        proxy.invokeSuper(obj,objects);
        System.out.printf("合适的话，准备相亲");
        return null;
    }
}

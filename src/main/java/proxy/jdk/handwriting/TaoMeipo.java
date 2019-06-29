package proxy.jdk.handwriting;

import proxy.jdk.example.meipo.Person;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TaoMeipo implements TaoInvocationHandler {

    private Person target;

    //获取被代理人的个人资料
    public Object getInstance(Person target) throws Exception{
        this.target = target;
        Class clazz = target.getClass();
        System.out.printf("被代理对象的class是：" + clazz + "\n");
        return TaoProxy.newProxyInstance(new TaoClassLoader(), clazz.getInterfaces(), this);
        //return null;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //System.out.printf("你的性别是：" + this.target.getSex() + "\n");
        System.out.printf("开始进行海选。。。" + "\n");

        //this.target.findLove();//在被代理对象的方法前后增加别的操作，不修改代理对象本身的方法
        method.invoke(this.target, args);

        System.out.printf("合适的话，准备相亲");
        return null;
    }
}

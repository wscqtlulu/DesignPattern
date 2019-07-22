package proxy.jdk.hw2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author taotao
 *
 * 中介
 */
public class Intermediary implements TaoInvocationHandler {

    Person person;

    public Object getNewInstance(Person person){
        this.person = person;
        Class clazz = person.getClass();
        Object object = TaoProxy.newProxyInstance(new TaoClassLoader(), clazz.getInterfaces(), this);
        return object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        person.findHome();
        System.out.println("中介正在为您找最优质最便宜的房子");
        return null;
    }
}

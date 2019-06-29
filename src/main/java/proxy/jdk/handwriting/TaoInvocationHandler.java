package proxy.jdk.handwriting;

import java.lang.reflect.Method;

public interface TaoInvocationHandler {

    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable;
}

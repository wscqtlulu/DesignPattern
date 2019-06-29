package single;

/**
 * 静态内部类
 * jvm的机制，当没有访问一个类时，不会将这个类加载进jvm，使用外部类的其它属性时，不会浪费内存载入内部类的单例
 * 当调用InnerSingle.single5时才会对单例进行初始化，而且反射无法通过外部类获取内部类的属性，所有可以避免反射入侵
 */
public class Single5 {

    private Single5(){};

    public static Single5 getInstance(){
        return InnerSingle.single5;
    }

    private static class InnerSingle{
        private static final Single5 single5 = new Single5();
    }
}

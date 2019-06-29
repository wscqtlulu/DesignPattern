package single;

/**
 * 枚举
 * 枚举反编译之后会看到是个继承自Enum的类，所以本质上是个类，并且根据枚举的特点保证了线程安全且防止反序列化
 * 相关博文 https://blog.csdn.net/moakun/article/details/80688851
 */
public enum Single7 {
    //实例
    SINGLE_7;

    public static Single7 getInstance(){
        return SINGLE_7;
    }
}

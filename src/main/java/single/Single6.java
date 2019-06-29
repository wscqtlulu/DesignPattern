package single;

/**
 * 重写readResolve防止反序列化破坏单例
 */
public class Single6 {

    private Single6(){}

    public static Single6 getInstance(){
        return InnerSingle6.single6;
    }

    private static class InnerSingle6{
        private static final Single6 single6 = new Single6();
    }

    /**
     * 重写readResolve防止反序列化破坏单例
     * 反序列化的机制，在反序列化的时候，会判断如果实现了serializable或者externalizable接口的类中
     * 若包含了readResolve方法，则会直接调用readResolve来返回实例
     * @return
     */
    public Object readResolve(){
        return InnerSingle6.single6;
    }
}

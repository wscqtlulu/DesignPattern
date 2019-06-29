package single;

/**
 * 饿汉式
 * 不足：类加载时就实例化对象，没有使用该单例就被加载，若单例很大，会浪费内存
 * @author taotao
 */
public class Single2 {

    /**
     * 类在加载字节码到虚拟机的时候就实例化对象
     */
    private static final Single2 single2 = new Single2();

    private Single2(){}

    public static Single2 getInstance(){
        return single2;
    }
}

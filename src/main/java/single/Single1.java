package single;

/**
 * 懒汉式
 * 不足：存在并发问题
 */
public class Single1 {
    private static Single1 single1;

    //私有化构造方法
    private Single1(){}

    public static Single1 getInstance(){
        if (single1 == null){
            single1 = new Single1();
        }
        return single1;
    }
}

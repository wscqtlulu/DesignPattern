package single;

/**
 * 双重检验锁，仅在实例为null时进行synchronized（第一次实例化），实例不为null则直接返回
 */
public class Single4 {

    /**
     * volatile解释：避免指令重排
     * Java虚拟机初始化一个对象需要执行的步骤
     * 1，在堆空间分配内存
     * 2，执行构造方法进行初始化
     * 3，将对象指向内存中分配的内存空间，也就是地址
     * 编译器在生成汇编代码时会对流程进行优化，执行的顺序就不一定是123，有可能是132，
     * 若是132的执行顺序，那么执行完3时对象已经不为null，但是初始化未完成，当需要调操作实例某些需要初始化的参数的时候就会出错
     * volatile则是告诉编译器不要进行重排序的优化
     */
    private static volatile Single4 single4;

    private Single4(){}

    public static Single4 getInstance(){
        //多线程直接访问，不控制不影响性能
        if (single4 == null){
            //此处仍有可能多个线程进入，所有接下来进行synchronized同步限制
            synchronized (Single4.class){
                //仅有一个线程进入，再次判空，若为null则实例化，那么之后第二个线程进来已经不是null
                if (single4 == null){
                    single4 = new Single4();
                }
            }
        }
        return single4;
    }
}

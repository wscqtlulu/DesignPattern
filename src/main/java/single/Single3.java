package single;

/**
 * synchronized，对懒汉式添加synchronized同步方法块解决并发问题
 * 不足：每个获取单例的线程都要阻塞排队，影响性能
 */
public class Single3 {

    private static Single3 single3;

    private Single3(){}

    //同步静态方法保证只有一个线程进入该方法，防止并发导致出现两个实例，但是每次想要获取实例的线程都要阻塞排队，影响效率
    public synchronized static Single3 getInstance(){
        if (single3 == null){
            single3 = new Single3();
        }
        return single3;
    }
}

package single;

import java.util.concurrent.atomic.AtomicReference;

/**
 * 不使用synchronized和lock实现线程安全的单例
 */
public class Single8 {

    private static final AtomicReference<Single8> INSTANCE = new AtomicReference<>();

    private Single8(){}

    public static Single8 getInstance(){
        for (;;){
            Single8 single8 = INSTANCE.get();
            if (null != single8){
                return single8;
            }
            single8 = new Single8();
            if (INSTANCE.compareAndSet(null, single8)){
                return single8;
            }
        }
    }

}

package single;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Set;

public class SingleMain {
    /**
     * 单例好处
     * 1，对于频繁使用的对象，节省创建对象的话费的时间，对于重量级的对象，节省内存空间
     * 2，减少类new操作次数，降低系统对内存的使用频率，能减轻GC压力，缩短GC停顿时间
     * 测试单例
     * @param args
     * 第一种：懒汉式加载
     * 第二种：饿汉式加载
     * 第三种方式：synchronized 同步式
     * 第四种方式：双重检验锁：
     * 第五种方式：既要懒汉式加载，又要线程安全：静态内部类。
     * 第六种方式：反射和反序列化破坏单例
     * 第七种方式：最后一招，使用枚举
     */
    public static void main(String [] args) throws IllegalAccessException, InstantiationException, IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException {

        /**
         * 并下情况下懒汉式可能会出现多个实例
         */
//        final Set<Single1> set = new HashSet<>();
//        for (int i = 0; i < 1000; i++){
//            new Thread(()-> set.add(Single1.getInstance())).start();
//        }
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.printf("单例测试：");
//        for (Single1 single: set) {
//            System.out.printf(String.valueOf(single));
//        }

        /**
         * 反射破坏单例
         */
//        Constructor constructor = Single5.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        Single5 singleClazz = (Single5) constructor.newInstance();
//        Single5 singleInstance = Single5.getInstance();
//        System.out.printf(singleClazz + "\n" + singleInstance);

        /**
         * 反序列化破坏单例（重写readResolve方法解决）
         */
        String filePath = Single6.class.getResource("/").getPath();
        //反序列化获取实例
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filePath));
        //将实例写入到文件中
        outputStream.writeObject(Single6.getInstance());
        outputStream.close();
        //从文件中读取出来成为新的实例
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filePath));
        Single6 single6 = (Single6) inputStream.readObject();
        Single6 single6Instance = Single6.getInstance();
        System.out.printf(single6 + "\n" + single6Instance);
        inputStream.close();

//        System.out.println("sssssss"+null);
    }
}

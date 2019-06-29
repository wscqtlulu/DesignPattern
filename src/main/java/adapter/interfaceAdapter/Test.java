package adapter.interfaceAdapter;

/**
 * @author taotao
 *
 * 接口适配器
 * 一个接口方法太多而只想使用其中某些方法时，使用一个抽象类把接口包装，使用时只需要继承这个包装类重写里面需要的方法就可以，而不需要把接口所有不需要的方法都实现
 */
public class Test {
    public static void main(String[] args) {
        Target1 target1 = new Target1();
        target1.method1();
        target1.method2();
        target1.method3();

        Target2 target2 = new Target2();
        target2.method1();
        target2.method2();
        target2.method3();
    }
}

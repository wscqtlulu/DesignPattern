package adapter.classAdapter;

/**
 * @author taotao
 *
 * 类适配器
 */
public class Test {
    public static void main(String[] args) {
        Target target = new Target();
        target.method1();
        target.method2();
    }
}

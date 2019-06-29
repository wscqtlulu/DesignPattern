package adapter.objectAdapter;

/**
 * @author taotao
 *
 * 对象适配器
 */
public class Test {
    public static void main(String[] args) {
        Source source = new Source();
        Target target = new Target(source);
        target.method1();
        target.method2();
    }
}

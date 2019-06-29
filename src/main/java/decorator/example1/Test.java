package decorator.example1;

/**
 * @author taotao
 *
 * 装饰器模式
 * 可以对多个实现相同接口的对象进行装饰
 */
public class Test {
    public static void main(String[] args) {
        Source source = new Source();
        Decorator decorator = new Decorator(source);
        decorator.method();
    }
}

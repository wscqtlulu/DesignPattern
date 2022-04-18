package chainofresponsibility.demo1;

/**
 * @author taotao
 *
 * 责任链模式
 */
public class Test {
    public static void main(String[] args) {
        MyHandler handler1 = new MyHandler("h1");
        MyHandler handler2 = new MyHandler("h2");
        MyHandler handler3 = new MyHandler("h3");

        handler1.setHandler(handler2);
        handler2.setHandler(handler3);

        handler1.operate();
        System.out.println("-------------------");
        handler2.operate();
        System.out.println("-------------------");
    }
}

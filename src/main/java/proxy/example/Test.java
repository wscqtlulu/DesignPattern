package proxy.example;

/**
 * @author taotao
 */
public class Test {
    public static void main(String[] args) {

        Source source = new Source();
        source.method();

        Proxy proxy = new Proxy();
        proxy.method();
    }
}

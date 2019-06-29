package decorator.example1;

/**
 * @author taotao
 */
public class Decorator implements Sourceable {

    Source source;

    Decorator(Source source){
        this.source = source;
    }

    @Override
    public void method() {
        System.out.println("before method");
        source.method();
        System.out.println("after method");
    }
}

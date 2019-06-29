package proxy.example;

public class Proxy implements Sourceable {

    Source source;

    Proxy(){
        this.source = new Source();
    }

    @Override
    public void method() {
        System.out.println("before proxy");
        source.method();
        System.out.println("after proxy");
    }
}

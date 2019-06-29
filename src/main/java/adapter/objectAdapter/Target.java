package adapter.objectAdapter;

public class Target implements Targetable {

    Source source;

    Target(Source source){
        this.source = source;
    }

    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("target method2");
    }
}

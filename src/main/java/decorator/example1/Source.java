package decorator.example1;

public class Source implements Sourceable {
    @Override
    public void method() {
        System.out.println("source method");
    }
}

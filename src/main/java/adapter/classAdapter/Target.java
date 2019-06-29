package adapter.classAdapter;

public class Target extends Source implements Targetable {
    @Override
    public void method2() {
        System.out.println("target method2");
    }
}

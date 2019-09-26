package observer.demo2;

public class Son implements Eat {

    @Override
    public void callToEat() {
        System.out.println("儿子饭好了，可以开饭了");
    }
}

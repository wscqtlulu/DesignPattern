package observer.demo2;

public class Father implements Eat {
    @Override
    public void callToEat() {
        System.out.println("爸爸饭好了，可以开饭了");
    }
}

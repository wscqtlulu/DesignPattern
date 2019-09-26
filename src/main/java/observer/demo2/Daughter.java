package observer.demo2;

public class Daughter implements Eat {
    @Override
    public void callToEat() {
        System.out.println("女儿饭好了，可以开饭了");
    }
}

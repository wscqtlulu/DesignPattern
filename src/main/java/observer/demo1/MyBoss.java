package observer.demo1;

public class MyBoss extends AbstractSubject {
    @Override
    public void call() {
        callObservers();
    }
}

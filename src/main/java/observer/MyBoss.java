package observer;

public class MyBoss extends AbstractSubject {
    @Override
    public void call() {
        callObservers();
    }
}

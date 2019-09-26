package observer.demo1;

public interface Subject {

    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void callObservers();

    void call();
}

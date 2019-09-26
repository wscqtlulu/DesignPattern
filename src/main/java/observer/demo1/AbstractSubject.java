package observer.demo1;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractSubject implements Subject {

    List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void callObservers() {
        observers.forEach(item->{
            item.called();
        });
    }
}

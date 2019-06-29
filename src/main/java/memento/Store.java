package memento;

public class Store {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }

    public Store(Memento memento) {
        this.memento = memento;
    }

}

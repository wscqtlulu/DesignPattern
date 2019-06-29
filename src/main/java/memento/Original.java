package memento;

public class Original {
    private String value1;
    private int value2;

    Memento createMemento(){
        return new Memento(value1, value2);
    }

    void reductionMemento(Memento memento){
        value1 = memento.getValue1();
        value2 = memento.getValue2();
    }

    public Original(String value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    public int getValue2() {
        return value2;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }
}

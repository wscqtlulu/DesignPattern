package observer;

public class LaoWang implements Observer {
    @Override
    public void called() {
        System.out.println("老王被呼叫！");
    }
}

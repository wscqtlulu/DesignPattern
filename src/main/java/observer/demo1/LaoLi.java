package observer.demo1;

public class LaoLi implements Observer {
    @Override
    public void called() {
        System.out.println("老李被呼叫！");
    }
}

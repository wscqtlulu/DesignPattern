package bridge;

public class MyBridge extends Bridge{
    MyBridge(Sourceable sourceable){
        this.sourceable = sourceable;
    }
    @Override
    public void method(){
        getSourceable().method();
    }
}

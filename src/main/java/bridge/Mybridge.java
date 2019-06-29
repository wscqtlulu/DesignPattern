package bridge;

public class Mybridge extends Bridge{
    Mybridge(Sourceable sourceable){
        this.sourceable = sourceable;
    }
    @Override
    public void method(){
        getSourceable().method();
    }
}

package state;

public class Content {
    private State state;

    public Content(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void method(){
        String state = getState().getStateValue();
        switch (state){
            case StateConstant.ONLINE:
                getState().onlineMethod();
                break;
            case StateConstant.OFFLINE:
                getState().offlineMethod();
                break;
            default:
                break;
        }
    }
}

package state;

public class State {
    private String stateValue;

    public State(String stateValue) {
        this.stateValue = stateValue;
    }

    public String getStateValue() {
        return stateValue;
    }

    public void setStateValue(String stateValue) {
        this.stateValue = stateValue;
    }

    public void onlineMethod(){
        System.out.println("online method");
    }

    public void offlineMethod(){
        System.out.println("offline method");
    }
}

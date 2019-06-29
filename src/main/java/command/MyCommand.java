package command;

public class MyCommand implements Command {

    Receiver receiver;

    MyCommand(Receiver receiver){
        this.receiver = receiver;
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void toDo() {
        receiver.action();
    }
}

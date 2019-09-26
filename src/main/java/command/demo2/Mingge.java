package command.demo2;

public class Mingge {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void doCommand(){
        command.doTask();
    }
}

package command;

public class Invoker {
    Command command;

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void action(){
        if (command != null){
            command.toDo();
        } else {
            System.out.println("暂时没有命令发布");
        }
    }
}

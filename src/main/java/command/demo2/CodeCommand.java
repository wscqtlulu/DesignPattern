package command.demo2;

public class CodeCommand implements Command {

    private Coder coder;

    public void setCoder(Coder coder) {
        this.coder = coder;
    }

    @Override
    public void doTask() {
        coder.coding();
    }
}

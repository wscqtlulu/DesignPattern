package visitor.demo1;

public class SaveService implements Service {
    @Override
    public void accept(Visitor visitor) {
        visitor.process(this);
    }
}

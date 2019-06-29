package visitor;

public class BaseService implements Service {
    @Override
    public void accept(Visitor visitor) {
        visitor.process(this);
    }
}

package visitor.demo1;

public class BaseService implements Service {
    @Override
    public void accept(Visitor visitor) {
        visitor.process(this);
    }
}

package visitor.demo1;

public class FundService implements Service {
    @Override
    public void accept(Visitor visitor) {
        visitor.process(this);
    }
}

package visitor;

public class FundService implements Service {
    @Override
    public void accept(Visitor visitor) {
        visitor.process(this);
    }
}

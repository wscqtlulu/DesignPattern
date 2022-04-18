package chainofresponsibility.demo2;

public class AbstractAmountHandler {

    AmountHandler handler;

    public void setHandler(AmountHandler handler) {
        this.handler = handler;
    }
}

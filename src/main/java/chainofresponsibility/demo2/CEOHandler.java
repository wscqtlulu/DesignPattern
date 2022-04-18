package chainofresponsibility.demo2;

public class CEOHandler extends AbstractAmountHandler implements AmountHandler {

    @Override
    public void deal(double amount) {
        System.out.println("CEO审核！");
        if (amount <= 20000) {
            System.out.println("CEO审核通过！");
        } else {
            if (handler != null) {
                handler.deal(amount);
            } else {
                System.out.println("审核结束！");
            }
        }
    }
}

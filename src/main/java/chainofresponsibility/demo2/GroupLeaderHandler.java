package chainofresponsibility.demo2;

public class GroupLeaderHandler extends AbstractAmountHandler implements AmountHandler {
    @Override
    public void deal(double amount) {
        System.out.println("组长审核！");
        if (amount <= 10000) {
            System.out.println("组长审核通过！");
        } else {
            if (handler != null) {
                handler.deal(amount);
            } else {
                System.out.println("审核结束！");
            }
        }
    }
}

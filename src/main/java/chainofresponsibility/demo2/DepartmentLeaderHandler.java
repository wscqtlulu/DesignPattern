package chainofresponsibility.demo2;

public class DepartmentLeaderHandler extends AbstractAmountHandler implements AmountHandler {
    @Override
    public void deal(double amount) {
        System.out.println("部门负责人审核！");
        if (amount <= 15000) {
            System.out.println("部门负责人审核通过！");
        } else {
            if (handler != null) {
                handler.deal(amount);
            } else {
                System.out.println("审核结束！");
            }
        }
    }
}

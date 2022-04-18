package chainofresponsibility.demo2;

/**
 * @author taotao
 *
 * 责任链模式
 */
public class Test {
    public static void main(String[] args) {
        AmountHandler groupLeaderHandler = new GroupLeaderHandler();
        AmountHandler departmentLeaderHandler = new DepartmentLeaderHandler();
        AmountHandler ceoHandler = new CEOHandler();

        ((GroupLeaderHandler) groupLeaderHandler).setHandler(departmentLeaderHandler);
        ((DepartmentLeaderHandler) departmentLeaderHandler).setHandler(ceoHandler);

        groupLeaderHandler.deal(14000);
        System.out.println("-------------------");
    }
}

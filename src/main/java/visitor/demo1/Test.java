package visitor.demo1;

/**
 * @author taotao
 *
 * 访问者模式
 */
public class Test {
    public static void main(String[] args) {
        BaseService baseService = new BaseService();
        FundService fundService = new FundService();
        SaveService saveService = new SaveService();

        Visitor visitor1 = new Visitor("老张");
        Visitor visitor2 = new Visitor("老李");

        baseService.accept(visitor1);
        fundService.accept(visitor2);
        saveService.accept(visitor1);
    }
}

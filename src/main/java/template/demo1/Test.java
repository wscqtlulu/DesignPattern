package template.demo1;

public class Test {
    public static void main(String[] args) {
        HrProjectProcess hrProjectProcess = new HrProjectProcess();
        hrProjectProcess.defaultProcess();

        ShopProjectProcess shopProjectProcess = new ShopProjectProcess();
        shopProjectProcess.defaultProcess();
    }
}

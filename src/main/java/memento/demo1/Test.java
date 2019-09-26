package memento.demo1;

/**
 * @author taotao
 *
 * 备忘录模式
 */
public class Test {
    public static void main(String[] args) {
        Original original = new Original("123", 321);
        print("初始", original);
        original.setValue2(456);
        Store store = new Store(original.createMemento());
        print("修改并保存", original);
        original.setValue1("gg");
        print("保存后修改", original);
        original.reductionMemento(store.getMemento());
        print("还原备份后", original);
    }

    public static void print(String status, Original original){
        System.out.println(status+ "属性value1：" + original.getValue1() + "；属性value2：" + original.getValue2());
    }
}

package facade;

/**
 * @author taotao
 *
 * 外观模式
 */
public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startup();
        computer.shutdown();
    }
}

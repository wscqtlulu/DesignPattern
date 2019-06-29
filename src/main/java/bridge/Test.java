package bridge;

/**
 * @author taotao
 *
 * 桥接模式
 */
public class Test {
    public static void main(String[] args) {

        Sourceable sourceable1 = new Source1();
        Sourceable sourceable2 = new Source2();
//        bridge.setSourceable(sourceable1);

        Bridge bridge = new Mybridge(sourceable1);
        bridge.setSourceable(sourceable2);
        bridge.method();

//        Sourceable sourceable2 = new Source2();
//        bridge.setSourceable(sourceable2);
//        bridge.method();
    }
}

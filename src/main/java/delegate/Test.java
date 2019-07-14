package delegate;

/**
 * @author taotao
 *
 * 委派模式
 */
public class Test {

    public static void main(String[] args) {
        Leader leader = new Leader(new ZhangSan());
        leader.doing();
    }
}

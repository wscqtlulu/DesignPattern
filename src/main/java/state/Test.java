package state;

/**
 * @author taotao
 *
 * 状态模式
 */
public class Test {
    public static void main(String[] args) {
        Content content = new Content(new State(StateConstant.ONLINE));
        content.method();

        content.getState().setStateValue(StateConstant.OFFLINE);
        content.method();
    }
}

package interpreter;

/**
 * @author taotao
 *
 * 解释器模式
 */
public class Test {
    public static void main(String[] args) {
        Content content = new Content(9, 5);
        int plusResult = new Plus().interpret(content);
        int minusResult = new Minus().interpret(content);
        System.out.println(plusResult);
        System.out.println(minusResult);
    }
}

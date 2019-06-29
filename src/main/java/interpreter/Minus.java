package interpreter;

public class Minus implements Expression {
    @Override
    public int interpret(Content content) {
        return content.getNum1() - content.getNum2();
    }
}

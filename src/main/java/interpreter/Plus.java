package interpreter;

public class Plus implements Expression {
    @Override
    public int interpret(Content content) {
        return content.getNum1() + content.getNum2();
    }
}

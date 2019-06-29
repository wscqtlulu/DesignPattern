package flyweight;

public class BlackChess extends Chess {

    public BlackChess() {
        super(ChessColorConstant.BLACK);
        System.out.println("黑棋创建完成");
    }
}

package flyweight;

public class WhiteChess extends Chess {

    public WhiteChess() {
        super(ChessColorConstant.WHITE);
        System.out.println("白棋创建完成");
    }
}

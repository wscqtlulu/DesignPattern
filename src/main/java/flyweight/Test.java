package flyweight;

/**
 * @author taotao
 *
 * 享元模式
 */
public class Test {
    public static void main(String[] args) {
        ChessFactory chessFactory = ChessFactory.getChessFactoryInstance();

        BlackChess blackChess1 = (BlackChess) chessFactory.getChess(ChessColorConstant.BLACK);
        blackChess1.setPosition(3, 4);

        WhiteChess whiteChess1 = (WhiteChess) chessFactory.getChess(ChessColorConstant.WHITE);
        whiteChess1.setPosition(3, 3);

        BlackChess blackChess2 = (BlackChess) chessFactory.getChess(ChessColorConstant.BLACK);
        blackChess2.setPosition(2, 1);

        WhiteChess whiteChess2 = (WhiteChess) chessFactory.getChess(ChessColorConstant.WHITE);
        whiteChess2.setPosition(5, 5);

        System.out.println("pool size:" + ChessFactory.getPoolSize());
    }
}

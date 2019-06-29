package flyweight;

import java.util.HashMap;

public class ChessFactory {

    private static ChessFactory chessFactory = new ChessFactory();
    private ChessFactory(){};
    public static ChessFactory getChessFactoryInstance(){
        return chessFactory;
    }

    private static HashMap<String, Chess> chessPool = new HashMap<>();

    public Chess getChess(String color){
        Chess chess = null;
        switch (color){
            case ChessColorConstant.BLACK:
                if (chessPool.containsKey(ChessColorConstant.BLACK)){
                    chess = chessPool.get(ChessColorConstant.BLACK);
                } else {
                    BlackChess blackChess = new BlackChess();
                    chessPool.put(ChessColorConstant.BLACK, blackChess);
                    chess =  blackChess;
                }
                break;
            case ChessColorConstant.WHITE:
                if (chessPool.containsKey(ChessColorConstant.WHITE)){
                    chess = chessPool.get(ChessColorConstant.WHITE);
                } else {
                    WhiteChess whiteChess = new WhiteChess();
                    chessPool.put(ChessColorConstant.WHITE, whiteChess);
                    chess =  whiteChess;
                }
                break;
            default:
                break;
        }
        return chess;
    }

    public static int getPoolSize(){
        return chessPool.size();
    }
}

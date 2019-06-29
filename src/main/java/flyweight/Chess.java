package flyweight;

public abstract class Chess {
    /**
     * 棋子坐标，为外部状态，因为会随棋子的移动而改变
     */
    private int x;
    private int y;

    /**
     * 棋子颜色，为内部状态，生成之后颜色不会再变
     */
    private String color;

    public Chess(String color) {
        this.color = color;
    }

    public void setPosition(int x, int y){
        this.x = x;
        this.y = y;
    };
}

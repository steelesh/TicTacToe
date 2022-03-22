import javax.swing.*;

public class TicTacToeMoves extends JButton {
    private int row;
    private int col;
    public TicTacToeMoves(int row, int col){
        super();
        this.row = row;
        this.col = col;
    }
    public int getRow(){
        return row;
    }
    public int getCol(){
        return col;
    }
}
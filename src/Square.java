import java.awt.*;

public class Square {

    private Color square_Color;
    //Should this be a character like chess notation or should it be an int for simplicity
    private char row;
    private int col;
    private Piece piece_On_Square;

    public Square(char row) {
        this.row = row;
    }

    public char getRow() {
        return row;
    }

    public static void main(String[] args) {
        Square square = new Square('A');
        int squareInt = (int) square.getRow() - 64;
        System.out.println(squareInt);
    }

}

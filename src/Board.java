/**
 * Represents the game board
 */
public final class Board {

    private BoardSquare[][] boardSquares;

    //Initialise the squares on the board
    public Board() {
        boardSquares = new BoardSquare[19][19];
    }

    public BoardSquare getSquare(int col, int row) {
        return boardSquares[col][row];
    }
}

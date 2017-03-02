package EquableSolver;

/**
 * Represents the game board
 */
public final class Board {

    private BoardSquare[][] boardSquares;

    //Initialise the squares on the board
    public Board() {
        boardSquares = new BoardSquare[19][19];
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j <19; j++) {
                boardSquares[i][j] = new BoardSquare();
            }
        }
        boardSquares[0][0].setWordModifier(3);
        boardSquares[0][4].setLetterModifier(3);
        boardSquares[0][9].setWordModifier(3);
        boardSquares[0][14].setLetterModifier(3);
        boardSquares[0][18].setWordModifier(3);
        boardSquares[1][1].setLetterModifier(2);
        boardSquares[1][7].setLetterModifier(3);
        boardSquares[1][11].setLetterModifier(3);
        boardSquares[1][17].setLetterModifier(2);
        boardSquares[2][2].setLetterModifier(2);
        boardSquares[2][6].setLetterModifier(2);
        boardSquares[2][12].setLetterModifier(2);
        boardSquares[2][16].setLetterModifier(2);
        boardSquares[3][3].setLetterModifier(2);
        boardSquares[3][5].setWordModifier(2);
        boardSquares[3][9].setLetterModifier(3);
        boardSquares[3][13].setWordModifier(2);
        boardSquares[3][15].setLetterModifier(2);
        boardSquares[4][0].setLetterModifier(3);
        boardSquares[4][4].setLetterModifier(2);
        boardSquares[4][6].setWordModifier(3);
        boardSquares[4][12].setWordModifier(3);
        boardSquares[4][14].setLetterModifier(2);
        boardSquares[4][18].setLetterModifier(2);
        boardSquares[5][3].setWordModifier(2);
        boardSquares[5][5].setLetterModifier(2);
        boardSquares[5][9].setWordModifier(2);
        boardSquares[5][13].setLetterModifier(2);
        boardSquares[5][15].setWordModifier(2);
        boardSquares[6][2].setLetterModifier(2);
        boardSquares[6][6].setLetterModifier(3);
        boardSquares[6][8].setWordModifier(2);
        boardSquares[6][10].setWordModifier(2);
        boardSquares[6][12].setLetterModifier(3);
        boardSquares[6][16].setLetterModifier(2);
        boardSquares[7][1].setWordModifier(3);
        boardSquares[7][7].setWordModifier(2);
        boardSquares[7][7].setWordModifier(2);
        boardSquares[7][11].setWordModifier(2);
        boardSquares[7][17].setLetterModifier(3);
        boardSquares[8][6].setWordModifier(2);
        boardSquares[8][8].setLetterModifier(2);
        boardSquares[8][10].setLetterModifier(2);
        boardSquares[8][12].setWordModifier(2);
        boardSquares[9][3].setLetterModifier(3);
        boardSquares[9][5].setWordModifier(2);
        boardSquares[9][13].setWordModifier(2);
        boardSquares[9][15].setLetterModifier(3);
        boardSquares[10][6].setWordModifier(2);
        boardSquares[10][8].setLetterModifier(2);
        boardSquares[10][10].setLetterModifier(2);
        boardSquares[10][12].setWordModifier(2);
        boardSquares[11][1].setWordModifier(3);
        boardSquares[11][7].setWordModifier(2);
        boardSquares[11][7].setWordModifier(2);
        boardSquares[11][11].setWordModifier(2);
        boardSquares[11][17].setLetterModifier(3);
        boardSquares[12][2].setLetterModifier(2);
        boardSquares[12][6].setLetterModifier(3);
        boardSquares[12][8].setWordModifier(2);
        boardSquares[12][10].setWordModifier(2);
        boardSquares[12][12].setLetterModifier(3);
        boardSquares[12][16].setLetterModifier(2);
        boardSquares[13][3].setWordModifier(2);
        boardSquares[13][5].setLetterModifier(2);
        boardSquares[13][9].setWordModifier(2);
        boardSquares[13][13].setLetterModifier(2);
        boardSquares[13][15].setWordModifier(2);
        boardSquares[14][0].setLetterModifier(3);
        boardSquares[14][4].setLetterModifier(2);
        boardSquares[14][6].setWordModifier(3);
        boardSquares[14][12].setWordModifier(3);
        boardSquares[14][14].setLetterModifier(2);
        boardSquares[14][18].setLetterModifier(2);
        boardSquares[15][3].setLetterModifier(2);
        boardSquares[15][5].setWordModifier(2);
        boardSquares[15][9].setLetterModifier(3);
        boardSquares[15][13].setWordModifier(2);
        boardSquares[15][15].setLetterModifier(2);
        boardSquares[16][2].setLetterModifier(2);
        boardSquares[16][6].setLetterModifier(2);
        boardSquares[16][12].setLetterModifier(2);
        boardSquares[16][16].setLetterModifier(2);
        boardSquares[17][1].setLetterModifier(2);
        boardSquares[17][7].setLetterModifier(3);
        boardSquares[17][11].setLetterModifier(3);
        boardSquares[17][17].setLetterModifier(2);
        boardSquares[18][0].setWordModifier(3);
        boardSquares[18][4].setLetterModifier(3);
        boardSquares[18][9].setWordModifier(3);
        boardSquares[18][14].setLetterModifier(3);
        boardSquares[18][18].setWordModifier(3);
    }

    public void setBoardSquare(int col, int row, char symbol) {
        boardSquares[col][row].setContents(symbol);
    }

    public BoardSquare getSquare(int col, int row) {
        return boardSquares[col][row];
    }

    public int getBoardSize() {
        return boardSquares.length;
    }
}

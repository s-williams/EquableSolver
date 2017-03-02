package EquableSolver;

/**
 * Represents a single square on the board
 */
public final class BoardSquare {

    private char contents;
    private int wordModifier;
    private int letterModifier;

        public BoardSquare() {
        this.wordModifier = 1;
        this.letterModifier = 1;
    }

    public void setContents(char contents) {
        this.contents = contents;
    }

    public void setWordModifier(int wordModifier) {
        this.wordModifier = wordModifier;
    }

    public void setLetterModifier(int letterModifier) {
        this.letterModifier = letterModifier;
    }

    public char getContents() {
        return contents;
    }

    public int getWordModifier() {
        return wordModifier;
    }

    public int getScore() {
        int returnValue = Config.VALUES.get(contents);
        return returnValue * letterModifier;
    }
}

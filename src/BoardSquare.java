/**
 * Represents a single square on the board
 */
public final class BoardSquare {

    private char contents;
    private final int wordModifier;
    private final int letterModifier;

    public BoardSquare(int wordModifier, int letterModifier) {
        this.wordModifier = wordModifier;
        this.letterModifier = letterModifier;
    }

    public void setContents(char contents) {
        this.contents = contents;
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

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
        int returnValue = 0;
        switch (contents) {
            case '1':
                returnValue = returnValue + Config.ONE_SCORE;
                break;
            case '2':
                returnValue = returnValue + Config.TWO_SCORE;
                break;
            case '3':
                returnValue = returnValue + Config.THREE_SCORE;
                break;
            case '4':
                returnValue = returnValue + Config.FOUR_SCORE;
                break;
            case '5':
                returnValue = returnValue + Config.FIVE_SCORE;
                break;
            case '6':
                returnValue = returnValue + Config.SIX_SCORE;
                break;
            case '7':
                returnValue = returnValue + Config.SEVEN_SCORE;
                break;
            case '8':
                returnValue = returnValue + Config.EIGHT_SCORE;
                break;
            case '9':
                returnValue = returnValue + Config.NINE_SCORE;
                break;
            case '+':
                returnValue = returnValue + Config.PLUS_SCORE;
                break;
            case '-':
                returnValue = returnValue + Config.MINUS_SCORE;
                break;
            case '*':
                returnValue = returnValue + Config.TIMES_SCORE;
                break;
            case '÷':
                returnValue = returnValue + Config.DIVIDE_SCORE;
                break;
            case '/':
                returnValue = returnValue + Config.SLASH_SCORE;
                break;
            case '.':
                returnValue = returnValue + Config.DECIMAL_SCORE;
                break;
            case '=':
                returnValue = returnValue + Config.EQUALS_SCORE;
                break;
        }
        return returnValue * letterModifier;
    }
}

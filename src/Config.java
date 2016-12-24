import java.util.HashMap;
import java.util.Map;

/**
 * Stores the values of each of the pieces and the make up of the hand
 */
public final class Config {

    public static final int WHITES_PER_HAND = 7;
    public static final int BLUES_PER_HAND = 2;
    public static final int BROWNS_PER_HAND = 1;

    public static final int BOARD_SIZE = 19;

    public static final Map<Character, Integer> VALUES;
    static {
        VALUES = new HashMap<Character,Integer>();
        VALUES.put('1', 1);
        VALUES.put('2', 2);
        VALUES.put('3', 3);
        VALUES.put('4', 3);
        VALUES.put('5', 4);
        VALUES.put('6', 5);
        VALUES.put('7', 5);
        VALUES.put('8', 6);
        VALUES.put('9', 6);

        VALUES.put('+', 2);
        VALUES.put('-', 3);
        VALUES.put('*', 4);
        VALUES.put('÷', 10);
        VALUES.put('/', 15);
        VALUES.put('.', 10);

        VALUES.put('=', 1);
    }


}

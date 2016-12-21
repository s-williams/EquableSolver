/**
 * Solves Equable
 */
public class EquableSolver {
    private char[] hand;

    public EquableSolver() {

    }

    private boolean verifyEquation(String equation) {
        if (!equation.contains("=")) return false;

        String[] sections = equation.split("=", 2);

        int first = calculate(sections[0]);
        for (int i = 1; i < sections.length - 1; i++) {
            if (calculate(sections[i]) != first) return false;
        }
        
        return true;
    }

    private int calculate(String expression) {
        return 1;
    }
}

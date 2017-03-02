package EquableSolver;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.math.BigDecimal;

/**
 * Solves Equable
 */
public final class EquableSolver {
    private char[] hand;
    private Board board;
    private EquableSolverGUI equableSolverGUI;

    public EquableSolver() {
        board = new Board();
        equableSolverGUI = new EquableSolverGUI();
    }

    //Returns true if a mathematical equation is correct (e.g. 4=4) and false if equation is incorrect (e.g. 4=3)
    public boolean verifyEquation(String equation) {
        equation = equation.replaceAll("÷","/");
        if (!equation.contains("=")) return false;

        String[] sections = equation.split("=");

        try {
            int first = calculate(sections[0]);
            for (int i = 1; i < sections.length; i++) {
                if (calculate(sections[i]) != first) return false;
            }
        } catch (ScriptException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    //Calculates the result of a mathematical expression
    private int calculate(String expression) throws ScriptException {
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        return new BigDecimal(engine.eval(expression).toString()).intValue();
    }
}

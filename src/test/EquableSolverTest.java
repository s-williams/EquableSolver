package test;

import EquableSolver.EquableSolver;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for EquableSolver.java
 */
class EquableSolverTest {

    private static EquableSolver equableSolver;

    @BeforeAll
    static void setUp() {
        equableSolver = new EquableSolver();
    }

    @Test
    void verifyEquationTwoSidesTheSame() {
        assertTrue(equableSolver.verifyEquation("4=4"));
    }

    @Test
    void verifyEquationTwoSidesDifferent() {
        assertFalse(equableSolver.verifyEquation("4=3"));
    }

    @Test
    void verifyEquationPlusEqualsMultiple() {
        assertTrue(equableSolver.verifyEquation("3+3+3=3*3"));
    }

    @Test
    void verifyEquationDivideAndSlashAreTheSame() {
        assertTrue(equableSolver.verifyEquation("18/9=18÷9"));
    }

    @Test
    void verifyEquationDecimalPointsWork() {
        assertTrue(equableSolver.verifyEquation("7/2=3.5"));
    }

}
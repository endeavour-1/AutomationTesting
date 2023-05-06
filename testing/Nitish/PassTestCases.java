package Nitish;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PassTestCases {
    @Test
    public void testRealAndDistinctRoots() {
        double a = 1.0;
        double b = -5.0;
        double c = 6.0;

        double[] expected = { 3.0, 2.0 };
        double[] actual = QuadraticEquation.calculateRoots(a, b, c);
        assertArrayEquals(expected, actual, 0.001);
    }

    @Test
    public void testRealAndEqualRoots() {
        double a = 2.0;
        double b = -8.0;
        double c = 8.0;

        double[] expected = { 2.0, 2.0 };
        double[] actual = QuadraticEquation.calculateRoots(a, b, c);
        assertArrayEquals(expected, actual, 0.001);
    }

    @Test
    public void testImaginaryRoots() {
        double a = 2.0;
        double b = -3.0;
        double c = 5.0;

        double[] expected = {};
        double[] actual = QuadraticEquation.calculateRoots(a, b, c);
        assertArrayEquals(expected, actual, 0.001);
    }

    @Test
    public void testZeroCoefficients() {
        double a = 0.0;
        double b = 0.0;
        double c = 0.0;

        double[] expected = {};
        double[] actual = QuadraticEquation.calculateRoots(a, b, c);
        assertArrayEquals(expected, actual, 0.001);
    }

    @Test
    public void testOneCoefficientZero() {
        double a = 0.0;
        double b = 3.0;
        double c = 6.0;

        double[] expected = { -2.0 };
        double[] actual = QuadraticEquation.calculateRoots(a, b, c);
        assertArrayEquals(expected, actual, 0.001);
    }
}

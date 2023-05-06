package practical;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

class QuadraticEquation {

    public boolean hasRealRoots(int a, int b, int c) {
        if (b * b >= 4 * a * c) {
            return true;
        } else {
            return false;
        }
    }


public class PassCases {

    @Test
    public void testRealRoots1() {
        QuadraticEquation q = new QuadraticEquation();
        assertTrue(q.hasRealRoots(1, -5, 6));
    }

    @Test
    public void testRealRoots2() {
        QuadraticEquation q = new QuadraticEquation();
        assertTrue(q.hasRealRoots(-3, 6, -3));
    }

    @Test
    public void testRealRoots3() {
        QuadraticEquation q = new QuadraticEquation();
        assertTrue(q.hasRealRoots(1, 4, 4));
    }

    @Test
    public void testRealRoots4() {
        QuadraticEquation q = new QuadraticEquation();
        assertTrue(q.hasRealRoots(0, 5, 3));
    }

    @Test
    public void testRealRoots5() {
        QuadraticEquation q = new QuadraticEquation();
        assertTrue(q.hasRealRoots(2, 0, -8));
    }
}
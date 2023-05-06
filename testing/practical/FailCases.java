package practical;

import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class FailCases {

  @Test
  public void testImaginaryRoots() {
    // Create a new instance of QuadraticEquation
    QuadraticEquation q = new QuadraticEquation();
    // Use assertFalse to verify that the equation has no real roots
    assertFalse(q.hasRealRoots(2, 4, 5));
  }

  @Test
  public void testImaginaryRoots2() {
    // Create a new instance of QuadraticEquation
    QuadraticEquation q = new QuadraticEquation();
    // Use assertFalse to verify that the equation has no real roots
    assertFalse(q.hasRealRoots(3, 2, 7));
  }

  @Test
  public void testImaginaryRoots3() {
    // Create a new instance of QuadraticEquation
    QuadraticEquation q = new QuadraticEquation();
    // Use assertFalse to verify that the equation has no real roots
    assertFalse(q.hasRealRoots(1, 2, 2));
  }
}

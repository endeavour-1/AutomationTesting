package practical1;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestClassPass {

    @Test
    public void testValidPalindromeNumber() {
        int input = 1221;
        boolean expectedOutput = true;
        boolean actualOutput = PalindromeNumberChecker.checkIfPalindromeNumber(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testValidNonPalindromeNumber() {
        int input = 1234;
        boolean expectedOutput = false;
        boolean actualOutput = PalindromeNumberChecker.checkIfPalindromeNumber(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testPalindromeNumberWithLeadingZero() {
        int input = 1001;
        boolean expectedOutput = true;
        boolean actualOutput = PalindromeNumberChecker.checkIfPalindromeNumber(input);
        assertEquals(expectedOutput, actualOutput);
    }
}


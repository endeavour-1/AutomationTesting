package practical1;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestClassFail {

    @Test
    public void testInvalidNumberOutOfRange() {
        int input = 99999;
        boolean expectedOutput = false;
        boolean actualOutput = PalindromeNumberChecker.checkIfPalindromeNumber(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testInvalidNumberWithThreeDigits() {
        int input = 987;
        boolean expectedOutput = false;
        boolean actualOutput = PalindromeNumberChecker.checkIfPalindromeNumber(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testInvalidNumberWithRepeatedDigits() {
        int input = 1222;
        boolean expectedOutput = false;
        boolean actualOutput = PalindromeNumberChecker.checkIfPalindromeNumber(input);
        assertEquals(expectedOutput, actualOutput);
    }
}

package PracticalTask4;
//12008520_JayeshS
import org.junit.Test;





import static org.junit.Assert.*;

public class PrimeNumberCheckerTest {
	
    @Test
    public void testIsPrime() {
        // Test boundary from 1000-1999
    	
        for (int i = 1000; i < 2000; i++) {
            // Numbers must be of four digits
        	
            if (i < 1000 || i > 9999) {
                assertFalse(PrimeNumberChecker.isPrime(i));
            } else {
                boolean isPrime = true;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                assertEquals(isPrime, PrimeNumberChecker.isPrime(i));
            }
        }
    }
}


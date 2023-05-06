package Practical1Demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArmstrongNumberCheckerTest {

    @Test
    public void testIsArmstrongNumberPass() {
        assertEquals(true, ArmstrongNumberChecker.isArmstrongNumber(153));
        assertEquals(false, ArmstrongNumberChecker.isArmstrongNumber(370));
        assertEquals(true, ArmstrongNumberChecker.isArmstrongNumber(371));
        assertEquals(false, ArmstrongNumberChecker.isArmstrongNumber(947));
        assertEquals(false, ArmstrongNumberChecker.isArmstrongNumber(555));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testIsArmstrongNumberBoundaryFail1() {
        ArmstrongNumberChecker.isArmstrongNumber(99);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testIsArmstrongNumberBoundaryFail2() {
        ArmstrongNumberChecker.isArmstrongNumber(501);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testIsArmstrongNumberDigitFail() {
        ArmstrongNumberChecker.isArmstrongNumber(47);
    }
}

package Nitish18;

import org.junit.Test;
import static org.junit.Assert.*;



public class TestCasesLoginPage {
    
    @Test
    public void testUsernameNotStartingWithNumericOrSpecialCharOrSpace() {
        LoginPage loginValidator = new LoginPage();
        assertFalse(loginValidator.isValidUsername("1username"));
        assertFalse(loginValidator.isValidUsername("@username"));
        assertFalse(loginValidator.isValidUsername(" username"));
    }
    
    @Test
    public void testUsernameStartingWithUnderscore() {
    	LoginPage loginValidator = new LoginPage();
        assertTrue(loginValidator.isValidUsername("_username"));
    }
    
    @Test
    public void testMatchingUsernameAndPassword() {
    	LoginPage loginValidator = new LoginPage();
        assertTrue(loginValidator.isValidCredentials("username", "password"));
    }
    
    @Test
    public void testNotMatchingUsernameAndPassword() {
    	LoginPage loginValidator = new LoginPage();
        assertFalse(loginValidator.isValidCredentials("username", "wrongpassword"));
    }
    
   
    @Test
    public void testPasswordWithSpecialCharAndNumeric() {
    	LoginPage loginValidator = new LoginPage();
        assertFalse(loginValidator.isSecurePassword("password"));
        assertFalse(loginValidator.isSecurePassword("password@"));
        assertFalse(loginValidator.isSecurePassword("password123"));
        assertTrue(loginValidator.isSecurePassword("password@123"));
    }
    
}

package LoginPage;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestCases {

    @Test
    public void testValidUsernameStartsWithLetter() {
        String username = "johnDoe";
        boolean result = Login.isValidUsername(username);
        assertTrue(result);
    }
    
    @Test
    public void testValidUsernameStartsWithUnderscore() {
        String username = "_janeDoe";
        boolean result = Login.isValidUsername(username);
        assertTrue(result);
    }
    
    @Test
    public void testInvalidUsernameStartsWithNumeric() {
        String username = "123johnDoe";
        boolean result = Login.isValidUsername(username);
        assertFalse(result);
    }
    
    @Test
    public void testInvalidUsernameStartsWithSpecialCharacter() {
        String username = "$johnDoe";
        boolean result = Login.isValidUsername(username);
        assertFalse(result);
    }
    
    @Test
    public void testInvalidUsernameStartsWithSpace() {
        String username = " johnDoe";
        boolean result = Login.isValidUsername(username);
        assertFalse(result);
    }
    
    @Test
    public void testValidPassword() {
        String password = "myPass1$word";
        boolean result = Login.isValidPassword(password);
        assertTrue(result);
    }
    
    @Test
    public void testInvalidPasswordTooShort() {
        String password = "pass";
        boolean result = Login.isValidPassword(password);
        assertFalse(result);
    }
    
    @Test
    public void testInvalidPasswordNoSpecialSymbol() {
        String password = "mypassword123";
        boolean result = Login.isValidPassword(password);
        assertFalse(result);
    }
    
    @Test
    public void testInvalidPasswordNoNumeric() {
        String password = "myPass$word";
        boolean result = Login.isValidPassword(password);
        assertFalse(result);
    }
    
    @Test
    public void testValidLogin() {
        String username = "myusername";
        String password = "myPass1$word";
        boolean result = Login.authenticateUser(username, password);
        assertTrue(result);
    }
    
    @Test
    public void testInvalidLogin() {
        String username = "myusername";
        String password = "wrongpassword";
        boolean result = Login.authenticateUser(username, password);
        assertFalse(result);
    }
}


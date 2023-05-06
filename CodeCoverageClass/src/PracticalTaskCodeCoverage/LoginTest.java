package PracticalTaskCodeCoverage;

import org.junit.Test;
import static org.junit.Assert.*;

public class LoginTest {

    @Test
    public void testValidCredentials() {
        Login login = new Login();
        boolean result = login.authenticate("Administrator", "Abc12345");
        assertTrue(result);
    }

    @Test
    public void testInvalidUsername() {
        Login login = new Login();
        boolean result = login.authenticate("user", "Abc12345");
        assertFalse(result);
    }

    @Test
    public void testInvalidPasswordLength() {
        Login login = new Login();
        boolean result = login.authenticate("Administrator", "Abc1234");
        assertFalse(result);
    }

    @Test
    public void testInvalidPasswordNoNumber() {
        Login login = new Login();
        boolean result = login.authenticate("Administrator", "Abcdefgh");
        assertFalse(result);
    }

    @Test
    public void testInvalidPasswordNoLetter() {
        Login login = new Login();
        boolean result = login.authenticate("Administrator", "12345678");
        assertFalse(result);
    }

    @Test
    public void testInvalidPasswordNoLetterOrNumber() {
        Login login = new Login();
        boolean result = login.authenticate("Administrator", "**&&()()_+******");
        assertFalse(result);
    }
}


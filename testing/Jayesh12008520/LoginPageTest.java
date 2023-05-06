package Jayesh12008520;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Ignore;

public class LoginPageTest {
    
    @Test
    public void testUsernameNotStartingWithNumericOrSpecialCharOrSpace() {
        LoginPage loginPage = new LoginPage();
        assertFalse(loginPage.validateUsername("1username"));
        assertFalse(loginPage.validateUsername("@username"));
        assertFalse(loginPage.validateUsername(" username"));
    }
    
    @Test
    public void testUsernameStartingWithUnderscore() {
        LoginPage loginPage = new LoginPage();
        assertTrue(loginPage.validateUsername("_username"));
    }
    
    @Test
    public void testMatchingUidAndPwd() {
        LoginPage loginPage = new LoginPage();
        assertTrue(loginPage.validateCredentials("username", "password"));
    }
    
    @Test
    public void testNotMatchingUidAndPwd() {
        LoginPage loginPage = new LoginPage();
        assertFalse(loginPage.validateCredentials("username", "wrongpassword"));
    }
    @Ignore
    @Test
    public void testPasswordMinimumLength() {
        LoginPage loginPage = new LoginPage();
        assertFalse(loginPage.validatePassword("passwrd"));
        assertTrue(loginPage.validatePassword("password1"));
    }
    
    @Test
    public void testPasswordWithSpecialCharAndNumeric() {
        LoginPage loginPage = new LoginPage();
        assertFalse(loginPage.validatePassword("password"));
        assertFalse(loginPage.validatePassword("password@"));
        assertFalse(loginPage.validatePassword("password123"));
        assertTrue(loginPage.validatePassword("password@123"));
    }
    
}

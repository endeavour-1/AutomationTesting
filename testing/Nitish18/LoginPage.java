package Nitish18;

public class LoginPage {

    // Check if the entered username is valid
    public boolean isValidUsername(String username) {
        if (username.matches("[a-zA-Z_][a-zA-Z0-9_]*")) {
            return true;
        }
        return false;
    }

    // Check if the entered credentials are valid
    public boolean isValidCredentials(String username, String password) {
        if (username.equals("username") && password.equals("password")) {
            return true;
        }
        return false;
    }

    // Check if the entered password meets the security requirements
    public boolean isSecurePassword(String password) {
        if (password.length() < 8) {
            return false;
        } else if (!password.matches(".*\\d.*")) {
            return false;
        } else if (!password.matches(".*[@#$%&+=].*")) {
            return false;
        }
        return true;
    }
}

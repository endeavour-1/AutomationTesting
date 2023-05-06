package PracticalTaskCodeCoverage;

public class Login {
    public boolean authenticate(String username, String password) {
        if (username.equals("Administrator") && isValidPassword(password)) {
            return true;
        }
        return false;
    }

    private boolean isValidPassword(String password) {
        if (password.length() != 8) {
            return false;
        }
        boolean hasNumber = false;
        boolean hasLetter = false;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                hasNumber = true;
            } else if (Character.isLetter(c)) {
                hasLetter = true;
            }
        }
        return hasNumber && hasLetter;
    }
}


package LoginPage;

import java.util.Scanner;

public class SimpleLoginPage {

    public static void main(String[] args) {
        LoginPage loginPage = new LoginPage();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        if (!loginPage.isUsernameValid(username)) {
            System.out.println("Invalid username");
            return;
        }
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        if (!loginPage.isPasswordValid(password)) {
            System.out.println("Invalid password");
            return;
        }
        if (!loginPage.isLoginSuccessful(username, password)) {
            System.out.println("Login failed");
            return;
        }
        System.out.println("Login successful");
    }

}



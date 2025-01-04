package e07;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a password: ");
            String password = scanner.nextLine();

            if (isValidPassword(password)) {
                System.out.println("Password is valid.");
                break;
            } else {
                System.out.println("Password is invalid. Needs to be at least 8 characters long and include at least one uppercase letter, one lowercase letter, and one digit.");
            }
        }

        scanner.close();
    }

    private static boolean isValidPassword(String password) {
        if (password.length() < 8) {
            return false;
        }

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) hasUpper = true;
            if (Character.isLowerCase(c)) hasLower = true;
            if (Character.isDigit(c)) hasDigit = true;

            if (hasUpper && hasLower && hasDigit) {
                return true;
            }
        }

        return false;
    }
}


package e06;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Palindrome test, please enter some text: ");
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }

            String normalized = input.replaceAll("[^a-zA-Z]", "").toLowerCase();

            boolean isPalindrome = normalized.equals(new StringBuilder(normalized).reverse().toString());

            if (isPalindrome) {
                System.out.println(input + " is a palindrome");
            } else {
                System.out.println(input + " is not a palindrome");
            }
        }

        scanner.close();
    }
}

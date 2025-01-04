import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String name = scanner.nextLine();

        System.out.println("You entered: " + name);

        for (char letter : name.toCharArray()) {
            System.out.println(letter);
        }

        scanner.close();
    }
}

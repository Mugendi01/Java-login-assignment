import java.util.Scanner;

public class SimpleLoginProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctUsername = "Mugendi123";
        String correctPassword = "glomavin";
        int maxAttempts = 3;
        int attempts = 0;

        while (attempts < maxAttempts) {
            System.out.print("Enter username: ");
            String usernameInput = scanner.nextLine();

            System.out.print("Enter password: ");
            String passwordInput = scanner.nextLine();

            if (correctUsername.equals(usernameInput) && correctPassword.equals(passwordInput)) {
                System.out.println("Login successful!");
                break;
            } else {
                System.out.println("Login failed. Please try again.");
                attempts++;
            }
        }

        if (attempts == maxAttempts) {
            System.out.println("Maximum login attempts reached. Account locked.");
        }

        scanner.close();
    }
}

package wmsApp;
import java.util.Scanner;

public class UserAuthentication {

    public static void main(String[] args) {
        // Simulate user authentication
        if (authenticateUser()) {
            System.out.println("Authentication successful. You can access the system.");
        } else {
            System.out.println("Authentication failed. Access denied.");
        }
    }

    // Method to validate user credentials
    private static boolean authenticateUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        // Replace this with actual user database validation logic
        // For simplicity, we'll use hard-coded credentials for demonstration purposes
        if ("admin".equals(username) && "password123".equals(password)) {
            return true;
        } else {
            return false;
        }
    }
}

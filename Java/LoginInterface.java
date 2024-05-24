package Java;
import java.util.Scanner;

public class LoginInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] accounts = new String[3];
        int count = 0;

        while (true) {
            System.out.print("Enter your account name (or type 'new' to create a new account): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("new")) {
                if (count < accounts.length) {
                    System.out.print("Enter your account name: ");
                    accounts[count] = scanner.nextLine();
                    count++;
                } else {
                    System.out.println("Account limit reached. Cannot add more accounts.");
                }
            } else {
                boolean found = false;
                for (int i = 0; i < count; i++) {
                    if (accounts[i].equalsIgnoreCase(input)) {
                        System.out.printf("Welcome back, %s!%n", accounts[i]);
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Account not found. Please try again or create a new account.");
                }
            }

            System.out.print("Would you like to continue? (yes/no): ");
            String continueInput = scanner.nextLine();
            if (continueInput.equalsIgnoreCase("no")) {
                break;
            }
        }

        System.out.println("Final list of accounts: ");
        for (int i = 0; i < count; i++) {
            System.out.printf("Account %d: %s%n", i + 1, accounts[i]);
        }

        scanner.close();
    }
}

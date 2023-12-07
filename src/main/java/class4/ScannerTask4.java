package class4;

import java.util.Scanner;

public class ScannerTask4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user if they have a credit card
        System.out.print("Do you have a credit card? (yes/no): ");
        String hasCreditCard = scanner.nextLine().toLowerCase();

        if (hasCreditCard.equals("yes")) {
            // If the user has a credit card, ask for the balance
            System.out.print("Enter the balance on your credit card: ");
            double balance = scanner.nextDouble();

            if (balance > 1000) {
                System.out.println("You have a high balance. Please pay it off immediately.");
            } else {
                System.out.println("You can spend more. Enjoy your shopping!");
            }

        } else if (hasCreditCard.equals("no")) {
            // If the user does not have a credit card, offer them one
            System.out.println("You don't have a credit card. Would you like to apply for one?");
        } else {
            System.out.println("Invalid input. Please enter 'yes' or 'no' for having a credit card.");
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}



package class4;

import java.util.Scanner;

public class ScannerTask5 {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the number of worked years
        System.out.print("Enter the number of worked years: ");
        int workedYears = scanner.nextInt();

        // Ask the user to enter the annual salary
        System.out.print("Enter the annual salary: ");
        double annualSalary = scanner.nextDouble();

        // Check eligibility for the bonus
        if (workedYears >= 5) {
            // If eligible, calculate the bonus based on the annual salary
            double bonus;
            if (annualSalary > 50000) {
                bonus = 5000;
            } else {
                bonus = 3000;
            }

            // Print the result
            System.out.println("Congratulations! You are eligible for a bonus of $" + bonus);
        } else {
            // If not eligible, inform the user
            System.out.println("Sorry, you are not eligible for a bonus.");
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}

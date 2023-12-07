package class4;

import java.util.Scanner;

public class ScannerTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input the city
        System.out.print("Enter the city: ");
        String city = scanner.nextLine();

        // Ask the user to input the temperature in Fahrenheit
        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        // Close the scanner to prevent resource leak
        scanner.close();

        // Convert Fahrenheit to Celsius
        double celsius = (fahrenheit - 32) * 5 / 9;

        // Print the result
        System.out.println("The temperature in " + city + " is " + celsius + " degrees Celsius.");
    }
}


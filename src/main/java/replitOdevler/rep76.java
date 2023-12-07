package replitOdevler;

import java.util.Scanner;

public class rep76 {
    public static void main(String[] args) {
            // Creating a String array with size 7
            String[] daysOfWeek = new String[7];

            // Using Scanner to get user input
            Scanner scanner = new Scanner(System.in);

            // Asking the user to input days of the week
            for (int i = 0; i < daysOfWeek.length; i++) {
                System.out.println("Please enter day " + (i + 1) + " of the week:");
                daysOfWeek[i] = scanner.nextLine();
            }

            // Printing all values from the array
            for (String day : daysOfWeek) {
                System.out.println(day);
            }

            // Close the Scanner to avoid resource leak
            scanner.close();
        }
    }


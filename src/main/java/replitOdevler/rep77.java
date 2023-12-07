package replitOdevler;

import java.util.Scanner;

public class rep77 {
    public static void main(String[] args) {
        // Creating an array of integers with size 5
        int[] numbers = new int[5];

        // Using Scanner to get user input without prompt messages
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Printing the elements in reverse order
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
    }

package class8;

public class E2Arrays {
    public static void main(String[] args) {
        // Example array
        int[] numbers = {23, 45, 12, 67, 89, 34, 56, 78};

        // Find the maximum and minimum numbers in the array
        int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }

            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        // Print the results
        System.out.println("Array elements:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println("\nMaximum number: " + max);
        System.out.println("Minimum number: " + min);
    }}
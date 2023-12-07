package replitOdevler;

public class rep71 {
    public static void main(String[] args) {
        // Creating an array of integers
        int[] values = {45, 78, 12, 67, 55, 89, 23, 77, 88};

        // Printing values with even indices
        for (int i = 0; i < values.length; i += 2) {
            System.out.print(values[i] + " ");
        }
    }
}

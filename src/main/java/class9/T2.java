package class9;

public class T2 {
    public static void main(String[] args) {

        int[][] matrix = {
                {10, 20, 50},
                {25, 35, 66},
                {80, 90, 78, 45},
                {45, 55, 66},
        };
        for (int row = 0; row < matrix.length; row++) {
            int rowSum = 0; // Initialize sum for each row
            for (int col = 0; col < matrix[row].length; col++) {
                rowSum = rowSum + matrix[row][col];
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println("Sum of Row " + row + ": " + rowSum);
        }

        // Print the total sum of all elements
        int totalSum = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                totalSum = totalSum + matrix[row][col];
            }
        }
        System.out.println("Sum of all elements: " + totalSum);
    }
        }




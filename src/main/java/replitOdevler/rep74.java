package replitOdevler;

public class rep74 {
    public static void main(String[] args) {
        // Creating an array of integers
        int[] yearsArray = new int[11];

        // Adding the years 2010 to 2020 to the array
        int startYear = 2010;
        for (int i = 0; i < yearsArray.length; i++) {
            yearsArray[i] = startYear + i;
        }

        // Printing all values in separate lines
        for (int year : yearsArray) {
            System.out.print(year+" ");
        }
    }
}
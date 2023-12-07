package replitOdevler;

import java.util.Scanner;

public class rep36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the first string: ");
        String word1 = scanner.nextLine();

        System.out.print("Please enter the second string: ");
        String word2 = scanner.nextLine();

        System.out.print("Please enter the first number: ");
        int int1 = scanner.nextInt();

        System.out.print("Please enter the second number: ");
        int int2 = scanner.nextInt();

        if (int1 == int2 && word1.equals(word2)) {
            System.out.println("Output: AND");
        } else if (int1 == int2 || word1.equals(word2)) {
            System.out.println("Output: OR");
        } else {
            System.out.println("Output: NONE");
        }
    }
}


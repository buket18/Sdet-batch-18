package replitOdevler;

import java.util.Scanner;

public class rep64 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of end: ");
        int end = scanner.nextInt();

        int doubledEnd = 2 * end;

        for (int i = 0; i < doubledEnd; i++) {
            System.out.print(i + " ");
        }
    }
}


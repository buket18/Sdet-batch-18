package replitOdevler;

import java.util.Scanner;

public class rep65 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of x: ");
        int x = scanner.nextInt();

        int start = x-1;

        for (int i=x-1; i > 0; i--) {
            System.out.print(i + " ");
        }
    }
}

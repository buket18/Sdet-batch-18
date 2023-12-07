package replitOdevler;

import java.util.Scanner;

public class rep42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the roll number of the student: ");
        int rollNumber = scanner.nextInt();

        switch (rollNumber) {
            case 101:
                System.out.println("Student name: Ramesh");
                break;
            case 102:
                System.out.println("Student name: Mahesh");
                break;
            case 103:
                System.out.println("Student name: Mukesh");
                break;
            default:
                System.out.println("Not found Student name: in Class");
        }
    }
}

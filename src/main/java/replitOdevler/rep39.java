package replitOdevler;

import java.util.Scanner;

public class rep39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int marks = scanner.nextInt();

        char grade;
        if (marks >= 1 && marks <= 25) {
            grade = 'F';
        } else if (marks > 25 && marks <= 45) {
            grade = 'E';
        } else if (marks > 45 && marks <= 50) {
            grade = 'D';
        } else if (marks > 50 && marks <= 60) {
            grade = 'C';
        } else if (marks > 60 && marks <= 80) {
            grade = 'B';
        } else if (marks > 80) {
            grade = 'A';
        } else {
            System.out.println("Invalid input");
            return;
        }

        System.out.println("Your grade: " + grade);
    }
}

package class5;

import java.util.Scanner;
//Write a program that will read three inputs of scores (quiz, mid term, and final scores) and determine the grade based on the following rules:
//if the average score >=90 → grade=A
//if the average score >= 70 and <90 → grade=B
//if the average score>=50 and <70 → grade=C
//if the average score<50 → grade=F
public class quiz {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter quiz, mid-term, and final scores
        System.out.print("Enter the quiz score: ");
        double quizScore = scanner.nextDouble();

        System.out.print("Enter the mid-term score: ");
        double midTermScore = scanner.nextDouble();

        System.out.print("Enter the final score: ");
        double finalScore = scanner.nextDouble();

        // Calculate the average score
        double averageScore = (quizScore + midTermScore + finalScore) / 3;

        // Determine the grade based on the average score
        char grade;
        if (averageScore >= 90) {
            grade = 'A';
        } else if (averageScore >= 70 && averageScore < 90) {
            grade = 'B';
        } else if (averageScore >= 50 && averageScore < 70) {
            grade = 'C';
        } else {
            grade = 'F';
        }

        // Print the result
        System.out.println("The average score is: " + averageScore);
        System.out.println("The grade is: " + grade);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}

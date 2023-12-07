package replitOdevler;

import java.util.Scanner;

public class rep35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Do you need a loan? ");
        boolean loanNeed = scanner.nextBoolean();
        if (loanNeed = true) {
            System.out.println("what is your credit score?");
            int creditScore = scanner.nextInt();
            if (creditScore < 600) {
                System.out.println("eligibility:not eligible");
            } else if (creditScore >= 600 && creditScore <= 700) {
                System.out.println("eligibility:maybe eligible");
            } else if (creditScore >= 701 && creditScore <= 800) {
                System.out.println("eligibility:eligible");
            } else if (creditScore > 800) {
                System.out.println("eligibility:definitely eligible");
            } else {
                System.out.println("Unknown");
            }
        }
    }}

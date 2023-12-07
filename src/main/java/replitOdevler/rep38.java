package replitOdevler;

import java.util.Scanner;

public class rep38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Is it weekend? (true/false): ");
        boolean isWeekend = scanner.nextBoolean();

        String subject = (isWeekend) ? "Java" : "manual testing";

        System.out.println("Today you will be learning " + subject);
    }}


package replitOdevler;

import java.util.Scanner;

public class rep37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Are you thirsty? (true/false): ");
        boolean isThirsty = scanner.nextBoolean();

        System.out.print("Are you sleepy? (true/false): ");
        boolean isSleepy = scanner.nextBoolean();

        String drink;
        if (isThirsty && !isSleepy) {
            drink = "water";
        } else if (isThirsty && isSleepy) {
            drink = "coffee";
        } else if (!isThirsty && isSleepy) {
            drink = "tea";
        } else {
            drink = "nothing";
        }
        System.out.println("Recommended drink: " + drink);
    }
}

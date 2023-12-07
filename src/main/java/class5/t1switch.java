package class5;

import java.util.Scanner;

public class t1switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the country");
        String country = scanner.nextLine();
        switch (country) {
            case "Tajikistan":
                System.out.println("Tajik");
                break;
            case "Russia":
                System.out.println("Russian");
                break;
            case "Iran":
                System.out.println("Persian");
                break;
            case "Spain":
                System.out.println("spanish");
                break;
            case "Afghanistan":
                System.out.println("Farsi");
                break;
            default:
                System.out.println("Invalid country");
    }
}}

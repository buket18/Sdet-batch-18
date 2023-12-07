package replitOdevler;

import java.util.Scanner;

public class rep32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your gender: M or F");
        String gender = sc.nextLine();
        System.out.println("Please enter your age");
        int age = sc.nextInt();
        if (age>25 && gender.equals("F")) {
            System.out.println("Woman");}
        else if (age>25 && gender.equals("M")) {
            System.out.println("Man");}
        else if (age<25 && gender.equals("F")) {
            System.out.println("Girl");}

        else if (age<25 && gender.equals("M")) {
            System.out.println("Boy");
        }}}
package class5;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the current time");
        int hourNumber = sc.nextInt();

        if (hourNumber >= 1 && hourNumber <= 11) {
            System.out.println("morning");
        } else if (hourNumber >= 12 && hourNumber <= 15) {
            System.out.println("afternoon");
        } else if (hourNumber >= 16 && hourNumber <= 20) {
            System.out.println("evening");
        } else if (hourNumber >= 21 && hourNumber <= 24) {
            System.out.println("night");
        }else{
            System.out.println("invalid");
        }

    }
        }



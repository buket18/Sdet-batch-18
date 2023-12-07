package class4;

import java.util.Scanner;

public class ScannerTask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your age");
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("you can get a driver license");
        } else{
            System.out.println("you can get a learner license");
    }
}}

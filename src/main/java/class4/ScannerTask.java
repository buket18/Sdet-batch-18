package class4;

import java.util.Scanner;

public class ScannerTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the amount you need");
        double loanAmount=sc.nextDouble();
        if(loanAmount<=200000){
        System.out.println("you can get this");}
        else{
            System.out.println("we cant give it");
    }
}}
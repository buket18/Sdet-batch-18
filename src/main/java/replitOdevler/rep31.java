package replitOdevler;

import java.util.Scanner;

public class rep31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("is it sunny outside?");
        boolean isSunny=sc.nextBoolean();
        if(isSunny){
            System.out.println("it is a sunny day, I should go out");
            System.out.println("What is the temperature outside?");
            int temperature=sc.nextInt();
            if(temperature>85){
                System.out.println("I am going to the beach");}
            else{
                System.out.println("I am going to the park");}
        } else{
            System.out.println("I stay home and practice Java");
}}}

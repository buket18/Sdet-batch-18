package replitOdevler;

import java.util.Scanner;

public class rep22 {
    public static void main(String[] args) {
        System.out.println("Please Enter your first name");
        Scanner sc=new Scanner(System.in);
        String firstName=sc.nextLine();

        System.out.println("please enter your age");
        int age=sc.nextInt();

        Scanner scan=new Scanner(System.in);
        System.out.println("please enter mobile");
        double Mobile=scan.nextInt();

        System.out.println("your name is "+firstName+" your age is "+age+" your mobile number is "+Mobile );

    }
}

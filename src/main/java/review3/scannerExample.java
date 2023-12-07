package review3;

import java.util.Scanner;

public class scannerExample {

    public static void main(String[] args) {

     //datatype variable=value
     int num=12;
        System.out.println(num);

     Scanner input= new Scanner(System.in);
        System.out.println("lease enter today's month");

        String month=input.next();//next() captures one word

        System.out.println("Please enter today's date");
        int day=input.nextInt();

        System.out.println("Please enter today's year");
        int year=input.nextInt();

        System.out.println("Today is "+month+" "+day+", "+year);

        System.out.println("are you tired?");

        boolean istired=input.nextBoolean();
        System.out.println("I am tired "+istired);

        System.out.println("are you F or M");
        char gender=input.next().charAt(0);
        System.out.println(gender);
    }
}

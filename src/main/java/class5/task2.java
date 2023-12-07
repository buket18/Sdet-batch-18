package class5;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {{
            Scanner sc=new Scanner(System.in);
            System.out.println("please enter the number from 1 to 7");
            int dayNumber=sc.nextInt();

            if(dayNumber>=1&&dayNumber<=5) {
                System.out.println("weekday");
            }else if(dayNumber==6||dayNumber==7) {
                System.out.println("weekend");
            }else{
                System.out.println("invalid day");
            }
        }
    }
}


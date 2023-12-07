package review3;

import java.util.Scanner;

public class switchANDscanner {
    public static void main(String[] args) {
        Scanner capture=new Scanner(System.in);

        System.out.println("Please enter where you are");
        String country=capture.nextLine();

        switch (country){
            case "India":
                System.out.println("You love biriyani");
                break;
            case "Egypt":
                System.out.println("You love Koshary");
                break;
            case "Georgia":
                System.out.println("You love Hachapuri");
                break;
            case "Moldova":
                System.out.println("You love Mamaliga");
                break;
            case "Kazakhtan":
                System.out.println("You love Beshparmak");
                break;
            case "USA":
                    System.out.println("You love burger");
                    break;
            case "UK":
                System.out.println("You love fish and chips");
                break;
            default:
                System.out.println("I do not know your fav food");

        }
    }
}

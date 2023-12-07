package replitOdevler;

import java.util.Scanner;

public class rep44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your favorite car make: ");
        String carMake = scanner.nextLine();

        String carOrigin;
        switch (carMake) {
            case "bmw":
                carOrigin = "german car";
                break;
            case "toyota":
                carOrigin = "japanese car";
                break;
            case "maserati":
                carOrigin = "italian car";
                break;
            default:
                carOrigin = "unknown";
        }

        System.out.println("The car's origin is: " + carOrigin);
    }
}

package review2;

public class AselOdev2 {
    public static void main(String[] args) {
        double morgageRate = 1.9;
        double morgagePrice = 200000;
        if (morgageRate > 4.5) {
            System.out.println("user will not buy a house");
        }else if (morgageRate<=4.5){
            System.out.println("you will buy a house");
        }if (morgagePrice>100000) {
            System.out.println("you need to take a loan");}
        else{
            System.out.println("you will buy cash");}

    }
}

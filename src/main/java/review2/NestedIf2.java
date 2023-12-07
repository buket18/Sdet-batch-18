package review2;

public class NestedIf2 {
    public static void main(String[] args) {


        boolean isFriday=false;
        int day=13;
//ayin 13 uyse korkunc film izlicez, ugursuz gun ya:)
        if(isFriday) {
            System.out.println("movie night");

            if (day==13){System.out.println("let's watch a scary movie");}
            else {System.out.println("let's watch something funny");}

            } else {
            System.out.println("no movies, go back to studies");}
    }
}

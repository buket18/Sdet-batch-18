package review2;

public class NestedIf {
    public static void main(String[] args) {
        //nested if = if statement inside another if statement

        /*
        if (condition) {
        if (condition) {
        }
        }

         */

        boolean allergy=true;
        String allergyType="dairy";

        if(allergy) { //outer if
            System.out.println("let's check what kind of allergy you have");
        if(allergyType.equals("peanut")) { //nested if
            System.out.println("please avoid food that contains peanuts");}
            else if (allergyType.equals("dairy")) {
            System.out.println("Please avoid the food with dairy");}
            else if(allergyType.equals("pollen")) {
            System.out.println("please stay indoor");}

    }}}

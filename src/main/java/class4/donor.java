package class4;

public class donor {
    public static void main(String[] args) {


        int age=30;
        double weight=190;

        if(age>=18) {

            if(weight>=110) {
                System.out.println("you are eligible for donating");
            }
        }else {
            System.out.println("We can not accept such a patient");
        }
    }
}


package class4;

public class E2NestedIfCon {
    public static void main(String[] args) {

        double budget = 25000;
        String engineType = "petrol";
        if (budget >= 50000) {

            if (engineType.equals("electric")) {
                System.out.println("I want to buy a tesle");
            } else if (engineType.equals("Hybrid")) {
                System.out.println("I want to buy a toyota");
            } else {
                System.out.println("I want to buy a porche");
            }

        } else if (budget >= 30000) {
            if (engineType.equals("electric")) {
                System.out.println("I want to buy byd");
            } else if (engineType.equals("Hybrid")) {
                System.out.println("i want to buy camry");
            } else {
                System.out.println("hundai sonata");
            }
        }else if(budget>=20000){
            if(engineType.equals("electric")){
                System.out.println("nissan leaf");
            }else if(engineType.equals("Hybrid")) {
                System.out.println("kia");
            }else{
                System.out.println("honda civic");
            }
        }else{
                System.out.println("lets save more");}
    }}
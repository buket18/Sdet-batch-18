package class4;

public class task2 {
    public static void main(String[] args) {
        int num1 = 10, num2 = 20, num3 = 30;


        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("num1 is the largest " + num1);
            }
        }else{
            if(num2>num3) {
                System.out.println("num2 is the largest " + num2);
            }else{
                System.out.println("num3 is the largest "+num3);
            }


        }
    }
}
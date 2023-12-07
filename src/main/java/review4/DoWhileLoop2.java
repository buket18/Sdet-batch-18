package review4;

public class DoWhileLoop2 {
    public static void main(String[] args) {
        int n = 0;
        do {
            n += 2;
            System.out.println("Hello " + n);

        } while (n <= 10);

        System.out.println(".......another way.........");


        int a = 2;
        do {
            if (a % 2 == 0) {
                System.out.print(a + " ");
                a++;
            }
        }while(a<=10);
        System.out.println("end of the program");
    }

}


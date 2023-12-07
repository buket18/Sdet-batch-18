package review4;

public class DoWhileLoop {
    public static void main(String[] args) {
        //do while when we do NOT know in advance
        //how many times we want to repeat the block of code

        /* while VS do while
        in do while block of code will be executed at least once even one condition is true
         */

        // I want to say hello 4 times

        int n=1;
        do {
            System.out.println("Hello ");
            n++;
        } while(n>=4);

        System.out.println(n);
    }
}

package review4;

public class nestedLoop {
    public static void main(String[] args) {


        for (int i = 1; i <= 3; i++) {//outer loop
            System.out.println("hello");

            for (int j = 1; j < 3; j++) { //inner loop
                System.out.println("bye");
            }
        }


        System.out.println("....................");

        for (int i = 1; i <= 3; i++) {//outer loop
            System.out.println("hello");

            for (int j = 1; j > 3; j++) { //inner loop
                System.out.println("bye");
            }
        }


        System.out.println("................");
        for (int i = 1; i >= 3; i++) {//outer loop
            System.out.println("hello");

            for (int j = 1; j > 3; j++) { //inner loop
                System.out.println("bye");
            }
        }

        System.out.println(";;;;;;;;;;;;;;");

        for (int i = 1; i <= 3; i--) {//outer loop is infinite
            System.out.println("hello");

            for (int j = 1; j < 3; j++) { //inner loop
                System.out.println("bye");

            }
        }
       /* System.out.println(";;;;;;;;;;;;;;");

        for (int i = 1; i <= 3; i++) {//outer loop is infinite
            System.out.println("hello");

            for (int j = 1; j < 3; j--) { //inner loop
                System.out.println("bye"+i +" "+j);*/

        for(int a=0; a<=9; a++){
            for(int b=0; b<=9; b++){
                System.out.println(a+" "+b);
            }
        }
            }
        }


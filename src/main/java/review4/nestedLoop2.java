package review4;

public class nestedLoop2 {
    public static void main(String[] args) {
        for (int a = 0; a <= 9; a++) {
            for (int b = 0; b <= 9; b++) {
                for(int c=0; c<=9; c++){
                System.out.println(a + " " + b+" "+c);
            }
                System.out.println("multiplication table");

                for(int i=1; i<=10; i++){
                    for (int j=1; j<=10; j++){
                        System.out.println(i+" * "+j+" = "+(i*j));
                    }
                    System.out.println("..........................");
                }

        }
    }
    }
}

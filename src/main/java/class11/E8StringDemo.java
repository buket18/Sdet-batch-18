package class11;

public class E8StringDemo {
    public static void main(String[] args) {
        String str="Today is Saturday";
        //print the all the index of letters 'a' from above string

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='a'){
                System.out.println(i);
            }

        }
    }
}

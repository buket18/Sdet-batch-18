package class12;

public class t2 {
    public static void main(String[] args) {
        String str="ajhsdfkfjdGHJKJHJK1234567=!@£$%%";
        System.out.println(str.replaceAll("[^A-Za-z]","").length());
    }
}

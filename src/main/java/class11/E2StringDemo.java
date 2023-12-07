package class11;

public class E2StringDemo {
    public static void main(String[] args) {
        //creating an object of String class
        String str=" ";
        //String str2="Batch 18"; //same with the next line just shorter
        String str2=new String("Batch 18");
        System.out.println(str.length());
        System.out.println(str2.length());

        boolean isEmpty=str.isEmpty();
        System.out.println(isEmpty);


    }
}

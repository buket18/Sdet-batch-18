package class11;

public class E1StringDemo {
    public static void main(String[] args) {

        //Create the object of that class
        /*String => is the data type
        str=>variable name
        new String()=> creating the object of the String
         */
        String str=new String("Hello World");
        //calling the length method using the str object
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        //we can store the results of a method as well
        String upper=str.toUpperCase();
        System.out.println(upper);
        System.out.println(str.toLowerCase());
        System.out.println(str.concat(" hello batch 18"));
        System.out.println(str+" hello batch 18");


    }
}

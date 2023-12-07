package class12;

public class E1StringDemo {
    public static void main(String[] args) {
        String str="It is Savera's birthday today.It is Sunday. Today is Java class";
        String [] strArr=str.split("[.]");
        System.out.println(strArr.length); //3
        System.out.println(strArr[2].trim());
    }
}

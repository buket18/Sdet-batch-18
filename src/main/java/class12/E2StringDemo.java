package class12;

public class E2StringDemo {
    public static void main(String[] args) {
        String str="It is Savera's birthday today.It is Sunday. Today is Java class";
        String [] wordArr=str.split(" ");
        System.out.println(str);
        System.out.println(wordArr.length);
        System.out.println(wordArr[0]);

    }
}

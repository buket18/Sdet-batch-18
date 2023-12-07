package class12;

public class t6 {
    public static void main(String[] args) {
        String str="mom";
        String reversedWord="";
        for(int i=str.length()-1; i>=0; i--){
            reversedWord=reversedWord+str.charAt(i);
        }
        if(str.equalsIgnoreCase(reversedWord)){
            System.out.println("it is a plaindrome");
        }else{
            System.out.println("it is not a palindrome");
    }
}}

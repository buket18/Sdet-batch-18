package class12;

public class t5 {
    public static void main(String[] args) {
        // Create a string
        String originalString = "this is the sentence I want to reverse";

        // Print the original string
        System.out.println("Original String: " + originalString);

        // Reverse the string and print it
        String reversedString = new StringBuilder(originalString).reverse().toString();
        System.out.println("Reversed String: " + reversedString);}}


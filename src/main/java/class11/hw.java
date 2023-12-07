package class11;

public class hw {
    public static void main(String[] args) {
        // Create a string
        String originalString = "Sunday";

        // Print the original string
        System.out.println("Original String: " + originalString);

        // Reverse the string and print it
        String reversedString = new StringBuilder(originalString).reverse().toString();
        System.out.println("Reversed String: " + reversedString);}}

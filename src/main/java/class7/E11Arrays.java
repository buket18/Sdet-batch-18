package class7;

public class E11Arrays {
    public static void main(String[] args) {
        int[] numbers = {10, 23, 34, 45, 56};
        int sum = 0;

        for (int i=0; i<5; i++)
        {
            sum = sum+numbers[i];
        }
        System.out.println(sum);

    }
}

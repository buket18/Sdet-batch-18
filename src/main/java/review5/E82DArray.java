package review5;

public class E82DArray {
    public static void main(String[] args) {
        int [][] numbers={
                {10,20,30,40},
                {20,40,60,80},
                {30,60,90,120},
        };
        //getting back complete 1d array from 2d array
       int[] row0 =numbers[0];
       //getting back individual number from 2d array
       int num=numbers[2][2];
        System.out.println(num);

    }
}

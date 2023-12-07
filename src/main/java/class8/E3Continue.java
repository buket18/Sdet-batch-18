package class8;

public class E3Continue {
    public static void main(String[] args) {
        int[] numbers={10,45,12,47,20,30};
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]%2!=0){
                continue;// whenever the condition is true continue will execute and go back
                // to the loop. when the condition is true continue
                // will skip everything after continue.(they should have call it skip actually)
            }
            System.out.println(numbers[i]);
        }
    }
}

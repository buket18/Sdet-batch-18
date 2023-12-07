package class6;

import java.util.Scanner;

public class E12scannerandLoop {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("please enter the starting point");
        int start=sc.nextInt();
        System.out.print("please enter the end");
        int end=sc.nextInt();
        while(start<=end){
            System.out.print(start+" ");
            start++;
        }
    }
}

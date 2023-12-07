package class5;

public class E5LogOpe {
    public static void main(String[] args) {
        boolean is4GAvbl=false;
        boolean isWifiAvbl=false;

        if(isWifiAvbl||is4GAvbl){
            System.out.println("you can browse the internet");
        }else{
            System.out.println("cant use internet");
        }
    }
}

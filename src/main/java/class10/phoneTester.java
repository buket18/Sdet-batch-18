package class10;

public class phoneTester {
    public static void main(String[] args) {
        phone iphone=new phone();
        iphone.make="apple";
        iphone.color="white";
        iphone.model="15 pro max";
        iphone.price=1200;
        System.out.println(iphone.make);
        System.out.println(iphone.color);
        System.out.println(iphone.model);
        System.out.println(iphone.price);

        iphone.takePic();
        iphone.call();
        iphone.playVideos();



    }
}

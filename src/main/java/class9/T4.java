package class9;

public class T4 {
    public static void main(String[] args) {
        //using 2d array create a grocery list. inside you should have an array of veggies,
        // fruits, dairy and sweets. Retrieve all values from that array using 2 different loops

        String[][] list = {
                {"broccoli", "beans", "tomatoes", "pepper"},
                {"blueberry", "watermelon", "strawberry", "mango"},
                {"milk", "cheese", "yogurth", "kefir"},
                {"lollipop", "chocolate", "chewinggum", "marshmellow"}
        };
        for(int i=0;i<list.length;i++){
            for (int j = 0; j < list[i].length; j++) {
                System.out.print(list[i][j]+" ");
            }
            System.out.println();

            }

        System.out.println( );
        }

        }


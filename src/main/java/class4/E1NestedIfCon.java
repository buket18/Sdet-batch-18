package class4;

public class E1NestedIfCon {
    public static void main(String[] args) {
        boolean isMainDoorOpened = true;
        boolean isRoom1Opened = true;
        boolean isRoom2Opened = true;

        if (isMainDoorOpened) {
            if (isRoom1Opened) {System.out.println("we are in room1");
            } else {System.out.println("room 1 is closed");}
        }
        if(isRoom2Opened) {
            System.out.println("we are in room2");
        }else{System.out.println("Can't enter the house main door is closed");
        }
        }
    }
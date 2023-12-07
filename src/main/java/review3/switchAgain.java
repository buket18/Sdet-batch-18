package review3;

public class switchAgain {
    public static void main(String[] args) {


        char choice='y';
        switch(choice){

            case 'y':
                System.out.println("means Yes");
                break;
            case 'n':
                System.out.println("means No");
                break;
            case 'm':
                System.out.println("means Maybe");
                break;
            default:
                System.out.println("I do not understand you");

        }
    }
}

package review3;

public class SwitchSta {
    public static void main(String[] args) {


        /*
        switch (variable) {

        case value1:
            code to execute;
            break;
        case value2:
            code to execute;
            break;
            }
         */

        int electionYear=2020;

        switch (electionYear) {
            case 2020:
                System.out.println("President is Biden");
                break;
            case 2016:
                System.out.println("President is Trump");
                break;
            case 2012:
                System.out.println("Presiden is Obama");
                break;
            default:
                System.out.println("President is unknown");
        }
    }
}

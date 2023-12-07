package Review1;

public class E3stringConcat {
    public static void main(String[] args) {
        String houseNo="H#295";
        String streetNo="Abc123";
        String state="Newyork";
        String country="USA";
        String space=" ";
        String completeAddress=houseNo+space+streetNo+space+state+space+country;
        System.out.println(houseNo+" "+streetNo+" "+state+" "+country);
        System.out.println(completeAddress);

    }
}

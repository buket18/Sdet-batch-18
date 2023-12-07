package class12;

public class t4 {
    public static void main(String[] args) {
        String fatherName="Carlos";
        String motherName="Tina";
        boolean isBoy=false;

        if(isBoy){
            String FatherFirstPart=fatherName.substring(0,fatherName.length()/2);
            String MotherLastPart=motherName.substring(motherName.length()/2,motherName.length());
            System.out.println(FatherFirstPart.trim()+MotherLastPart.trim());

        }else {
            String motherFirstPart=motherName.substring(0,motherName.length()/2);
            String fatherLastPart=fatherName.substring(fatherName.length()/2,fatherName.length());
            System.out.println(motherFirstPart.trim()+fatherLastPart.trim());
        }


    }
}

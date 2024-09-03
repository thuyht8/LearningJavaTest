package BAI_12_PHAMVITRUYCAP.HamXayDung;

public class XayDung {
    int age = 33;
    String phone = "12334";

    public String getPhone (){
        return phone;
    }

    public static void main(String[] args) {
        XayDung xd = new XayDung();
        System.out.println(xd.getPhone());
    }

}
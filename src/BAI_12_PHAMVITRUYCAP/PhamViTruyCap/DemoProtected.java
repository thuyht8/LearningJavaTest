package BAI_12_PHAMVITRUYCAP.PhamViTruyCap;

public class DemoProtected{

    protected String school = "Sơn Dương";
    protected String address = "Tuyên Quang";

    protected static void sayHello (){
        System.out.println("hello VietNam");
    }

    protected static void welcome (String name){
        System.out.println(name);
    }

    protected String getInfomation (){
        return school;
    }

    public static void main(String[] args) {
        DemoProtected demoProtected = new DemoProtected();
        System.out.println(demoProtected.school);
        System.out.println(demoProtected.address);
        System.out.println(demoProtected.getInfomation());

        sayHello();
        welcome("Hà");
        welcome("Thúy");
    }

}

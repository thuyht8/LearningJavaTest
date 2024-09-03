package BAI_13_STATIC;

public class DemoHamStatic {

    public String school;
    public int caseId;
    public static String className = "vien dh mo ha noi";

    public static void getInfo (){
        System.out.println(className);//biến static

        DemoHamStatic demoHamStatic = new DemoHamStatic();
        System.out.println(demoHamStatic.school);//biến thông thường
        System.out.println(demoHamStatic.caseId);
    }
}


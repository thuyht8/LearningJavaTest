package BAI_TAP_VE_NHA;

public class Bai_3_ThongTinTest {
    public static String name = "Thuyht8";
    public static int age = 30;
    public static String school = "THPH Sơn Dương";
    public static String method = "GET";
    int point = 8;

    public static void main(String[] args) {
        boolean female = true;
        Bai_3_ThongTinTest sv = new Bai_3_ThongTinTest();

        System.out.println(sv.point);

        if (age < 30) {
            System.out.println("U20");
        } else {
            System.out.println("U30");
        }

        if (name.equals("Thuyht8")){
            System.out.println("Ha Thi Thuy");
        }

        switch (method){
            case "POST":
                System.out.println("run 1");
                break;
            case "PUT":
                System.out.println("run 2");
                break;
            case "DELETE":
                System.out.println("run 3");
                break;
            default:
                System.out.println("run4");
                break;
        }
    }
}

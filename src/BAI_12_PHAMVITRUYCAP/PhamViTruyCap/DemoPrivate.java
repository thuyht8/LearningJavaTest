package BAI_12_PHAMVITRUYCAP.PhamViTruyCap;

public class DemoPrivate {

    private String testcaseKey = "A111";
    private String testcaseName = "Tạo mới bond thành công";

    private void showInfo (){
        System.out.println("Run");
    }

    public static void main(String[] args) {
        DemoPrivate pv = new DemoPrivate();
        System.out.println(pv.testcaseKey);
        System.out.println(pv.testcaseName);
        pv.showInfo();
    }
}

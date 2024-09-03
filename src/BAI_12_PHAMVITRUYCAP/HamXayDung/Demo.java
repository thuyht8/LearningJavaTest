package BAI_12_PHAMVITRUYCAP.HamXayDung;

import java.io.FilterOutputStream;

public class Demo {
    String ten;
    int tuoi;
    String diachi;

    public void info (String ten, int tuoi, String diachi){
        this.ten = ten;
        this.tuoi = tuoi;
        this.diachi = diachi;

        System.out.println(ten);

    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.info("Thuy", 33, "Tuyen Quang");
    }
}

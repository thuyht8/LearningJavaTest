package BAI_12_PHAMVITRUYCAP.PhamViTruyCap;

import BAI_12_PHAMVITRUYCAP.HamXayDung.XayDung;

//từ khóa extends đại diện cho sự kế thừa
public class DemoThongTin extends XayDung {
    public static void main(String[] args) {
        DemoDefault demoDefault = new DemoDefault();
        System.out.println(demoDefault.age);

        DemoProtected demoProtected = new DemoProtected();
        System.out.println(demoProtected.address);

        DemoThongTin demoThongTin = new DemoThongTin();
        demoThongTin.getPhone();//gọi đc phạm vi protected khác package khi kế thừa

    }
}

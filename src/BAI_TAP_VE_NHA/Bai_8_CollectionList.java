package BAI_TAP_VE_NHA;

import java.util.ArrayList;
import java.util.List;

public class Bai_8_CollectionList {
    public static void main(String[] args) {

        List<String> thongtin = new ArrayList<>();
        thongtin.add("Dau");
        thongtin.add("1.5 tuoi");
        thongtin.add("Tuyen Quang");

        for (String i : thongtin){
            System.out.println(i);
        }


    }
}

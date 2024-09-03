package BAI_10_THUOCTINH_PHUONGTHUC;

public class ThuocTinh {
    //thuộc tính nằm ngoài phương thức (hàm main); thuộc lớp (class ThuocTinh);
    //cú pháp: [khả_năng_truy_cập] kiểu_thuộc_tính tên_thuộc_tính [= giá_trị_ban_đầu];
    //khả_năng_truy_cập: private; public; protected (phạm vi truy cập)

    //khai báo thuộc tinh tên là name có phạm vi truy cập
    private String name = "HA THI THUY";
    public int age = 33;
    protected String address = "HA NOI";

    //thộc tính
    final float PI = 3.14f;
    float r;
    float cv;
    float dt;

    public static void main(String[] args) {

    }
    void tinhChuvi(){
        //biến
        float banKinh = 10;
        cv = 2 * PI * banKinh;
    }
}

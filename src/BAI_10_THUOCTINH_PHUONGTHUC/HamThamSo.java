package BAI_10_THUOCTINH_PHUONGTHUC;

public class HamThamSo {

    //khai báo hàm có 2 tham số vs kiểu dữ lệu tương ứng
    public static int cong2SoNguyen (int number1, int number2){
        return number1 + number2;
    }
    //khai báo hàm có 2 tham số vs nhiều kiểu dữ lệu
    public static void showInFo (String name, int age, String address){
        System.out.println(name);
        System.out.println(age);
        System.out.println(address);

    }

    public static float tínhDienTich (float chieuDai, float chieuRong){
        return (chieuDai * chieuRong) / 2;
    }

    public static void main(String[] args) {
        System.out.println(cong2SoNguyen(5, 10));
        showInFo("Thuy", 33, "Ha Noi");
        showInFo("Đậu", 18, "Đống Đa");
        showInFo("Tuấn Anh", 32, "Hà Nội");
        System.out.println(tínhDienTich(25, 5));
    }
}

package BAI_10_THUOCTINH_PHUONGTHUC;

import java.util.ArrayList;

public class PhuongThuc_cach1 {

    static void sayHello (){
        System.out.println("Hello VietNam");
    }

    public static float chieuDai(){
        return 15.5f;
    }

    public static int chieuRong(){
        return 10;
    }

    public static float tínhDienTich (){
        return (chieuDai () * chieuRong ()) / 2;
    }

    //
    public ArrayList <Integer> tinhSoChan (int number){//(int number): khai báo tên tham số tương ứng kiểu dữ liệu nguyên thủy - đối tượng
        ArrayList <Integer> arrayList = new ArrayList();
        for (int i = 0; i <= number; i++){
            if (i % 2 == 0){
                arrayList.add(i);
            }
        }
        return arrayList;
    }

    //cách goi sử dụng phương thức - hàm nay có từ khóa static
    public static void main(String[] args) {
        sayHello();
        System.out.println(tínhDienTich());

        //in giá trị số chẵn từ arrayList trong hàm tim tinhSoChan
        PhuongThuc_cach1 demo1 = new PhuongThuc_cach1();
        demo1.tinhSoChan(50);
        for (int soChan : demo1.tinhSoChan(50)){
            System.out.println(soChan);
        }
    }
}

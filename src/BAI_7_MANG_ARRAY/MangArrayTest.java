package BAI_7_MANG_ARRAY;

public class MangArrayTest {
    //dataType[] array;khai báo biến
    //dataType []array;
    //dataType array[];thường dùng dạng này

//cú pháp: dataType array[] = new dataType[size];
//        <kiểu dữ liệu> <tên mảng_đặt giống tên biến>[] = new <kiểu dữ liệu>[kích thước, độ dài];
//mảng bắt đầu là 0: ví dụ  a[0];

    public static void main(String[] args) {
        String sinhvienArray[] = new String[3];
        //gán giá trị cho mảng
        sinhvienArray[0] = "Thuy";
        sinhvienArray[1] = "Tuan Anh";
        sinhvienArray[2] = "Dau";

        System.out.println(sinhvienArray[1]);
        System.out.println(sinhvienArray[2]);
        System.out.println("size = " + sinhvienArray.length);

        for (int i = 0; i < sinhvienArray.length; i++) {
            System.out.println(sinhvienArray[i]);
        }
        System.out.println("======================");
        String svArray[] = new String[5];
        //gán giá trị mảng 1 cho mảng 2
        for (int i = 0; i < sinhvienArray.length; i++) {
            svArray[i] = sinhvienArray[i];
        }
        for (int i = 0; i < svArray.length; i++) {
            System.out.println(svArray[i]);
        }
    }
}

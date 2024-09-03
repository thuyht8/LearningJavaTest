package BAI_TAP_VE_NHA;

import java.util.Scanner;

class SinhVien{
    String name = "Tuan";
    int age = 32;

    public void display() {//phương thức dùng để hiển thị thông tin của đối tượng ra màn hình
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public void getInformation (){//phương thức dùng để nhập dữ liệu cho thuộc tính name và age từ bàn phím
        Scanner sc = new Scanner(System.in);
        name = sc.next();
        age = sc.nextInt();
    }

        public static void main(String[] args) {
            SinhVien svafter = new SinhVien();
            svafter.display();

    }
}


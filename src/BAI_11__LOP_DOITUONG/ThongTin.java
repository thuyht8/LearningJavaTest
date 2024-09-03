package BAI_11__LOP_DOITUONG;

public class ThongTin {
    float vat = 10;
    double hocphi = 1500000;
    long l = (long) hocphi;
    int i = (int) l;

    public double getVat (){
        return vat;
    }

    public double getHocphi (){
        return hocphi;
    }

    public static void main(String[] args) {
//        Student sv1 = new Student();
//        sv1.getInfo();

        ThongTin tt1 = new ThongTin();//khai báo và khởi tạo giá trị cho lớp Thông tin
        System.out.println(tt1.getHocphi());
        System.out.println(tt1.getVat());
    }
}


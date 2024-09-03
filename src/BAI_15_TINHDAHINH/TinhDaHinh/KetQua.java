package BAI_15_TINHDAHINH.TinhDaHinh;

public class KetQua {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.tinhTong(4, 6));
        System.out.println(calculator.phepNhan(5, 7));
        System.out.println(calculator.tinhTong(10,1,7));
        System.out.println(calculator.phepNhan(3,4,5));
    }
}

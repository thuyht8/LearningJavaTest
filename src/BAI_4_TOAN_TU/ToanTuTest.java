package BAI_4_TOAN_TU;

public class ToanTuTest {
    public static void main(String[] args) {
        float a = 35.8f;
        int b = (int) a + 1;

        System.out.println(a);
        System.out.println(b);
        System.out.println((int) a);

        //kiểu số -> dạng chuôi
        String number = String.valueOf(b);

        //kiểu chữ -> dạng số
        System.out.println(Integer.parseInt(number));
    }
}

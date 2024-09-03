package BAI_9_XU_LY_CHUOI;

public class DemoString {
    public static void main(String[] args) {
        String name = "Hà Thị Thúy";

        //cách 1
        //"Automation test".toUpperCase();
        System.out.println("Automation test".toUpperCase());

        //cách 2
        String name1 = "Automation test".toUpperCase();
        System.out.println(name1);
        System.out.println(name1.length());//độ dài chuỗir
        System.out.println(name1.trim().toLowerCase());//bỏ khoảng trắng đầu và cuối

        //Một hằng chuỗi chỉ đơn giản là một chuỗi trực tiếp
        // được đặt trong dấu ngoặc kép, không cần thông qua một biến để lưu trữ
        System.out.println("BondTempIs".replace("BondTempIs", "bondTempIs"));

        String fullName = "HỌ VÀ TÊN: " + name1;
        System.out.println(fullName);

        String str1 = "Khóa học Automation Testing";
        String str2 = "   ";

        //so sánh chứa
        System.out.println("so sánh chứa: " + str1.contains("Khóa học"));

        //so sánh bằng
        System.out.println("so sánh bằng: " + str1.equals("Khóa học Automation Testing"));
        System.out.println("so sánh bằng: " + str1.equals(fullName));

        //kiểm tra giá trị bắt đầu và kết thúc của chuỗi
        System.out.println("bắt đầu: " + str1.startsWith("Khóa"));
        System.out.println("kết thúc: " + str1.endsWith("Testing"));

        //kiểm tra chuỗi là rỗng hay ko rỗng
        System.out.println("tính space: " + str2.isEmpty());
        System.out.println("ko tính space: " + str2.isBlank());
    }
}

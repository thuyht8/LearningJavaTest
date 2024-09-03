package BAI_12_PHAMVITRUYCAP.HamXayDung;

public class HamXayDung {
    public String name;//khai báo
    public int age;

    //khai báo hàm xây dựng contructor
    public HamXayDung() {//tên class trùng với tên của hàm đó class = HamXayDung
        System.out.println("Tôi nằm trong hàm contructor");
        name = "Thúy";//gán hoặc khởi tạo giá trị
        age = 33;
    }

    //tạo hàm xử lý trung gian
    public void showInfo (){
        System.out.println("Name: " + name);
        System.out.println("Tuổi: " + age);
    }
    public static void main(String[] args) {
        HamXayDung b = new HamXayDung();//khởi tạo đối tượng trong class
        b.showInfo();
        }
    }

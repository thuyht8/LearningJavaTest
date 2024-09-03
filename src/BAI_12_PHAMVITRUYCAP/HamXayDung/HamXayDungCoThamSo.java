package BAI_12_PHAMVITRUYCAP.HamXayDung;

public class HamXayDungCoThamSo {

    public String name;
    public int age;

    //khai báo hàm xây dựng contructor
    public HamXayDungCoThamSo(String name, int age){
        //this.name: là biến ở trong class HamXayDungCoThamSo;
        //name: ở trong tham số truyền
        this.name = name;//truyền từ khóa this: nghĩa là đây (trong nội tại class này), đại diện cho các biến trong class
        this.age = age;//nếu ko truyền this => đang hiểu biến name là ở trong tham số HamXayDungCoThamSo chứ ko phải trong class HamXayDungCoThamSo
    }

    public void showInfo (){
        System.out.println("Name: " + name);
        System.out.println("Tuổi: " + age);
    }

    public static void main(String[] args) {
        HamXayDungCoThamSo hamXayDungCoThamSo1 = new HamXayDungCoThamSo("Thúy", 33);
        hamXayDungCoThamSo1.showInfo();

        HamXayDungCoThamSo hamXayDungCoThamSo2 = new HamXayDungCoThamSo("Đậu", 18);
        hamXayDungCoThamSo2.showInfo();
    }
}

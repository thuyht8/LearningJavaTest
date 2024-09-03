package BAI_14_KETHUA_DONGGOI.TinhKeThua;

public class Studen extends Person{//kế thừa từ class person

    private String phone;
    private String address;

    public Studen(String name, int age, float hight, String phone, String address) {
        super(name, age, hight);//hàm super truy cập những thứ lquan đến lớp cha
        this.phone = phone;
        this.address = address;

    }

    public String getPhone (){
        return phone;
    }

    public String getAddress (){
        return address;
    }

    public static void main(String[] args) {
        Studen studen = new Studen("Thúy", 33, 150, "12345678", "Tuyên Quang");
        studen.getInfo();
        System.out.println(studen.getPhone());
        System.out.println(studen.getAddress());
    }
}

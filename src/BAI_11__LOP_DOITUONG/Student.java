package BAI_11__LOP_DOITUONG;

public class Student {
    String name = "Dau Dau";
    int age = 33;
    String address = "HA NOI";
    String phone = "123456";

    public void getInfo (){
        System.out.println(name);
        System.out.println(age);
        System.out.println(address);
        System.out.println(phone);
    }

    public String getName (){
        return name;
    }

    public static void main(String[] args) {
        //khai báo đối tượng thộc lớp
        Student sv1 = new Student();
        sv1.getName();
        sv1.getInfo();

        //khai báo kiểu annonymus
        new Student().getInfo();
        new Student().getName();
        
        ThongTin tt1 = new ThongTin();
        System.out.println(tt1.getHocphi());
    }
}

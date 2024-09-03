package BAI_10_THUOCTINH_PHUONGTHUC;

public class PhuongThuc_cach2 {
    //cú pháp: Hàm không có kết quả trả về (thường có void chỉ để in kết quả, chứ ko có kết quả)
//    <modifier> void methodName(Danh sách các tham số) {
//        // code
//    }

    //khai báo hàm ko trả về kết quả
    public void getName (){
        System.out.println("DAU DAU");
        System.out.println("địa chỉ của tôi: " + getAdrress());
    }

    //cú pháp: Hàm  có kết quả trả về (return tính toán lại con số cụ thể - chứ ko có nhiệm in ra)
//    <modifier> returnType methodName(Danh sách các tham số) {
//        // code
//        return <giá trị gì đó> //giống kiểu returnType
//    }

    //khai báo hàm trả về kết quả
    public String getAdrress (){
        return "HN";
    }

    public static void main(String[] args) {
        //cách goi sử dụng phương thức - hàm nay không có từ khóa static, nên cần thông qua đối tượng class
        PhuongThuc_cach2 demo = new PhuongThuc_cach2();
        demo.getName();
    }
}

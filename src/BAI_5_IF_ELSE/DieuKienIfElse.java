package BAI_5_IF_ELSE;

public class DieuKienIfElse {
    public static void main(String[] args) {
        String address = "Ha Noi";
        String phone = "12345";
        boolean login = true;

        if (address.equals("Ha Noi")) {
            System.out.println("địa chỉ là Hà Nội");
        } else {
            System.out.println("các tỉnh khác");
        }

        if (login == false) {
            System.out.println("login success");
        } else {
            System.out.println("Invalid paramter");
        }

    }


}

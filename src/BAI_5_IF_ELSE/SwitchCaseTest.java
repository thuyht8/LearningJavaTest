package BAI_5_IF_ELSE;

public class SwitchCaseTest {
    public static void main(String[] args) {
        String web = "edge";

        //sử dụng để thực thi 1 hoặc nhiều khối lệnh từ điều kiện đầu vào: 1 điều kiện n nhìu giá trị trả ra
        //dùng trong auto vs method: GET, rơi case (trường hợp) nào thì thực thi điều kiện đó; ko rơi vào case nào thì sẽ vào case default
        switch (web) {
            case "coc coc":
                System.out.println("run coc coc");
                break;//đúng case nào thì sẽ thoát ra luôn
            case "fire fox":
                System.out.println("run fire fox");
                break;
            case "edge":
                System.out.println("run edge");
                break;
            default:
                System.out.println("Not run");
        }
    }
}

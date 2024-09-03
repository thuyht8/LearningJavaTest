package BAI_14_KETHUA_DONGGOI.TinhDongGoi;

public class UpdateCase {
    public static void main(String[] args) {
        Status status = new Status();
        //gán giá trị cho hàm set
        status.setTestcaseName("Tạo mới case có TCPH");
        status.setMethod("POST");
        status.setHttpCode(200);

        System.out.println(status.getTestcaseName());
        System.out.println(status.getMethod());
        System.out.println(status.getHttpCode());
    }
}

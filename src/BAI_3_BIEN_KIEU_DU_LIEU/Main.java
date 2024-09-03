package BAI_3_BIEN_KIEU_DU_LIEU;

public class Main {
    public String ten;//biến instance có giá trị mặc định là null (biến toàn cục)
    private int tuoi;//biến instance có giá trị mặc định là 0

    //sử dụng biến ten trong 1 contructor
    public Main(String ten){
        this.ten = ten;
    }

    //sử dụng biến tuoi trong phương thức
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void showStuden (){
        System.out.println(ten);
        System.out.println(tuoi);
    }

    public static void main(String[] args) {
        Main sv = new Main("HA THI THUY");
        sv.setTuoi(30);
        sv.showStuden();
    }

}


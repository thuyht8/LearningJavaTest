package BAI_6_VONG_LAP_FOR;

import java.io.File;

public class VongLapForTest {
    public static void main(String[] args) {
        int arr[] = {100, 200, 300, 400, 500}; //dữ liệu kiểu int//
        String name[] = {"Thuy", "Hương", "Nga"}; //dữ liệu kiểu String//

        //for basic
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
            if (i == 5){
                System.out.println("Tháng 5");
            }
        }
        //for cải tiến
        //dự liệu kiểu int thì Type là int
        for (int number : arr){
            System.out.println(number);
        }
        //dữ liệu kiểu String thì Type là String
        for (String ten : name){
            if (ten.equals("Thuy")){
                System.out.println("HA THI THUY");
            }
        }
    }
}

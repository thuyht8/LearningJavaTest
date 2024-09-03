package BAI_TAP_VE_NHA;

import java.util.ArrayList;

public class Bai_7_ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();//ArrayList ko bị giới hạn size
        int max = 50;

        for (int i = 0; i <= 50; i+=2){
            number.add(i);//add gi trị số chẵn vào arrayList
        }
        //hoặc
//        for (int i = 0; i <= max; i++){
//            if (i % 2 == 0){
//                number.add(i);
//            }
//        }

        //duyệt giá trị trong arrayList
        for (int j = 0; j < number.size(); j++){
            System.out.println(number.get(j));
        }
    }
}

package BAI_8_COLLECTION;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CollectionListTest {
    public static void main(String[] args) {

        List<Integer> listNumber = new ArrayList<>();
        listNumber.add(124);
        listNumber.add(123);
        listNumber.add(89);
        listNumber.add(721);

        //hàm xóa vị trí
        listNumber.remove(2);

        //truy xuất đồng loạt các giá trị khong thông qua vị trí
        for (int value : listNumber){
            System.out.println(value);
        }

        //truy xuất thông qua vị trí cụ thể - hàm get
        System.out.println(listNumber.get(2));

        //HÀM LINKEDLIST
        List<String> linkedList = new LinkedList<>();
        linkedList.add("https://anhtester.com/lesson/java-for-tester-collection-trong-java-voi-arraylist-set-map");
        linkedList.add("https://kenh14.vn/");

        System.out.println("các phân tử LinkedList");
        System.out.print("\t" + linkedList + "\n");
    }
}

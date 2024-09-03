package BAI_8_COLLECTION;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionMapTest {
    public static void main(String[] args) {
        //cú pháp: Map<keyword, value>
        //Map<String, String>
        //Map<String, Object>

        //khai báo kiểu dữ liệu Map
        Map<String, String> map = new HashMap<>();
        map.put("name", "Thuy");
        map.put("age", "30");

        Map<String, Object> deviceMap = new HashMap<>();
        deviceMap.put("width", 700);
        deviceMap.put("height", 400);
        deviceMap.put("pixel", 3.0);

        //truy xuất dữ liệu thông qua vị trí
        System.out.println(map.get("age"));

        //truy xuất hết tất cả dữ liệu theo key
        for (Map.Entry<String, String> entryMap : map.entrySet()){
            System.out.println("Key = " + entryMap.getKey() + ", Value =" + entryMap.getValue());
        }
    }
}

package BAI_8_COLLECTION;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionSetTest {
    public static void main(String[] args) {

        //hàm HASHSET
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Thuy");
        stringSet.add("Dau");

        System.out.println(stringSet.size());
        System.out.println(stringSet.contains("Da"));

        for (String value : stringSet){
            System.out.println(value);
        }

        //hàm TREESET
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("A");
        treeSet.add("B");
        treeSet.add("H");
        treeSet.add("G");
        treeSet.stream().sorted();//sort theo thứ tự

        for (String value : treeSet){
            System.out.println(value);
        }


    }
}

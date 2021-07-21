package set;

import java.util.*;

public class HashSetTest {

    public static void main(String[] args) {
        HashSet set1 = new HashSet();

        set1.add("HW!");
        set1.add(123456);
        set1.add('A');
        set1.add(true);
        set1.add(3.14);

//        System.out.println(set1);

        set1.add("HW!");
        set1.add(123456);
        set1.add('A');

//        System.out.println(set1);

        Iterator iter = set1.iterator();

        while (iter.hasNext()) {
            Object obj = iter.next();

//            System.out.println(obj);
        }
        System.out.println("------------------------");

        Set set2 = new LinkedHashSet();

        set2.add("안녕");
        set2.add(12345);
        set2.add(true);
        set2.add(3.14);

        System.out.println("set2 : " + set2);

        System.out.println("------------------------");

        Set set3 = new TreeSet();
        set3.add("olive");
        set3.add("coconut");
        set3.add("바나나");
        set3.add("키위");

        System.out.println("set3 : " + set3);
    }
}

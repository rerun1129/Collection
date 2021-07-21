package list;

import java.util.*;

public class TestList {

    public static void main(String[] args) {

        /*ArrayList list1 = new ArrayList();

        list1.add("사과");
        list1.add("바나나");

        System.out.println(list1);

        list1.add(12345);
        list1.add(true);
        list1.add(12.3);
        list1.add('A');

        System.out.println(list1);

        list1.add("A");
        list1.add("B");
        list1.add("C");

        System.out.println(list1);
        list1.add("사과");
        list1.add("바나나");
        System.out.println(list1);


        list1.add(5, "콰삭칩");
        list1.set(5, "콘칩");
        System.out.println(list1);

        list1.remove(5);
        System.out.println(list1);

        for (int i = 0; i < list1.size(); i++) {
            System.out.println(i + " >> " + list1.get(i));
        }*/
        ArrayList sortList = new ArrayList();
        sortList.add("DDD");
        sortList.add("AAA");
        sortList.add("CCC");
        sortList.add("BBB");
        sortList.add("EEE");
        sortList.add("AAA");
        sortList.add("CCC");
        sortList.add("DDD");
        sortList.add("EEE");
        sortList.add("BBB");

        System.out.println("정렬 전 : " + sortList);

        //오름차순 정렬

        Collections.sort(sortList);
        System.out.println("오름차순 정렬 후 : " + sortList);

        //내림차순 정렬

        Iterator iter = new LinkedList(sortList).descendingIterator();

        System.out.print("내림차순 정렬 후 : ");
        while (iter.hasNext()){
            System.out.print(iter.next()+", ");
        }
    }
}

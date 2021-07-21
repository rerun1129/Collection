package list.sort;

import java.util.ArrayList;
import java.util.Comparator;

public class SortTest {

    public static void main(String[] args) {

        ArrayList list = new ArrayList();


        list.add(new Product("선풍기", 5000, 0.01));
        list.add(new Product("선크림", 15000, 0.05));
        list.add(new Product("붕어빵", 2000, 0.07));
        list.add(new Product("냉짬뽕", 8000, 0.0));


        System.out.println("list : " + list);
        list.sort(new DesPrice());
        System.out.println("list : " + list);
        list.sort(new AcsName());
        System.out.println("list : " + list);

    }

    private static class DesPrice implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {

            Product p1 = (Product) o1;
            Product p2 = (Product) o2;

            int result = 0;

            if (p1.getPrice() < p2.getPrice()) {
                result = 1;
            } else {
                result = -1;
            }
            return result;

        }
    }


    private static class AcsName implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {

            Product p1 = (Product) o1;
            Product p2 = (Product) o2;

            int result = 0;

            if (p1.getName().compareTo(p2.getName()) > 0) {
                result = 1;
            } else {
                result = -1;
            }
            return result;

        }
    }
}

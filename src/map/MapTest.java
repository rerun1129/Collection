package map;

import java.util.*;

public class MapTest {

    public static void main(String[] args) {

        HashMap map = new HashMap();

        // 키(Key), 값(Value)

        map.put("1번", "수학익임책");
        map.put("2번", "수학익임책");
        map.put("3번",34344);
        map.put(100, new Date());

        /*System.out.println(map);

        map.put("3번", 'A');
        System.out.println(map);

        System.out.println("1번 : " + map.get("1번"));
        System.out.println("700 : " + map.get(700));*/

















        // 저장된 value를 하나씩 꺼내는 방법

        // 1. keySet() 메소드 사용
        //   map 안의 key들만 따로 빼내어
        //   해당 키로 하나씩 조회하는 방법

        Set keys = map.keySet();

        Iterator iter1 = keys.iterator();

        while (iter1.hasNext()) {

            // key 객체를 꺼냄
            Object key = iter1.next();

            System.out.println(map.get(key));

        }

        System.out.println("-------------------------------");

        // 2. values() 메소드 사용
        Collection values = map.values();

        Object[] objArr = values.toArray();

        for (int i = 0; i < objArr.length; i++) {

            System.out.println(objArr[i]);
        }
		/*
		Iterator iter2 = values.iterator();

		while(iter2.hasNext()) {

			System.out.println(iter2.next());

		}
		*/
        System.out.println("--------------------------------");

        // 3. entrySet() 메소드 사용
        //    key와 value를 한 쌍으로 통째로 꺼내오는 방법

        Set entrySet = map.entrySet();

        Iterator iter3 = entrySet.iterator();

        while (iter3.hasNext()) {

            // key와 value를 모두 가지는 객체
            Map.Entry entry = (Map.Entry) iter3.next();

            Object key = entry.getKey();
            Object value = entry.getValue();

            System.out.println(key + " : " + value);

        }
    }
}

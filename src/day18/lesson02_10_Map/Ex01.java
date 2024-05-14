package day18.lesson02_10_Map;

import java.util.*;

public class Ex01 {
    public static void main(String[] args) {
        //Map
        //1. key-value 쌍으로 구성
        //2. key는 중복되지 않는다. value는 상관없음
        //3. key를 통해서 value를 빠르게 찾을 수 있다.
        //4. value로 key를 찾지 않도록 한다.

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("a", 1);
        map1.put("b", 1);
        map1.put("c", 3);
        map1.put("d", 4);

        System.out.println("map1: " + map1);

        // ★★★ key로 값 얻어오기 ★★★
        System.out.println(map1.get("a")); //1
        System.out.println(map1.get("b")); //1
        System.out.println(map1.get("c")); //3
        System.out.println(map1.get("d")); //4

        // 수정 - 기존 키에 값을 put
        map1.put("c", 300);
        System.out.println(map1);

        // "c"라는 키가 있는가?
        System.out.println(map1.containsKey("c")); //true
        // 300이라는 값이 있는가?
        System.out.println(map1.containsValue(300)); //true

        // map의 요소 개수
        System.out.println(map1.size()); //4


        // ★★★ key만 가져오기 ★★★
        Set<String> keys = map1.keySet();
        System.out.println("keys: " + keys);

        // value만 가져오기
        Collection<Integer> values = map1.values();
        System.out.println("values: " + values);

        // key로 요소 삭제하기
        map1.remove("d");
        System.out.println("삭제: " + map1);

        // key와 value로 요소 삭제하기
        map1.remove("c", 300);
        System.out.println("삭제: " + map1);


        // ★★★ map 순회하기(전체를 순회할때만 사용)  ★★★
        //1. key 꾸러미 구성
        Set<String> keySet = map1.keySet();

        //2. set을 순회한다.
        Iterator<String> iter = keySet.iterator();
        while (iter.hasNext()) {
            String key = iter.next();
            System.out.println(key);
            System.out.println(map1.get(key));
        }




    }
}

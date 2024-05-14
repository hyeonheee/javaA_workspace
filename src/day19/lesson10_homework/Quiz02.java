package day19.lesson10_homework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Quiz02 {
    public static void main(String[] args) {

        // 강사 풀이
        //Map에 키에 이름(유재석, 박나래, 이지은, 서장훈, 이광수)을 넣고, 값을 모두 'X'로 초기화 하세요.
        //성씨가 '이'씨인 경우에는 값을 'O'로 바꾼다.
        //Iterator를 사용한다.

        Map<String, Character> map = new HashMap<>();
        map.put("유재석",'X');
        map.put("박나래",'X');
        map.put("이지은",'X');
        map.put("서장훈",'X');
        map.put("이광수",'X');

        Iterator<String> iter = map.keySet().iterator();
        while (iter.hasNext()) {
            String name = iter.next();
            if (name.startsWith("이")) {
                map.put(name, 'O');
            }
        }

        System.out.println(map);





        // 내 풀이
//        Map<String,Character> names = new HashMap<>();
//        names.put("이지은",'X');
//        names.put("서장훈",'X');
//        names.put("유재석",'X');
//        names.put("이광수",'X');
//        names.put("박나래",'X');
//        System.out.println(names);
//
//        Set<String> keySet = names.keySet();
//
//        Iterator<String> iter=keySet.iterator();
//        while (iter.hasNext()){
//            String key = iter.next();
//            if(key.startsWith("이")){
//                names.put(key,'O');
//            }
//        }
//        System.out.println(names);
    }
}

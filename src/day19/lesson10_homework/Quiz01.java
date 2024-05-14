package day19.lesson10_homework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Quiz01 {
    public static void main(String[] args) {

        //1.아래 과목 이름과 성적 정보를 Map 저장하고 출력 하세요.
        Map<String, Integer> scores = new HashMap<>();
        scores.put("국어", 90);
        scores.put("수학", 85);
        scores.put("영어", 90);
        scores.put("사회", 80);
        scores.put("과학", 100);

        System.out.println("1. " + scores);


        //2.사회 시험의 채점에 문제가 있어서 5점을 더 올려야 한다.
        //값을 바꾸고 출력 하세요
        scores.put("사회", 85);
        System.out.println("2. " + scores);


        // 강사 풀이
        //4. 90점 이상의 모든 과목을 출력하세요.
        Iterator<String> iter = scores.keySet().iterator();
        while (iter.hasNext()) {
            String key = iter.next();
            if (scores.get(key) >= 90) {
                System.out.println(scores +" ");
            }
        }


        // 강사 풀이
        //5.100점 성적이 있는 학생에게 성적 우수상을 주기로 하였다.
        //성적 우수상을 받을 수 있는지 출력하세요
        if (scores.containsValue(100)) {
            System.out.println("수상 가능");
        } else {
            System.out.println("해당 없음 ");
        }


        // 내 풀이
        //4. 90점 이상의 모든 과목을 출력하세요.
        Set<String> keyset = scores.keySet();

        Iterator<String> iter4 = keyset.iterator();
        while (iter4.hasNext()) {
            String key = iter4.next();
            if (scores.get(key) >= 90) {
                System.out.print(key + " ");
            }
        }
        System.out.println();


        //5.100점 성적이 있는 학생에게 성적 우수상을 주기로 하였다.
        //성적 우수상을 받을 수 있는지 출력하세요
        Set<String> keyset5 = scores.keySet();

        Iterator<String> iter5 = keyset5.iterator();
        while (iter5.hasNext()) {
            String key = iter5.next();
            if (scores.get(key) == 100) {
                System.out.println("수상 가능");
            }
        }
    }
}

package day18.lesson02_10_Map;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;

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


        //3. 과목명을 입력 받고, 점수를 출력 하세요.
        //단, 입력한 과목이 없을 경우 "자료 없음"을 출력 하세요.
//        System.out.print("조회할 과목명을 입력하세요: ");
//        Scanner scanner =new Scanner(System.in);
//        String subject = scanner.next(); //key
//
//        if(scores.containsKey(subject)){
//            System.out.println(subject+" : "+scores.get(subject));
//        }else {
//            System.out.println("자료 없음");
//        }


        //4. 90점 이상의 모든 과목을 출력하세요.
        Set<String> keyset = scores.keySet();

        Iterator<String> iter = keyset.iterator();
        while (iter.hasNext()) {
            String key = iter.next();
            if(scores.get(key)>=90){
                System.out.print(key+" ");
            }
        }
        System.out.println();


        //5.100점 성적이 있는 학생에게 성적 우수상을 주기로 하였다.
        //성적 우수상을 받을 수 있는지 출력하세요
        Set<String> keyset5 = scores.keySet();

        Iterator<String> iter5 = keyset5.iterator();
        while (iter5.hasNext()) {
            String key = iter5.next();
            if(scores.get(key)==100){
                System.out.println("수상 가능");
            }
        }


    }
}

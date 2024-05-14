package day18.lesson02_08_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Quiz03 {
    public static void main(String[] args) {

        //1. 체조 경기에서 아래와 같은 심사위원 점수가 집계 되었습니다.
        //최고점과 최저점을 제외한 나머지 점수의 평균을 구하세요.
        //for문으로 구현할 것


        // 1. 내 풀이
        List<Integer> list = Arrays.asList(8, 7, 6, 10, 9, 4);
        list.sort(Comparator.naturalOrder());

        int sum = 0;

        for (int i = 1; i < list.size() - 1; i++) {
            sum += list.get(i);
        }
        double avg = (double) sum / (list.size() - 2);

        System.out.println("(내 풀이)최고점과 최저점을 제외한 평균 점수는 " + avg);


        //1-1. 강사 풀이
        List<Integer> scores = new ArrayList<>(List.of(8, 7, 6, 10, 9, 4));
//        Integer max = scores.get(0);
//        Integer min = scores.get(0);
//
//        for (int i = 1; i < scores.size(); i++) { //1~5
//            if (max < scores.get(i)) {
//                max = scores.get(i);
//            }
//            if (min > scores.get(i)) {
//                min = scores.get(i);
//            }
//        }
//        scores.remove(max);
//        scores.remove(min);
//        System.out.println(scores);

        //1-2. 강사 풀이
        scores.sort(Comparator.naturalOrder());
        System.out.println(scores);
        scores.remove(0);
        scores.remove(scores.size() - 1); //마지막칸
        System.out.println(scores);


        int scoreSum = 0;
        for (int i = 0; i < scores.size(); i++) {
            scoreSum += scores.get(i);
        }
        double average = (double) sum / scores.size();
        System.out.println("(강사 풀이)최고점과 최저점을 제외한 평균 점수는 " + average);

        //2. 회원관리 리스트를 만든다.
        // 새로 입력할 이름을 기존 리스트에 추가한다.
        //만약 동명이인이 있을 경우 회원명 뒤에 숫자를 붙인다.
        List<String> nameList = new ArrayList<>();
        nameList.add("우솝");
        nameList.add("루피");
        nameList.add("상디");
        nameList.add("나미");
        nameList.add("로빈");

        List<String> newNameList = Arrays.asList("보람", "루피", "쵸파", "로빈", "루피");

        int count = 0;
        for (int i = 0; i < nameList.size(); i++) {
            for (int j = 0; j< newNameList.size(); j++) {
                if (nameList.get(i).equals(newNameList.get(j))) {
                    count++;
                    nameList.add(newNameList.get(j) + count);
                    break;
                } else {
                    nameList.add(newNameList.get(j));
                    break;
                }
            }
        }
        System.out.println(nameList);
    }
}

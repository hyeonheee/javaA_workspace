package day19.lesson08_homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quiz03 {
    public static void main(String[] args) {

        //2. 회원관리 리스트를 만든다.
        // 새로 입력할 이름을 기존 리스트에 추가한다.
        //만약 동명이인이 있을 경우 회원명 뒤에 숫자를 붙인다.
        // 정답: [우솝, 루피, 상디, 나미, 로빈, 보람, 루피1, 쵸파, 로빈1, 루피2]


        // 강사 풀이2
        // 새 이름을 기준으로 돌고, 기준 리스트에 포함되어 있는지 contains로 확인
        // 숫자가 붙은 이름도 있는지 확인

        List<String> names = new ArrayList<>(List.of("우솝", "루피", "상디", "나미", "로빈"));
        List<String> newNames = new ArrayList<>(List.of("보람", "루피", "쵸파", "로빈", "루피"));

        for (int i = 0; i < newNames.size(); i++) {  // 0~4
            int count = 1;
            String newName = newNames.get(i);
            while (names.contains(newName)) {
                newName = newNames.get(i) + count++;
            }
            names.add(newName);
        }

        System.out.println(names);


        // 강사 풀이 1
//        List<String> names = new ArrayList<>(List.of("우솝", "루피", "상디", "나미", "로빈"));
//        List<String> newNames = new ArrayList<>(List.of("보람", "루피", "쵸파", "로빈", "루피"));
//
//        for (int i = 0; i < names.size(); i++) {
//            int count = 1;
//            for (int j = 0; j < newNames.size(); j++) {
//                if (names.get(i).equals(newNames.get(j))) {
//                    newNames.set(j, newNames.get(j) + count++); // newName에 count가 붙은 이름으로 변경
//                }
//            }
//        }
//
//        System.out.println(newNames);
//        names.addAll(newNames);
//        System.out.println(names);


        // 내 풀이
//        List<String> nameList = new ArrayList<>();
//        nameList.add("우솝");
//        nameList.add("루피");
//        nameList.add("상디");
//        nameList.add("나미");
//        nameList.add("로빈");
//
//        List<String> newNameList = Arrays.asList("보람", "루피", "쵸파", "로빈", "루피");
//
//        int count = 0;
//        for (int i = 0; i < nameList.size(); i++) {
//            for (int j = 0; j< newNameList.size(); j++) {
//                if (nameList.get(i).equals(newNameList.get(j))) {
//                    count++;
//                    nameList.add(newNameList.get(j) + count);
//                    break;
//                } else {
//                    nameList.add(newNameList.get(j));
//                    break;
//                }
//            }
//        }
//        System.out.println(nameList);
    }
}

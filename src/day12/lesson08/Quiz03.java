package day12.lesson08;

public class Quiz03 {
    public static void main(String[] args) {


        String memberStr = "김혜수:송강호:정우성:이민정:송강호:이민정:이민정:이정재:이병헌:이정재";
        String[] names = memberStr.split(":");
        int resultCount = 0;


        // 3-2) 마킹 x
        for (int i = 0; i < names.length - 1; i++) {
            int sameCount = 0;
            for (int j = i + 1; j < names.length; j++) {
                if (names[i].equals(names[j])) {
                    sameCount++;
                }
            }

            //맨 뒤에 발견되 동명이인 종류수만 count 한다.
            if (sameCount == 1) {
                resultCount++;
            }
        }
        System.out.println("동명이인 종류 수: " + resultCount);


        // 3-1) 마킹
//        for (int i = 0; i < names.length - 1; i++) { // 배열의 마지막까지 검사를 할 필요가 없어서 -1을 해준다
//            String name = names[i]; // 검사할 기준 이름
//            boolean flag = false; // boolean의 기본값은 false라서 boolean flag;도 가능
//
//            // 동명이인으로 체크되서 -로 되어 있는 경우 skip을 하고 다음 기준 이름을 정하고 for문을 돈다
//            if(name.equals("-")){
//                continue;
//            }
//
//            for (int j = i + 1; j < names.length; j++) {
//                if (name.equals(names[j])) { // 동명이인이 발견 되는 순간
//                    flag = true;
//                    names[j] = "-";
//                }
//            }
//            if (flag) {
//                resultCount++;
//            }
//        }
//        System.out.println("동명이인 종류 수: " + resultCount);


    }
}

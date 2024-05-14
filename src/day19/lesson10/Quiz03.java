package day19.lesson10;


import java.util.*;

public class Quiz03 {

    // final keyword: 한번만 초기화 하도록 하는 것
    // 1. 변수: 한번 초기화 된 변수에 값 재할당 불가
    // 2. 메소드: 오버라이드 불가
    // 3. 클래스: 상속 불가

    public static final Map<String, String> capitalMap = new HashMap<>() {
        {
            put("대한민국", "서울");
            put("덴마크", "코펜하겐");
            put("독일", "베를린");
            put("러시아", "모스크바");
            put("벨기에", "브뤼셀");
            put("브라질", "브라질리아");
            put("스웨덴", "스톡홀름");
            put("스위스", "베른");
            put("스페인", "마드리드");
            put("아르헨티나", "부에노스아이레스");
            put("이집트", "카이로");
            put("이란", "테헤란");
            put("이탈리아", "로마");
            put("일본", "도쿄");
            put("필리핀", "마닐라");
            put("핀란드", "헬싱키");
            put("프랑스", "파리");
            put("튀르키예", "앙카라");
            put("캐나다", "오타와");
            put("콜롬비아", "보고타");
        }
    };

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        Set<String> keys = capitalMap.keySet(); // 사용x
        List<String> keyList = new ArrayList<>(keys); // 나라이름 List의 index로 문제 낼 것


        // 강사 풀이
        int score = 0;

        //중복 검사 리스트
        List<Integer> quizIndex=new ArrayList<>(); // []

        for (int i = 0; i < 5; i++) {
            int randIdx = rand.nextInt(capitalMap.size());
            //중복 검사
            if(quizIndex.contains(randIdx)){
                i--; // 중복이면 다시 문제를 낸다
                continue; // 아래로 내려가지 못하게 skip을 해야 한다.(break는 반복문을 빠져나가는거)
             }
            // 냈던 문제 저장(중복 검사 위해)
            quizIndex.add(randIdx);

            String country = keyList.get(randIdx);

            System.out.print(country + "의 수도 이름은? ");
            String answer = scan.next();

            if (capitalMap.get(country).equals(answer)) {
                System.out.println("정답");
                score += 100 / 5;
            } else {
                System.out.println("오답");
            }
        }

        System.out.println("총 점수는: " + score + "점");


        // 내 풀이
//        int sum = 0;
//        for (int i = 0; i < 5; i++) {
//            int randomNum = rand.nextInt(keyList.size()); //0~19
//            System.out.print(keyList.get(randomNum) + "의 수도 이름은? ");
//            String answer = scan.next();
//            if ((capitalMap.get(keyList.get(randomNum))).equals(answer)) {
//                System.out.println("정답");
//                sum += 100 / 5;
//            } else {
//                System.out.println("틀렸습니다.");
//            }
//        }
//        System.out.println(sum + "점");
    }

}

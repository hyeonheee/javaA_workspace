package day12.lesson2_02.quiz04;
//＊객체 생성 시 문제의 정답 5개를 입력받아 정답 배열에 저장해둔다.
//＊OmrCard 하나를 입력받아서 이름, 학번, 점수(100점 만점)를 출력한다.

public class OmrCardReader {
    // 필드
    private int[] correctAnswer = new int[5]; //정답


    // 메소드
    // 생성자 - 정답 세팅 (확장성을 위해서)
    public OmrCardReader(int a1, int a2, int a3, int a4, int a5) {
        this.correctAnswer[0] = a1;
        this.correctAnswer[1] = a2;
        this.correctAnswer[2] = a3;
        this.correctAnswer[3] = a4;
        this.correctAnswer[4] = a5;
    }


    // 내 풀이
    public int score(int[] answer) {
        int sum = 0;
        for (int i = 0; i < correctAnswer.length; i++) { // 0~4
            if (correctAnswer[i] == answer[i]) {
                sum += 100 / correctAnswer.length;
            }
        }
        return sum;
    }


    //omrCard에 적힌 이름, 학번, 점수를 출력하는 메소드
    public void printScore(OmrCard omrCard) {
        System.out.println("이름: " + omrCard.getName());
        System.out.println("학번: " + omrCard.getStudentId());


        // 강사 풀이
//        int score = 0;
//        for (int i = 0; i < correctAnswer.length; i++) {
//            if (correctAnswer[i] == omrCard.getAnswer()[i]) {
//                score += 100 / correctAnswer.length;
//            }
//        }
//        System.out.println("점수: " + score);

        System.out.println("점수: "+this.score(omrCard.getAnswer()));
    }

}

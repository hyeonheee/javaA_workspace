package day12.lesson2_02.quiz04;

//OMR 카드와 카드 리더기 객체를 만드는 클래스
//OmrCard 객체에는 정답을 입력한다.
//OmrCardReader 객체에는 위에서 만든 OmrCard를 넣어 결과를 받는다.

public class OmrCardTest {
    public static void main(String[] args) {

        // 비어 있는 omr 카드를 받는다.
        OmrCard omrCard = new OmrCard();

        // 리더기에 카드를 넣고 점수 확인
        OmrCardReader reader = new OmrCardReader(1, 4, 4, 5, 2);

        // 이름, 학번, 정답 마킹
        omrCard.setName("홍길동");
        omrCard.setStudentId(2022222);
        //omrCard.setAnswer(2,3,4,5,2);
        omrCard.setAnswer(new int[]{1, 2, 3, 4, 2});


        // 리더기에 카드를 넣고 점수를 확인한다.
        // 결과 출력 => reader가 한다.
        reader.printScore(omrCard);


    }

}

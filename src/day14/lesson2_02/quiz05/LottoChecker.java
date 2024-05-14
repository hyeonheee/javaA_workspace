package day14.lesson2_02.quiz05;

import java.util.Random;

public class LottoChecker {

    private int[] luckyNumber = new int[6]; //당첨 번호

    // checker 객체 생성 시 당첨번호 랜덤으로 생성
    public LottoChecker() {
        Random rand = new Random();
        for (int i = 0; i < this.luckyNumber.length; i++) {
            int randNum = rand.nextInt(45) + 1;
            this.luckyNumber[i] = randNum;
            for (int j = 0 ; j < i; j++) { //i보다 하나전까지 중복 검사
                if (this.luckyNumber[j]==randNum) {
                    i--; //i를 한번 더 같은 자리에 다시 채울수 있게 하기 위해서
                    break;
                }
            }
        }
    }

    // 당첨번호 출력
    public void printLottoNumber() {
        System.out.print("로또 당첨 번호>> ");
        for (int i = 0; i < this.luckyNumber.length; i++) {
            System.out.print(this.luckyNumber[i] + " ");
        }
        System.out.println();
    }

    // 로또 결과 확인
    // input: Lotto,  output: String
    public String check(Lotto lotto) {
        int[] numbers = lotto.getLottoNumber(); // 종이에 적힌 6개 번호
        int count = 0; // 몇개가 맞았는지 확인

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < this.luckyNumber.length; j++) {
                if (this.luckyNumber[j] == numbers[i]) {
                    count++;
                    break;
                }
            }
        }

        // 6개: 1등, 5개: 2등, 4개: 3등, 3개: 4등, 나머지: 꽝
        if (count == 6) {
            return "1등";
        } else if (count == 5) {
            return "2등";
        } else if (count == 4) {
            return "3등";
        } else if (count == 3) {
            return "4등";
        }
        return "꽝";
    }
}


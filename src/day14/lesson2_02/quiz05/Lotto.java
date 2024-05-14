package day14.lesson2_02.quiz05;

import java.util.Random;

public class Lotto {
    private int[] lottoNumber = new int[6];


    // 수동
    public void manual(int[] lottoNumber) { // 사용자한테 받아오면 ()를 채워준다.
        this.lottoNumber = lottoNumber;
    }

    // 자동
    public void auto() { // 사용자한테 받아오지 않으면 ()를 비워둔다
        Random rand = new Random();
        for (int i = 0; i < this.lottoNumber.length; i++) {
            int randNum = rand.nextInt(45) + 1;
            this.lottoNumber[i] = randNum;
            for (int j = 0 ; j < i; j++) { //i보다 하나전까지 중복 검사
                if (this.lottoNumber[j]==randNum) {
                    i--; //i를 한번 더 같은 자리에 다시 채울수 있게 하기 위해서
                    break;
                }
            }
        }
    }

    // 번호 6개 출력
    public void printLottoNumber(){
        System.out.print("로또 종이 숫자>> ");
        for (int i = 0; i < lottoNumber.length; i++) {
            System.out.print(lottoNumber[i] + " ");
        }
        System.out.println();
    }

    public int[] getLottoNumber() {
        return this.lottoNumber;
    }
}

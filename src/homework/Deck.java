package homework;

import java.util.Random;


// 카드 섞기
// 52장의 카드 가지고 있기
public class Deck {


    // card라는 객체 자체가 52개를 가지고 있어야 되서 card 클래스로 만들어야 한다.
    // 생성자 부분에서 채워야한다.
    private String[] cards = new String[52];

    public void cards(Card card) {
        int count = 0;

        for (int i = 0; i < cards.length; ) {
            for (int j = 0; j < 13; j++) {
                switch (count) {
                    case 0:
                        cards[i] = card.getShape("spade ") + card.getNumber(j + 1);
                        break;
                    case 1:
                        cards[i] = card.getShape("heart ") + card.getNumber(j + 1);
                        break;
                    case 2:
                        cards[i] = card.getShape("diamond ") + card.getNumber(j + 1);
                        break;
                    case 3:
                        cards[i] = card.getShape("club ") + card.getNumber(j + 1);
                        break;
                }
                System.out.println(cards[i]);
                i++;

            }
            count++;
        }

    }

    public String[] getCards() {
        return cards;
    }

    public void swap(String[] cards) {
        Random rand = new Random();
        String temp;
        for (int i = 0; i < 1000; i++) {
            int randNum = rand.nextInt(52);  // 0부터 51까지의 수를 랜덤으로 뽑는다.
            temp = this.cards[0];
            this.cards[0] = this.cards[randNum];
            this.cards[randNum] = temp;
        }

        // 출력 메소드도 따로 만들어야 한다.
        for (int i = 0; i < this.cards.length; i++) {
            System.out.println(this.cards[i]);
        }
    }

    // 잘못된 풀이
    //int[] number = new int[52];
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 13; j++) {
//                if (i == 0) {
//                    cards[i][j] = card.getShape("spade ")+card.getNumber(j+1);
//                } else if (i == 1) {
//                    cards[i][j] = card.getShape("heart ")+card.getNumber(j+1);
//                } else if (i == 2) {
//                    cards[i][j] = card.getShape("diamond ")+card.getNumber(j+1);
//                } else {
//                    cards[i][j] = card.getShape("club ") + card.getNumber(j + 1);
//                }
//                System.out.println(cards[i][j]);
//            }
//        }
//
//        for(int i = 0; i<number.length; i++){
//            for (int j = 0; j<13 ; j++) {
//                number[i]
//            }
//        }



}

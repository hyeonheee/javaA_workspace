package homework;

import java.util.Random;

public class CardMain {
    public static void main(String[] args) {

        // card객체를 여기서 만들지 말고 deck에서 만들어야 한다.
        Deck deck = new Deck();
        //deck.cards(card);
        System.out.println();

    }

//    public static void swap(String[] cards) {
//        Random rand = new Random();
//        String temp;
//        for (int i = 0; i < 1000; i++) {
//            int randNum = rand.nextInt(52);  // 0부터 51까지의 수를 랜덤으로 뽑는다.
//            temp = cards[0];
//            cards[0] = cards[randNum];
//            cards[randNum] = temp;
//        }
//
//        for (int i = 0; i < cards.length; i++) {
//            System.out.println(cards[i]);
//        }
//    }

}

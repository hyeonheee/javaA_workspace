package day11.lesson08;

import java.util.Scanner;

public class Quiz03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //1
        // id를 입력 받고, 아래와 같이 환영 메시지를 출력하세요.
//        System.out.print("ID를 입력 하세요: ");
//        String id = scanner.next();
//        System.out.println("Welcome! " + id);

        // 2
        // 영어 단어를 입력 받고 'e' 가 몇 개 들어 있는지 출력 하세요
        System.out.print("단어를 입력하세요: ");
        String word = scanner.next(); //elephant
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'e') { //stack에 있는 값을 비교할때에는 ==
                count++;
            }
        }
        System.out.println("e의 개수는 " + count + "개 입니다.");


    }
}

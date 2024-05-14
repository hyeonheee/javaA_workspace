package day09.lesson06_array;

import java.util.Scanner;

public class Quiz02 {
    public static void main(String[] args) {

        // 1
        // index와 값을 차례로 입력 받아서, 아래 배열에 해당하는 index에 값을 바꾸고 출력 하세요.

        int[] numbers = {3, 5, 2, 10, 39};
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print(numbers[i]+" ");
//        }
//        System.out.println();

        Scanner scanner = new Scanner(System.in);
//        System.out.print("변경할 index와 값을 입력하세요: ");
//        int index = scanner.nextInt();
//        int num = scanner.nextInt();
//
//        // 1) 강사 풀이
//        numbers[index] = num;
//
//        for (int i = 0; i < numbers.length; i++){
//            System.out.print(numbers[i] + " ");
//        }

        // 2) 내 풀이
//        for (int i = 0; i < numbers.length; i++) {
//            if ( i == index) {
//                numbers[i] = num;
//            }
//            System.out.print(numbers[i]+" ");
//        }
        System.out.println();


        // 2
        // 아래와 같이 O 와 X로 채점 결과가 저장된 배열이 있다.
        //100점 만점 기준으로 몇점을 맞았는지 출력하세요.

        char[] scores = {'X', 'O', 'O', 'X', 'X', 'O', 'O', 'O', 'O', 'X'};
        int score = 0;
        for (int i = 0; i < scores.length; i++) { // 0 ~ 9
            if (scores[i] == 'O') {
                score += 100 / scores.length; //100점 만점을 기준으로 해서 나눈다.
            }
        }
        System.out.print(score + "점");
        System.out.println();

        // 3
        // 아래 배열은 각각 월, 화, 수, 목, 금, 토, 일 7일간의 아르바이트를 한 시간을 나타낸다.
        // 시급 기준이 아래와 같을때 7일 동안 일한 총 임금의 값을 출력하세요.

        // 내 풀이
        int[] works = {3, 5, 5, 3, 5, 3, 5};
//        int weekdayCost = 8500; // 평일
//        int weekendCost = 9500; // 주말
//        int weekdaySum = 0;
//        int weekendSum = 0;
//        for (int i = 0; i < works.length; i++) { // 0 1 2 3 4  5 6
//            if (i == 5 || i == 6) {  // i < 5
//                weekendSum += works[i] * weekendCost;
//            } else {
//                weekdaySum += works[i] * weekdayCost;
//            }
//        }
//
//        int totalWage = weekdaySum + weekendSum;
//        System.out.println("일주일간 총 임금은 " + totalWage + "원");

        // 강사 풀이
        int wage = 0;
        for (int i = 0; i < works.length; i++) { // 0 1 2 3 4  5 6
            if (i < 5) {  // i < 5
                wage += works[i] * 8500;
            } else {
                wage += works[i] * 9500;
            }
        }

        System.out.println("일주일간 총 임금은 " + wage + "원");

        // 4
        // 길이가 5인 int 배열을 만든다.
        // 수를 계속 입력 받으면서, 입력 받은 수가 짝수 일때만, 배열에 저장한다.
        // 배열이 가득차면 입력을 중단하고, 저장된 수들을 출력한다.

        //Scanner scanner = new Scanner(System.in);
        int[] evens = new int[5];
        int index = 0;

        // 내 풀이
//        while (index < evens.length) {
//            System.out.print("수를 입력하세요: ");
//            evens[index] = scanner.nextInt();
//            if (evens[index] % 2 == 0) {
//                // 짝수일때만 배열에 저장하고, 다음칸으로 넘어간다.
//                index++;
//            }
//        }

        // 강사 풀이 (while문 추천)
        while (index < evens.length) {
            System.out.print("수를 입력하세요: ");
            if (evens[index] % 2 == 0) {
                // 짝수일때만 배열에 저장하고, 다음칸으로 넘어간다.
                evens[index] = scanner.nextInt();
                index++;
            }
        }

        // 강사 풀이
//        for (int i = 0; i < evens.length; ) {
//            System.out.print("수를 입력하세요: ");
//            int number = scanner.nextInt();
//            if (number % 2 == 0) {
//                evens[i] = number;
//                i++;
//            }
//        }


        System.out.println();

        for (int i = 0; i < evens.length; i++) {
            System.out.print(evens[i] + " ");
        }
    }


}


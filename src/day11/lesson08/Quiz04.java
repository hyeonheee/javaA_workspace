package day11.lesson08;

import java.util.Scanner;

public class Quiz04 {
    public static void main(String[] args) {

        // 1
        // 파일이름이 저장된 문자열 배열에서 jpg 파일이 몇개인지 출력하세요.

//        String[] files = {"cat.jpg", "dog.png", "kakao.exe", "tree.jpg", "eclipce.exe", "tmp.txt", "phone.jpg"};
//        int count = 0;
//        for (int i = 0; i < files.length; i++) {
//
//            // 강사 풀이
//            if (files[i].endsWith("jpg")) {
//                count++;
//            }

        // 내 풀이
        //contains 경우에는 파일명에도 jpg가 들어있으면 포함을 시키기 때문에 좋지 않은 풀이
//            if (files[i].contains("jpg")) {
//                count++;
//            }
    }
//        System.out.println("jpg 파일 개수 : " + count);


    // 2
    //영어 단어 퀴즈를 낸다.
    //아래와 같이 4개의 문제를 출제하고, 문자열로 차례차례 입력을 받는다.
    //100점 만점 기준으로 몇점인지 출력한다.

    // 강사 풀이
//        Scanner scan = new Scanner(System.in);
//        String[] quizWord = {"승리", "사랑", "컴퓨터", "노트북"};
//        String[] answerWord = {"victory", "love", "computer", "notebook"};
//        int score = 0;
//
//        for (int i = 0; i < quizWord.length; i++) {
//            System.out.print((i + 1) + ". " + quizWord[i] + "을(를) 영어로 입력하세요 : ");
//            String answer = scan.next();
//            if (answer.equals(answerWord[i])) { //String 비교는 .equals
//                score += 25;
//            }
//        }
//        System.out.println("점수는 " + score + "점 입니다.");


    // 내 풀이
//        Scanner scan = new Scanner(System.in);
//        String[] word = new String[4];
//        System.out.print("1. 승리를 영어로 입력하세요: ");
//        word[0] = scan.next();
//        System.out.print("2. 사랑을 영어로 입력하세요: ");
//        word[1] = scan.next();
//        System.out.print("3. 컴퓨터를 영어로 입력 하세요: ");
//        word[2] = scan.next();
//        System.out.print("4. 노트북을 영어로 입력 하세요: ");
//        word[3] = scan.next();
//
//        int sum = 0;
//        for (int i = 0; i < word.length; i++) {
//            switch (i) {
//                case 0:
//                    if (word[i].equals("victory")) {
//                        sum += 100 / word.length;
//                    }
//                case 1:
//                    if (word[i].equals("love")) {
//                        sum += 100 / word.length;
//                    }
//                case 2:
//                    if (word[i].equals("computer")) {
//                        sum += 100 / word.length;
//                    }
//                case 3:
//                    if (word[i].equals("notebook")) {
//                        sum += 100 / word.length;
//                    }
//            }
//        }
//        System.out.println("점수는 " + sum + "점 입니다.");


    // 3
    // 동명이인 종류: 송강호, 이민정, 이정재 => 3

    // 강사 풀이
    String memberStr = "김혜수:송강호:정우성:이민정:송강호:이민정:이민정:이정재:이병헌:이정재";


    // 내 풀이
//        String memberStr = "김혜수:송강호:정우성:이민정:송강호:이민정:이민정:이정재:이병헌:이정재";
//        String[] names = memberStr.split(":");
//
//        String[] counts = new String[names.length];
//        int[] num = new int[names.length];
//
//
//        for (int i = 0; i < names.length; i++) { // 0 1 2 3 4 5 6
//            for (int j = (i + 1); j < names.length; j++) {
//                if (names[i].equals(names[j]) || !names[i].contains(counts[i])) {
//                    counts[i] = names[i];
//                    break;
//                }
//            }
//        }
//        System.out.println("동명이인 종류: " + counts.length);


}


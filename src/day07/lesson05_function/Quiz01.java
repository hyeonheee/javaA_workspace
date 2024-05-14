package day07.lesson05_function;

import java.util.Scanner;

public class Quiz01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        //1. 정수를 입력 받아서 2제곱의 결과를 돌려주는 함수를 만들고 호출한 값을 출력하세요.
//        System.out.print("제곱값을 구할 숫자를 입력하세요: ");
//        int num = scanner.nextInt();
//        System.out.println(num+"의 제곱은 "+getSquared(num)+"이다.");


        //2. 4개의 값을 받아서 평균을 돌려주는 함수를 만들고 호출한 값을 출력하세요.
//        System.out.print("점수를 입력하세요: ");
//        int score1 = scanner.nextInt();
//        int score2 = scanner.nextInt();
//        int score3 = scanner.nextInt();
//        int score4 = scanner.nextInt();
//
//        double result = getAverage(score1,score2,score3,score4);
//        System.out.println("평균은 "+result);



        //3. 두 수를 받아서 몫과 나머지를 출력하는 함수를 만드세요. (리턴값 없음)
//        System.out.print("숫자와 나눌 수를 입력하세요: ");
//        int num1 = scanner.nextInt();
//        int num2 = scanner.nextInt();
//
//        printQuotientRemainder(num1, num2);



        //4. 정수를 입력 받아서 짝수면 true 홀수면 false를 돌려 주는 함수를 만드세요.
        System.out.print("숫자를 입력하세요: ");
        int num = scanner.nextInt();

        System.out.println(isEvenNumber(num));


    }


    //1
    public static int getSquared (int x) {
        return x*x;
    }


    //2
    public static double getAverage(int score1, int score2, int score3, int score4){
        double average = (score1 + score2 + score3 + score4) / 4.0;
        return average;
    }


    //3
    public static void printQuotientRemainder(int number1, int number2) {
        int a = number1 / number2;
        int b = number1 % number2;
        System.out.println("몫: " + a);
        System.out.println("나머지: " + b);
    }


    //4
    public static boolean isEvenNumber (int num) {
        return num % 2 == 0;
    }
}

package day08.lesson06_array;

public class Ex01 {

    public static void main(String[] args) {
    // 배열(Array) : 같은 자료형의 묶음

    // 배열의 초기화 (1)
        int[] scores = {39, 29, 50, 20, 33};
        System.out.println("첫번째 값: "+scores[0]);
        System.out.println("두번째 값: "+scores[1]);
        System.out.println("세번째 값: "+scores[2]);
        System.out.println("네번째 값: "+scores[3]);
        System.out.println("다섯번째 값: "+scores[4]);
        System.out.println();

    // 배열의 초기화 (2)
        int[] numbers = new int[3];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println();

    // 배열 칸의 값 변경
        numbers[0] = 1000;
        System.out.println(numbers[0]);
        System.out.println(numbers); // hash 값
        System.out.println();

    // 반복문을 이용한 배열 값 출력
        for (int i = 0; i < 3; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println();

        // length는 함수나 메소드가 아니다.
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
        System.out.println();

    // 합계 구하기
        int sum = 0;
        for (int i = 0; i < scores.length; i++) { // 0 ~ 4
            sum += scores[i];
        }
        System.out.println("합계: "+sum);




    }
}

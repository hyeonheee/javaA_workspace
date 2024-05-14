package day09.lesson06_array;

import java.util.Random;

public class Quiz03 {
    public static void main(String[] args) {
        // swap 1강 4번 문제 (2) => 퀴즈3 1번 문제

        //1
        // hint) swap 1강 4번 문제 (2) => 퀴즈3 1번 문제
        //두 개의 index를 입력 받아서, 해당하는 index의 값을 서로 교체 해서 배열을 출력하세요.

//        Scanner scanner = new Scanner(System.in);
//        int[] numbers = {3, 5, 2, 10, 39};
//        System.out.print("두 개의 index를 입력하세요: ");
//        int index1 = scanner.nextInt();
//        int index2 = scanner.nextInt();
//
//        int temp = numbers[index1];
//        numbers[index1] = numbers[index2];
//        numbers[index2] = temp;
//
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print(numbers[i] + " ");
//        }
//        System.out.println();


        //2
        //1 ~ 10 까지 차례로 저장된 배열을 만들고, 순서를 뒤섞어서 그 결과를 출력하세요.
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Random rand = new Random();

        // 0번째 index와 random index와 교체를 100번 반복해서 뒤섞는다.

        // 내 풀이
//        for (int i = 0; i < 100; i++) {
//            int randIndex = rand.nextInt(10); // 0 ~ 9까지의 숫자를 랜덤으로 뽑는다.
//            // swap 구현
//            for (int j = 0; j < nums.length; j++) {
//                int temp = nums[j];
//                nums[j] = nums[randIndex];
//                nums[randIndex] = temp;
//            }
//        }

      //  System.out.println("-----------------------------------------------");

        // 강사 풀이
//        for (int i = 0; i < 100; i++) {
//            int randIndex = rand.nextInt(10); // 0 ~ 9까지의 숫자를 랜덤으로 뽑는다.
//            // swap 구현
//            int temp = nums[0];
//            nums[0] = nums[randIndex];
//            nums[randIndex] = temp;
//
//        }
//
//        for (int i = 0; i < nums.length; i++) {
//            System.out.print(nums[i] + " ");
//        }


        //3
        //1 ~ 5 범위 안에 숫자가 배열에 중복되어 저장되어있다.
        //1 ~ 5 까지의 숫자가 각각 몇 개씩 저장되어 있는지 출력하세요.


        int[] numbers3 = {5, 3, 2, 1, 2, 4, 3, 3, 2, 1};
        int[] counts = new int[5];

        // 내 풀이
        // numbers3 배열에는 0이 없기 때문에 시작을 1로 해서 counts 배열 0 자리에 넣기 위해서 -1을 해준다.
//        for (int i = 0; i < numbers3.length; i++) {
//            counts[numbers3[i] - 1]++;
//        }

//        for (int i = 0; i < counts.length; i++) {
//            System.out.println((i + 1) + " : " + counts[i] + "개");
//        }
        System.out.println("-----------------------------------------------");


        // 강사 풀이
        int[] freq = new int[6]; //0인덱스는 안쓴다.
        for (int i = 0; i < numbers3.length; i++) {
            freq[numbers3[i]]++;
        }


        for (int i = 1; i < freq.length; i++) {
            System.out.println(i + " : " + freq[i] + "개");
        }


        // 참고
//        //[1] : 배열 선언
//        int[] target = {1, 3, 3, 2, 1, 1, 3, 0, 1, 2};
//
//        //[2] : 배열내 각 숫자들의 빈도 수 출력하기
//        int[] ar = new int[4];
//
//        // 배열은 0부터 시작하기 때문에 target 배열에 0이 있어서 ar[target[i]] 가능
//        for (int i = 0; i < target.length; i++) {
//            ar[target[i]]++;
//        }
//        //[3] 출력
//        for (int i = 0; i < ar.length; i++)
//            System.out.println(i + "번 숫자 -->" + ar[i] + "회");
    }
}



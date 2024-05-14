package day07.lesson05_function;

import java.util.Scanner;

public class Quiz02 {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        //1
        //수를 입력 받아서 1에서 부터 그 수 까지의 합을 구하는 함수를 만드세요.
        // 단, 합이 100이 넘으면 합을 중단하고 그 때 까지의 합을 리턴하세요.
//        System.out.print("수를 입력하세요: ");
//        int num = scanner.nextInt();
//        System.out.println(sum(num));

        //2
        //5개의 수를 입력 받아서 최소값을 출력하는 함수를 만드세요.(리턴값 없음)
        //입력 가능한 최대값은 1000 입니다.
//        System.out.print("5개의 수를 입력하세요: ");
//        int num1 = scanner.nextInt();
//        int num2 = scanner.nextInt();
//        int num3 = scanner.nextInt();
//        int num4 = scanner.nextInt();
//        int num5 = scanner.nextInt();
//
//        min(num1,num2,num3,num4,num5);


        // 3 ***************************************
        //수를 입력 받고 그 수가 소수(prime)인지 아닌지 리턴하는 함수를 만들고 호출하세요.
        //소수이면 true, 소수가 아니면 false를 리턴
        //단, 입력하는 수는 2 이상

        System.out.print("수를 입력하세요: ");
        int num = scanner.nextInt();

        System.out.println(isPrime(num));

    }

    // 1
    // input : int (끝값)
    // output : int (결과값)
    public static int sum (int num) {
        int sum = 0;
        for(int i = 1; i <= num; i++){
            sum += i; // sum을 한 뒤에서 100이 넘는지 확인해서 break
            if(sum > 100){
                break;
                // return sum;
            }
        }
        return sum;
    }

    // 2
    public static void min (int n1, int n2, int n3, int n4, int n5){
        int min = n1;
        if (min > n2){
            min = n2;
        }
        if (min > n3){
            min = n3;
        }
        if (min > n4){
            min =n4;
        }
        if (min > n5){
            min = n5;
        }

//        int min = n1;
//        min = Math.min(min,n2);
//        min = Math.min(min,n3);
//        min = Math.min(min,n4);
//        min = Math.min(min,n5);

        System.out.println("최소값은 "+min);


    }


    //3
    // input: int, output: boolean 소수 - true, 소수x - false
    public static boolean isPrime(int n) {
        if (n <= 1 ) return false;

        // 아래 3가지 경우 모두 가능하다.


        // 2보다 큰 수를, 2부터 n보다 하나 작은 수까지 나눠본다.
        for (int i = 2; i < n; i++){
            if (n % i == 0) {
                // 하나라도 나누어 떨어지면 소수가 아니다.
                return false;
            }
        }

        // n까지 모두 돌려볼 필요 없이, n의 반까지만 돌려도 소수를 확인 가능하기 때문에 n/2까지 범위를 설정
//        for (int i = 2; i < n / 2; i++){
//            if (n % i == 0) {
//                // 하나라도 나누어 떨어지면 소수가 아니다.
//                return false;
//            }
//        }


        // **n의 제곱근까지만 확인해봐도 소수 확인이 가능하다
//        for (int i = 2; i < Math.sqrt(n); i++){
//            if (n % i == 0) {
//                // 하나라도 나누어 떨어지면 소수가 아니다.
//                return false;
//            }
//        }

        // 이곳까지 도달하면
        //1. 나누어 떨어지는 수가 없었거나
        //2. 2여서 반복문에 들어가지 않는 경우 소수이다.
        return true;
    }
}

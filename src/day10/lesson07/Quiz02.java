package day10.lesson07;

public class Quiz02 {
    public static void main(String[] args) {

        // 1
        // [2][3] 크기의 배열을 만드세요. 반복문을 이용해서, 모든 곳에 10을 넣고 출력하세요.

        int[][] arr1 = new int[2][3];

        //입력
        for (int i = 0; i < arr1.length; i++) { // 0 1
            for (int j = 0; j < arr1[i].length; j++) { // 0 1 2
                arr1[i][j] = 10;
            }
            System.out.println();
        }

        // 출력
        printArray(arr1);

        // 2
        // [3][4] 크기의 배열을 만드세요.
        // 반복문을 이용해서, 아래와 같이 각 배열에 1~4를 저장 하고, 출력하세요.

        int[][] arr2 = new int[3][4];

        for (int i = 0; i < arr2.length; i++) { // 0 1 2
            for (int j = 0; j < arr2[i].length; j++) { // 0 1 2 3
                arr2[i][j] = (j + 1);
            }
            System.out.println();
        }

        printArray(arr2);

        // 3
        // [3][3] 크기의 배열을 만드세요.
        // 반복문을 이용해서, 첫 번째 행은 1, 두 번째 행은 2, 세 번째 행은 3으로 채우고 출력하세요.
        //1 1 1
        //2 2 2
        //3 3 3

        int[][] arr3 = new int[3][3];

        for (int i = 0; i < arr3.length; i++) { // 0 1 2
            for (int j = 0; j < arr3[i].length; j++) { // 0 1 2
                arr3[i][j] = (i + 1);
            }
            System.out.println();
        }

        printArray(arr3);

        // 4
        // [5][5] 크기의 배열을 만드세요. 모든 값을 0으로 초기화 하세요.
        // 반복문을 이용해서, 아래와 같이 + 위치에 1을 입력 하고 출력하세요.
        //0 0 1 0 0
        //0 0 1 0 0
        //1 1 1 1 1
        //0 0 1 0 0
        //0 0 1 0 0

        int[][] arr4 = new int[5][5];
        for (int i = 0; i < arr4.length; i++) { // 0 1 2 3 4
            for (int j = 0; j < arr4[i].length; j++) { // 0 1 2 3 4
                // 강사 풀이
                if (i == 2 || j == 2) {
                    arr4[i][j] = 1;
                }

                // 내 풀이
//                arr4[i][2] = 1;
//                arr4[2][j] = 1;
            }
            System.out.println();
        }

        printArray(arr4);

        // 5
        // [3][3] 크기의 배열을 만드세요.
        // 반복문을 이용해서, 아래와 같은 형태로 숫자를 차례로 저장하고 출력 하세요.

        // 강사 풀이
        //1 2 3
        //4 5 6
        //7 8 9
        int[][] arr5 = new int[3][3];

        for (int i = 0; i < arr5.length; i++) { // 0 1 2
            for (int j = 0; j < arr5[i].length; j++) { // 0 1 2
                arr5[i][j] = (i * 3) + (j + 1);
            }
            System.out.println();
        }

        // 내 풀이
//        int[][] arr5 = new int[3][3];
//        int k = 1;
//
//        for (int i = 0; i < arr5.length; i++) { // 0 1 2
//            for (int j = 0; j < arr5[i].length; j++) { // 0 1 2
//                arr5[i][j] = k++;
//            }
//            System.out.println();
//        }

        printArray(arr5);

        // 6
        // 1 4 7
        // 2 5 8
        // 3 6 9

        int[][] arr6 = new int[3][3];
        int z = 1;

        // 강사 풀이
        for (int i = 0; i < arr6.length; i++) { // 0 1 2
            for (int j = 0; j < arr6[i].length; j++) { // 0 1 2
                arr6[j][i] = z++;
            }
            System.out.println();
        }

        // 내 풀이
//        for (int i = 0; i < arr6.length; i++) { // 0 1 2
//            for (int j = 0; j < arr6[i].length; j++) { // 0 1 2
//                arr6[j][i] = z++;
//            }
//            System.out.println();
//        }

        printArray(arr6);


    }

    // 출력 메소드
    // input: 2차원 배열 , output: x
    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

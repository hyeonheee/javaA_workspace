package day09.lesson07;

public class Ex01 {
    public static void main(String[] args) {
        // 2차원 배열
        // 바깥쪽: 행, 안쪽: 열

        int[][] scores = {
                {89, 100, 25},
                {78, 12, 13},
                {51, 74, 36},
                {84, 56, 17},
                {88, 73, 98}};

        System.out.println("3번쨰 학생의 2번째 점수는 : " + scores[2][1]); // 74
        System.out.println("2번째 학생의 1번쨰 점수는 : " + scores[1][0]); // 78
        System.out.println("5번째 학생의 3번째 점수는 : " + scores[4][2]); // 98
        System.out.println();

        // 반복문으로 2차원 배열 값 출력
        for (int i = 0; i < scores.length; i++) { // 학생 수
            for (int j = 0; j < scores[i].length; j++) { // 과목 수
                System.out.println((i + 1) + "번째 학생의 " + (j + 1) + "번쟤 점수는 : " + scores[i][j]);
            }

        }
        System.out.println();


        // 각 학생들의 평균 구하기
        for (int i = 0; i < scores.length; i++) { //학생
            int sum = 0;  // 한 학생의 점수 총합
            for (int j = 0; j < scores[i].length; j++) { // 학생 당 점수들
                sum += scores[i][j];
            }
            double average = (double) sum / scores[i].length;
            System.out.println((i + 1) + "번쨰 학생의 평균 점수는 : " + average + "점");
        }

    }
}

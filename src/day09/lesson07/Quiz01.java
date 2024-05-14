package day09.lesson07;

public class Quiz01 {
    public static void main(String[] args) {

        int[][] scores = {
                {89, 93, 91, 93, 92, 78, 90, 90, 93, 90},
                {91, 82, 72, 98, 92, 87, 77, 87, 74, 88},
                {98, 93, 94, 91, 97, 94, 91, 96, 98, 90},
                {65, 63, 57, 87, 88, 92, 78, 85, 100, 68},
                {45, 50, 48, 63, 67, 58, 40, 66, 47, 64}
        };

        // 1
        // 각 학생의 평균을 각각 구해서 출력하세요.

//        for (int i = 0; i < scores.length; i++) {
//            int sum = 0;
//            for (int j = 0; j < scores[i].length; j++){
//                sum += scores[i][j];
//            }
//            double average = (double)sum / scores[i].length;
//            System.out.println((i+1)+"번째 학생의 평균은 "+average);
//        }


        //2
        //각 학생의 최고 점수를 구해서 출력하세요.

//        for (int i = 0; i < scores.length; i++) { // 학생
//            int max = 0;
//            for (int j = 0; j < scores[i].length; j++) {  // 점수
//                if (max < scores[i][j]) {
//                    max = scores[i][j];
//                }
//            }
//            System.out.println((i + 1) + "번째 학생의 최고점은 " + max);
//        }


        //3
        //평균이 가장 높은 학생의 평균점수와 몇 번째 학생인지 출력하세요.
        // 강사 풀이
//        double max = 0;
//        int maxI = 0;
//
//        for (int i = 0; i < scores.length; i++) {
//            int sum = 0;
//            for (int j = 0; j < scores[i].length; j++) {
//                sum += scores[i][j];
//            }
//            double average = (double) sum / scores[i].length;
//            if (max < average) {
//                max = average;
//                maxI = i;
//            }
//        }
//
//        System.out.println("평균이 가장 높은 학생은 " + (maxI + 1) + "번째 학생이고, 평균 점수는 " + max);


        //4
        // 4번째 과목의 최고 성적의 학생이 몇 번째 학생인지와 점수를 출력하세요.
//        int maxStudent = 0;
//        int maxScore = 0;
//        for (int i = 0; i < scores.length; i++) { // 0 ~ 4
//            if (maxScore < scores[i][3]) {
//                maxScore = scores[i][3];
//                maxStudent = i+1;
//            }
//        }
//
//        System.out.println("4번째 과목의 최고 성적자는 " + maxStudent + "번째 학생이고, 점수는 " + maxScore);


        // 5
        // 시험과목 index 3~7 의 평균이 가장 높은 학생을 구하여 출력하세요.
        // index 3 ~ 7 => j
        double maxAverage = 0;
        int maxStudent = 0;
        for (int i = 0; i < scores.length; i++) {
            int sum = 0;
            for (int j = 3; j <= 7; j++) {
                sum += scores[i][j];
            }
            double average = sum / 5.0;
            if (maxAverage < average) {
                maxAverage = average;
                maxStudent = i + 1;
            }
        }

        System.out.println("3~7과목 평균이 가장 높은 학생은 " + maxStudent + "번째 학생이고, 평균은 " + maxAverage);

    }
}

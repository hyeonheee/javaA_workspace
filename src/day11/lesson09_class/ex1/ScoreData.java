package day11.lesson09_class.ex1;

// 내가 만든 자료형, 설계도
public class ScoreData {
    // 속성: field
    int score;
    String subject;
    int rank;


    // 행위: method
    void printInfo() {
        System.out.println("과목명: "+this.subject);
        System.out.println("점수: "+this.score);
        System.out.println("석차: "+this.rank);
    }

}


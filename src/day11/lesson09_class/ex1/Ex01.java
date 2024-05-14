package day11.lesson09_class.ex1;

public class Ex01 {
    // 나의 의식
    public static void main(String[] args) {

        // 객체(Object)로 만든다.
        // ScoreData의 instance다.
        // new의 경우에는 heap에 쌓인다

        ScoreData sd = new ScoreData();
        sd.subject = "국어";
        sd.score = 85;
        sd.rank = 7;

        // 필드 값 출력하기
        System.out.println(sd.subject);
        System.out.println(sd.score);
        System.out.println(sd.rank);

        sd.printInfo();


    }
}

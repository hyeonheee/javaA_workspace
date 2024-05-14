package day12.lesson2_02.quiz04;

//＊문제는 객관식으로 문제 개수는 총 5개이다.(답은 1~5중에 하나만 선택 가능)
//＊학번과 이름을 입력 받는다.
//＊순서대로 학생의 답 5개를 입력받는 메소드를 만든다.

public class OmrCard {


    // 필드
    private String name;
    private int studentId;
    private int[] answer = new int[5]; // 학생의 값


    //＊학번과 이름을 입력 받는다. (setter, 생성자 둘 다 가능)
    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setAnswer(int a1, int a2, int a3, int a4, int a5) {
        this.answer[0] = a1;
        this.answer[1] = a2;
        this.answer[2] = a3;
        this.answer[3] = a4;
        this.answer[4] = a5;
    }

    public void setAnswer(int[] answer) {
        this.answer = answer;
    }

    public String getName() {
        return this.name;
    }

    public int getStudentId() {
        return this.studentId;
    }

    public int[] getAnswer() {
        return this.answer;
    }

}

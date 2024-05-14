package day16.lesson2_06.ex01;


// 취준생
public class JobApplicant implements Java,Python{

    // spec
    private int toeic;
    private double grade;
    private String[] licenses;

    public String introduce(){
        return "저는 서울에서 태어나~";
    }

    @Override
    public void objectOriented() {
        System.out.println("객체지향이란 클래스와 객체가 있고~");
    }

    @Override
    public void ai() {
        System.out.println("모르겠다.");
    }
}

package day16.lesson2_06.quiz01;

public class EntertainerApplicant implements Act,Sing{


    @Override
    public void act() {
        System.out.println("연기를 한다.");
    }

    @Override
    public void sing() {
        System.out.println("노래를 한다.");
    }
}

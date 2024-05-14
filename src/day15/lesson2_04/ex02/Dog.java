package day15.lesson2_04.ex02;


//자식 클래스
public class Dog extends Animal{

    @Override
    public void cry() {
        System.out.println("멍멍");
    }

    public void lash() {
        System.out.println("꼬리치기");
    }
}

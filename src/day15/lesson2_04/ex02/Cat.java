package day15.lesson2_04.ex02;

// 자식 클래스
public class Cat extends Animal{
    @Override
    public void cry() {
        System.out.println("야옹");
    }

    public void grooming(){
        System.out.println("구르밍");
    }
}

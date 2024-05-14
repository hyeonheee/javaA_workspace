package day12.lesson2_02.quiz02;

public class CircleTest {
    public static void main(String[] args) {

        Circle circle = new Circle(8);
        System.out.println("원의 넓이: "+circle.area());
        System.out.println("원의 둘레: "+circle.round());
        System.out.println("원 25개의 넓이: "+circle.area(25));


    }

}

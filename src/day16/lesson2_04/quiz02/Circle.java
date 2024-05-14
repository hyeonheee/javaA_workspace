package day16.lesson2_04.quiz02;

public class Circle extends Shape {

    // 강사 풀이
    public Circle(int radius) {
        super.name = "원";
        super.area = radius * radius * 3.14; // super, this 둘 다 가능하다.
    }


    // 내 풀이
//    private int radius;
//
//    public Circle(int radius) {
//        this.radius = radius;
//    }
//
//    @Override
//    public void printArea() {
//        System.out.println("도형은 원이며 넓이는 " + area() + "cm^2입니다.");
//    }
//
//    public double area() {
//        return this.radius * this.radius * 3.14;
//    }
}

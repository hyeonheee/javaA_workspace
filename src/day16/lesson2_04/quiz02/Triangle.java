package day16.lesson2_04.quiz02;

public class Triangle extends Shape {
    private int base;
    private int height;


    // 생성자
    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void printArea() {
        System.out.println("도형은 삼각형이며 넓이는 " + area() + "cm^2입니다.");
    }

    public double area() {
        return (this.base * this.height * 0.5);
    }
}

package day16.lesson2_04.quiz02;

public class Rectangle extends Shape {

    // 강사 풀이
    public Rectangle(int width, int height) {
        super.name = "사각형";
        super.area = width * height;
    }


    // 내 풀이
//    private int base;
//    private int height;
//
//    public Rectangle(int base, int height) {
//        this.base = base;
//        this.height = height;
//    }
//
//    @Override
//    public void printArea(){
//        System.out.println("도형은 사각형이며 넓이는 "+area()+"cm^2입니다.");
//    }
//    public double area(){
//        return base* height;
//    }

}

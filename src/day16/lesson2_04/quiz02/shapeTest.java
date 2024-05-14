package day16.lesson2_04.quiz02;

public class shapeTest {
    public static void main(String[] args) {

        // 부모 타입으로 저장
        Shape[] shape = new Shape[3];

        // up casting
        shape[0] = new Triangle(8, 10);
        shape[1] = new Rectangle(7, 13);
        shape[2] = new Circle(12);

        for (int i = 0; i < shape.length; i++) {
            shape[i].printArea();
        }
    }
}

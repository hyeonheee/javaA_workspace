package day12.lesson2_01_class.ex01;

public class CellphoneTest {
    public static void main(String[] args) {
        Cellphone cp1 = new Cellphone();
        cp1.maker = "apple";
        cp1.color = "Red";
        cp1.model = "iphone14";
        cp1.price = 1234;

        System.out.println(cp1.maker);
        System.out.println(cp1.color);
        System.out.println(cp1.model);
        System.out.println(cp1.price);

        cp1.call();
        cp1.camera();

        // 값 변경
        cp1.color = "black";
        System.out.println(cp1.color);



    }
}

package day12.lesson2_02.quiz03;

public class ProductTest {
    public static void main(String[] args) {

        Product product = new Product("새우깡", 1300, "2025-05-22");

        System.out.println("이름: " + product.getName());
        System.out.println("가격: " + product.getPrice());
        System.out.println("유통기한: " + product.getExpiration());
        System.out.println();

        System.out.println("제품 5개의 가격: "+product.calculatePrice(5));
        System.out.println("제품 13개의 가격: "+product.calculatePrice(13));


        System.out.println(product.availableSale());
        System.out.println(product.availableSale2());
    }
}

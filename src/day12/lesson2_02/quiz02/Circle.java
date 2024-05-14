package day12.lesson2_02.quiz02;


public class Circle {

    //필드
    //어떻게 채울것인가? 1. 생성자 2. setter
    private int radius;


    // 메소드
    // 생성자 - 필드에 값 넣기
    public Circle(int radius) {
        this.radius = radius;
    }

    // 넓이 구하기
    public double area() {
        return this.radius*this.radius*3.14; // Math.PI도 가능
    }

    // 둘레 구하기
    public double round() {
        return this.radius*2*3.14;
    }

    // 개수에 따른 넓이
    // 오버로딩(Overloading) :
    // 메소드 이름은 같은데 파라미터의 개수나, 타입이 다른 경우
    // 다른 메소드로 인지하고, 일치하는 메소드로 바로 호출되는 것
    public double area(int num) { //확장성을 위해 파라미터로 개수를 받아온다.
        return area()*num;
    }



}

package day12.lesson2_02.quiz01;

public class Rectangle {

    // 필드
    // 어떻게 세팅할 것인가?  1. 생성자 2. setter
    private int width; // 가로
    private int height; // 세로


    // 메소드
    // 생성자 - 필드 세팅
    // 객체가 생성되는 시점에 한번만 호출
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
        System.out.println("가로 " + this.width + " cm, 세로 " + this.height + "cm 사각형이 만들어졌습니다.");
    }

    // SETTER
    // main에서 값을 변경 할 수 있게 허용
    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    // 넓이 구하기
    public int area() {
        return this.width * this.height;
    }

    // 둘레 구하기
    public int round() {
        return (this.width * 2 + this.height * 2);
    }
}

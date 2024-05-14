package day12.lesson2_01_class.Quiz01;

public class Person {

    // 필드
    String name;
    String birth;
    String gender;


    // 메소드
    void greet() {
        System.out.println("안녕하세요");
    }

    void walk() {
        System.out.println("걷기");
    }

    void introduce() {
        System.out.println("내 이름은 " + this.name + " 이고 성별은 " + this.gender + "이다.");
    }

    void age() {
        // age는 일반 변수이다.
        int age = 2024 - Integer.parseInt(birth.substring(0, 4));
        System.out.println("나이는 " + age + "세이다.");
    }
}

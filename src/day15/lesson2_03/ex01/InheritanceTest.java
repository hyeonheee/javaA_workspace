package day15.lesson2_03.ex01;

public class InheritanceTest {
    public static void main(String[] args) {

//        Person person = new Person("홍길동");
//        person.introduce();

        // 자식 객체로 생성하면, 부모 생성자가 먼저 불려지고, 후에 자식 생성자가 불려진다.
        Student student = new Student("홍길동","컴퓨터");
        student.introduce();


    }
}

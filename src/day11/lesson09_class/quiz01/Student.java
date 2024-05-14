package day11.lesson09_class.quiz01;

public class Student {

    // field
    String name;
    String className;
    int age;
    String phoneNumber;

    // method
    void isAdult() {
        if (this.age >= 20) {
            System.out.println(this.name + "은 성인입니다.");
        } else {
            System.out.println(this.name + "은 미성년자입니다.");
        }

    }

}

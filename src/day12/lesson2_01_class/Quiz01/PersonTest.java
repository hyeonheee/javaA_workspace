package day12.lesson2_01_class.Quiz01;

public class PersonTest {
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.name = "사람1";
        person1.birth = "19950808";
        person1.gender = "여";

        person1.greet();
        person1.walk();
        person1.introduce();
        person1.age();
    }
}

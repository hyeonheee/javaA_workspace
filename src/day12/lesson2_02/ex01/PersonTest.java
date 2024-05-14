package day12.lesson2_02.ex01;


public class PersonTest {
    public static void main(String[] args) {

//        Person p1 = new Person("사람1","19950505","여자");
        Person p1 = new Person();
//        p1.name = "사람1";
//        p1.birth = "19950808";
//        p1.gender = "여자";

        p1.setName("사람2");  // 이름 변경
        p1.setBirth("19981212"); // 생년월일 변경
        p1.setGender("남자");

        p1.greet();
        p1.walk();
        p1.introduce();
        p1.printAge();

        System.out.println(p1.getName());
        System.out.println(p1.getBirth());
        System.out.println(p1.getGender());
    }
}

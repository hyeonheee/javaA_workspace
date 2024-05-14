package day15.lesson2_03.ex01;


// 부모 클래스 , Super Class
public class Person {
    protected String name; // 자식, 같은 패키지에 열어줌 (protected)

    public Person(){
        System.out.println("응애");
    }

    // 생성자 오버로딩
    public Person(String name){
        this.name=name;
        System.out.println("파라미터 있는 생성자");
    }

    public void introduce(){
        System.out.println("내 이름은 "+this.name+"입니다.");
    }
}

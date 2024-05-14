package day12.lesson2_02.ex01;

public class Person {

    // 필드
    // private으로 설정하는 것 : 은닉화(Hiding)
    private String name;
    private String birth;
    private String gender;

    // 메소드


    // 생성자(Constructor) : 객체가 생성될 때 한번만 불려지는 특수한 메소드
    // return 타입이 아예 존재하지 않는다, class명과 동일하다.
    public Person() {
        System.out.println("응애");
    }

    // 생성자 오버로딩(Overloading)
    // 파라미터의 타입이 다르거나, 개수가 다를때 일치되는 메소드가 선택된다. (input만 해당되고, output(return)에 대해서는 해당x)
    public Person(String name, String birth, String gender) {
        this.name = name;
        this.birth = birth;
        this.gender = gender;
        System.out.println("파라미터 있는 생성자 호출");
    }

    // setter - 필드값을 외부에서 받은 값으로 세팅한다.
    // main에서 값을 변경해주고 싶으면 만들어주고, 변경을 원하지 않으면 setter을 만들지 않는다.
    public void setName(String name) {
        this.name = name;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    // getter - 필드를 외부에 넘겨준다.
    // 캡슐화(Encapsulation)
    public String getName() {
        return this.name;
    }

    public String getBirth() {
        return this.birth;

    }

    public String getGender(){
        return this.gender;
    }

    public void greet() {
        System.out.println("안녕하세요");
    }

    public void walk() {
        System.out.println("걷기");
    }

    public void introduce() {
        System.out.println("내 이름은 " + this.name + " 이고 성별은 " + this.gender + "이다.");
    }

    public void printAge() {
        // age는 일반 변수이다.
        int age = 2024 - Integer.parseInt(birth.substring(0, 4));
        System.out.println("나이는 " + age + "세이다.");
    }
}

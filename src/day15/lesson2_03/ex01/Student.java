package day15.lesson2_03.ex01;


// 자식 클래스 child class
// 상속
public class Student extends Person{
    private String major;

    public Student() {
        System.out.println("학생입니다.");
    }

    public Student(String name, String major){
        // 부모클래스의 name 필드에 값 저장

        super(); // 부모의 생성자를 호출 - (항상 첫줄에 있어야 한다)
        this.major = major;

        // 부모로부터 상속받은것
        //this.name = name;
        //super.name =name;

    }

    // 오버라이드(Override): 부모 클래스에 있는 메소들 자식 클래스에서 "재정의" 하는것

   @Override //annotation : 메타정보
   public void introduce(){

        super.introduce(); //부모에 있는 기능 사용 가능
       System.out.println("내 전공은 "+this.major+"입니다.");

    }



}

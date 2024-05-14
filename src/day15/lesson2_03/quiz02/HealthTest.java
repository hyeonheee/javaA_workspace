package day15.lesson2_03.quiz02;

public class HealthTest {
    public static void main(String[] args) {

        // 생성자를 만들지 않으면 파라미터가 없는 기본생성자가 만들어진다.
        // 파라미터가 있는 생성자를 내가 만들면, 기본 생성자가 만들어지지 않는다.

        // 상속을 받는 자식 클래스의 객체를 생성할 때, 부모 생성자가 먼저 호출된 뒤, 다음 자식 생성자가 호출 된다.

        // 임의로 부모 생성자를 부르지 않으면, 부모의 기본 생성자를 호출하려 시도한다.
        // 그런데 부모의 기본 생성자가 없었기 때문에 에러가 발생했다.
        // 그래서 3개의 파라미터가 있는 부모 생성자를 호출해야 에러가 나지 않는다.
        // 또는 부모의 기본 생성자를 만들어도 괜찮다.


        // 자식 클래스로 객체를 만든다
        HealthRate healthRate1 = new HealthRate("박둘리",160,45);
        healthRate1.showInfo();
        HealthRate healthRate2 = new HealthRate("홍길동",168,90);
        healthRate2.showInfo();
    }
}

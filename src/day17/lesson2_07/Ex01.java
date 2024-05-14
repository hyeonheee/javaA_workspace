package day17.lesson2_07;

public class Ex01 {
    public static void main(String[] args) {

        // 1. 기본 자료형(Primitive type)
        int n1 = 5;
        System.out.println(n1);

        // 2. 래퍼 클래스(Wrapper class)
        Integer n2 = 5;
        System.out.println(n2);

        // 3. 래퍼 클래스 객체 생성
        Integer n3 = new Integer(5);
        System.out.println(n3);

        Integer n4 = 5;


        System.out.println(n1 == n2); //true - 값 비교
        System.out.println(n1 == n3); //true - 값 비교
        System.out.println(n2 == n3); //false - heap의 주소값 비교
        System.out.println(n2 == n4); //true - 주소값 비교 heap 영역의 constant pool(재활용)
        System.out.println("-------------");

        //객체 간 비교는 equals() 사용 => 주소값 비교이기 때문
        System.out.println(n2.equals(n3)); //true 값 비교


    }
}

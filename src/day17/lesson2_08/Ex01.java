package day17.lesson2_08;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Ex01 {
    public static void main(String[] args) {
        // 배열(Array)
        // 1. 크기를 미리 알고 있어야 한다. 크기가 고정되어 있다.
        // 2. 중간에 있는 값을 빼내면, 그 칸은 비어있는 채로 유지된다.
        // 3. index 기반으로 접근 가능
        // 4. 배열 생성 시 모든 타입 가능(기본 자료형,클래스 자료형)

        // 리스트(List)
        // 1. 크기가 고정되어 있지 않고, 동적으로 할당 된다.(추가,삭제)
        // 2. 중간에 있는 값을 빼내면 앞으로 당겨진다. (메모리 낭비가 적음)
        // 3. 여러 방법으로 데이터를 쉽게 다룰 수 있다(메서드 사용)
        // 4. 클래스 자료형만 담을 수 있다.(기본 자료형 사용 불가)
        // 5. 타입 안정성을 보장하는 Generic 문법을 사용한다.


        // Arraylist
        // 조회 하는게 용이하다.
        List<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(3);
        System.out.println(list1.add(3));
        System.out.println("list1 : " + list1);
        System.out.println("list1 : " + list1.toString());


        // Linkedlist
        // List 인터페이스의 자식 Linkedlist(구현체)
        // 삭제,추가가 용이하다.
        List<Integer> list2 = new LinkedList<>();
        list2.add(13);
        list2.addAll(list1);
        System.out.println("list2 : " + list2);


        // 요소값 수정
        // 첫번째 값 13 -> 200으로 변경 (set)
        System.out.println("set : " + list2.set(0, 200)); // 원래 있던 값 13이 출력된다.
        System.out.println("list2 : " + list2);


        // 요소값 삭제
        // index 1 값 삭제
        int deletedValue = list2.remove(1); // 삭제 되는 값(index 1칸 삭제) 5가 출력된다.
        System.out.println("deletedValue : " + deletedValue);
        System.out.println("list2 : "+list2);

        List<String> strList = new ArrayList<>();
        strList.add("abc");
        strList.add("qwer");
        System.out.println(strList.remove("qwer")); // boolean으로 return 된다.
        System.out.println("strList : "+strList);


        // 모든 요소 삭제
        list2.clear();
        System.out.println("list2 : "+list2);





    }
}

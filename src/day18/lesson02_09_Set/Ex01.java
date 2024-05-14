package day18.lesson02_09_Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Ex01 {
    public static void main(String[] args) {
        // List - 순서가 있음, 중복 가능, index가 존재
        // Set - 순서가 없음, 중복 없음, index가 존재x, 집합, get()이 없다

        Set<Integer> set1 = new HashSet<>();
        set1.add(3);
        set1.add(2);
        set1.add(1);

        // 중복된 값은 넣어지지 않음
        System.out.println(set1.add(3)); //boolean 으로 return
        System.out.println("Set1: " + set1);

        Set<Integer> set2 = new HashSet<>();
        set2.add(10);
        set2.add(11);
        set2.addAll(set1);
        System.out.println("set2 : "+set2);

        // set2에 10이 존재하는가?
        System.out.println(set2.contains(10));

        // set2-set1 차집합
        set2.removeAll(set1); // set2에 저장됨
        System.out.println("set2 - set1 : "+set2);


        //TreeSet
        Set<String> set3 =new TreeSet<>();
        set3.add("c");
        set3.add("b");
        set3.add("a");
        System.out.println("set3 : "+set3);

        // 반복문 출력
        // Set은 index가 없으므로 일반 for문 불가

        // 1. Iterator
        Iterator<String> iter = set3.iterator();
        while (iter.hasNext()){
            String element = iter.next();
            System.out.println(element);
        }

        // 2. 향상된 for문
        for (Integer num : set2){
            System.out.println(num);
        }


    }
}

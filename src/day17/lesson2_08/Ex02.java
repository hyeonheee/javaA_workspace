package day17.lesson2_08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex02 {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");

        //1. index 기반
//        for (int i = 0; i < fruits.size(); i++) {
//            System.out.println(fruits.get(i));
//
//            String fruit = fruits.get(i);
//            if(fruit.startsWith("b")){
//                fruits.remove(i);
//                i--; // 삭제된 후 i가 그 자리에 머물기 위해 (사이즈가 변경 되기 때문에)
//            }
//        }


        //2. Iterator 사용
        Iterator<String> iter = fruits.iterator();
        while (iter.hasNext()) {
            String fruit = iter.next(); //next() 할때마다 커서가 다음으로 넘어가서 한번만 수행
            System.out.println(fruit);

            if(fruit.startsWith("b")){
                // fruits.remove(fruit); iterator 사용시 리스트에서 직접 삭제하지 않는다.
                iter.remove();
            }

        }


        //3. 향상된 for문
        //money in pocket
        //list를 중간에 변경 시키면 안된다.
        // 조회를 할때만 향상된 for문 사용
//        for(String fruit : fruits){ //apply, banana, cherry
//            System.out.println(fruit);
//
//            if(fruit.startsWith("b")){
//                fruits.remove(fruit);
//            }
//        }


        System.out.println(fruits);


    }
}

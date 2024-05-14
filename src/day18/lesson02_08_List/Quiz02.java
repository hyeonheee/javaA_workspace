package day18.lesson02_08_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Quiz02 {
    public static void main(String[] args) {


        //1. 내 풀이
        // List<Integer> list = Arrays.asList(20, 3, 5, 84, 17);

        //1. 강사 풀이
        // 위와 동일 하게 고정 list
        List<Integer> list = new ArrayList<>(List.of(20, 3, 5, 84, 17));


        //2. 내 풀이
//        int min = list.getFirst();
//        for (int i = 0; i < list.size(); i++) {
//            //System.out.println(list.get(i));
//
//            if (list.get(i) < min) {
//                min = list.get(i);
//            }
//        }
//        System.out.println(min); //3


        //2. 강사 풀이
        int min = list.get(0); // 값을 꺼내는거는 get
        for (int i = 1; i < list.size(); i++) { //1~4
            if (min > list.get(i)) {
                min = list.get(i);
            }
        }

        System.out.println(min);

        //3. 내 풀이
//        Iterator<Integer> iter = list.iterator();
//        int sum = 0;
//        while (iter.hasNext()) {
//
//            int num = iter.next(); //Iterator에서 값을 꺼내는것
//            sum += num;
//            // System.out.println(num);
//
//        }
//        System.out.println(sum); //129


        //3. 강사 풀이
        Iterator<Integer> iter = list.iterator();
        int sum = 0;

        while (iter.hasNext()) {
            int number = iter.next();
            sum += number;

        }
        System.out.println(sum); //129

    }
}

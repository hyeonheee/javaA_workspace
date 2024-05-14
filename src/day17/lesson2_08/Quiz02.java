package day17.lesson2_08;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Quiz02 {
    public static void main(String[] args) {

        //1.
        List<Integer> list = Arrays.asList(20, 3, 5, 84, 17);


        //2.
        int min = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            //System.out.println(list.get(i));

            if (list.get(i) < min) {
                min = list.get(i);
            }
        }
        System.out.println(min); //3


        //3.
        Iterator<Integer> iter = list.iterator();
        int sum = 0;
        while (iter.hasNext()) {

            int num = iter.next();
            sum+=num;
            // System.out.println(num);

        }
        System.out.println(sum); //129

    }
}

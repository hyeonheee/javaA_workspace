package day20.lesson10_Map;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Quiz06 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<String> fruits = new ArrayList<>();

        while (true) {
            System.out.println("1:입력 2:출력 3:삭제 4:종료");
            int num = scan.nextInt();

            if (num == 1) { //입력
                System.out.print("과일 이름을 입력하세요: ");
                fruits.add(scan.next());
                System.out.println("입력 성공");

                // System.out.println(fruits.add(scan.next()) ? "입력 성공" : "입력 실패");

            } else if (num == 2) { //출력
                // 내 풀이
//                if (!fruits.isEmpty()) {
//                    for (int i = 0; i < fruits.size(); i++) {
//                        System.out.println(fruits.get(i));
//                    }
//                } else {
//                    System.out.println("비어있습니다.");
//                }

                // 강사 풀이
                if (fruits.isEmpty()) {
                    System.out.println("비어 있습니다.");
                    continue;
                }

                Iterator<String> iter = fruits.iterator();
                while (iter.hasNext()) {
                    System.out.println(iter.next());
                }

            } else if (num == 3) { //삭제
                System.out.print("삭제할 과일 이름을 입력하세요: ");

                // 강사 풀이
                String delFruit = scan.next();
                System.out.println(fruits.remove(delFruit) ? "삭제 성공" : "삭제 실패 ");

                // 내 풀이
//                fruits.remove(scan.next());
//                System.out.println("삭제 성공");

            } else if (num == 4) { //종료
                System.out.println("종료합니다.");
                break;

            } else {
                System.out.println("잘못 입력하셨습니다.");
            }
        }
    }
}

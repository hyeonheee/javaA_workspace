package day20.lesson10_Map.quiz07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class PersonMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Person> personList = new ArrayList<>();


        while (true) {
            System.out.println("1:입력 2:출력 3:삭제 4:종료 ");
            int num = scan.nextInt();


            if (num == 1) {

                Person person = new Person();
                System.out.print("이름을 입력하세요: ");
                person.setName(scan.next());

                System.out.print("생년월일을 입력하세요: ");
                person.setBirth(scan.nextInt());

                System.out.println(personList.add(person) ? "입력 성공" : "입력 실패");

                // 생성자에서 작성한 경우
                // personList.add(new person(name,birth));

            } else if (num == 2) { // 출력

                if (personList.isEmpty()) {
                    System.out.println("비어있습니다.");
                } else {

                    // person 클래스에서 toString을 오버라이드 했기 때문에 personList로 출력해도 가능하다.
                    System.out.println(personList);

//                    for (int i = 0; i < personList.size(); i++) {
//                        // map이 아니라 내가 만든 class라서 해쉬값이 나온다
//                        // get을 하지 않으면 해쉬값이 나온다
//                        // 그래서 getname, getbirth를 가져와야한다.
//                        System.out.println("이름: " + personList.get(i).getName() + ", 생년월일: " + personList.get(i).getBirth());
//                    }
                }

            } else if (num == 3) { // 삭제

                System.out.print("삭제할 사람 이름을 입력하세요: ");
                String delName = scan.next();
                Iterator<Person> iter = personList.iterator();

                while (iter.hasNext()) {
                    Person person = iter.next();
                    if (person.getName().equals(delName)) { //delName.equals(person.getName())도 가능
                        // personList.remove(person); 이렇게 하면 안된다.
                        iter.remove(); // 커서가 가르키고 있는 부분을 삭제한다. 
                        System.out.println("삭제 되었습니다.");
                    }
                }

            } else if (num == 4) {
                System.out.println("종료합니다.");
                break;
            } else {
                System.out.println("잘못 입력했습니다.");

            }
        }

    }

}


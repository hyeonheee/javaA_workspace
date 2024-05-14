package day10.lesson08_String;

public class Quiz02 {
    public static void main(String[] args) {
        // 1
        // 아래 문자열에서 A 를 B로 바꿔서 출력 하세요.
        String gradeStr = "My grade is A";
        String replaceB = gradeStr.replace("A", "B");
        System.out.println(replaceB);

        // 2
        // 아래와 같이 생년월일이 저장된 String 이 있을때 올해 나이를 출력하세요.
        String birth = "19950721";
        String year = birth.substring(0, 4); // 1995만 가져오기
        int age = 2024 - Integer.parseInt(year);
        System.out.println(age + "세");

        // 3
        // 아래 문자열의 단어 개수를 출력 하세요.(중복 포함)
        String sentence = "To be, or Not to Be. That Is The Question";
        String[] words = sentence.split(" ");
//        int count = 0;
//
//        for (int i = 0; i < words.length; i++) {  // length는 함수가 아니고 배열의 길이
//            count++;
//        }
//        System.out.println("단어 개수: " + count);
        System.out.println(words.length + "개");

    }
}


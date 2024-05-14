package day10.lesson08_String;

public class Quiz01 {
    public static void main(String[] args) {
        // 아래와 같이 생년이 저장된 String 이 있을 때 올해 나이를 출력하세요.

        String birthday = "1995";
        int age = 2024 - Integer.parseInt(birthday);
        System.out.println(age+"세");
    }
}

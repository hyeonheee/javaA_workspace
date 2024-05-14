package day10.lesson08_String;

public class Ex02 {
    public static void main(String[] args) {
        // 자료형 변환

        //1. 숫자 -> 문자열 (3 -> "3")
        int number1 = 3;

        //별로 좋지 않은 방법
        String str1 = number1 + ""; // 숫자 + 문자열 => 문자열

        // 또 다른 방법
        String str2 = String.valueOf(number1);

        //2. 문자열 -> 숫자 ("5" -> 5)
        String str3 = "5";
        int number3 = Integer.valueOf(str3);
        int number4 = Integer.parseInt(str3);
    }
}

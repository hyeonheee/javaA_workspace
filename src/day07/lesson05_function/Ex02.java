package day07.lesson05_function;

public class Ex02 {
    public static void main(String[] args) {
        // 메소드를 사용하는 곳
        int x = 3;
        int y = 5;
        int result = sum(x, y); // x,y => 인자값,전달인수,argument
        System.out.println(result);
        System.out.println();
        System.out.println(sum(x,y)); // sum을 호출한다. call한다. 부른다. 사용한다.

        printHelloWorld();

    }

    // 메소드를 만드는 곳
    // static(정적): static 메소드가 다른 메소드를 부르는 경우
    // 메모리에 없으면 참조할 수 없기 때문에 static으로 정의
    public static int sum (int a, int b) { //a,b => 매개변수, parameter
        System.out.println("sum 메서드 호출");
        return a + b;
    }

    // input, output 없는 메소드
    public static void printHelloWorld () {
        System.out.println("Hello World");
        return; // return을 만나면 메서드 종료 (void인 경우 생략 가능)
    }

}

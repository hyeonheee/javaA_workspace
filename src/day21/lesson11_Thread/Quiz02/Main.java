package day21.lesson11_Thread.Quiz02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Stopwatch watch = null;
        // 스톱워치 기능을 계속 사용하기 위해 무한루프
        while (true) {
            System.out.println("시작을 쓰면 스톱워치가 수행되고, 그만을 쓰면 스톱워치가 중단됩니다.");

            String command = scan.next();
            if (command.equals("시작")) {
                watch = new Stopwatch(); //새로 시작을 할 때마다 new로 새로 만든 객체에 해야한다.
                watch.start(); //초를 센다.
            } else if (command.equals("그만")) {
                watch.setStop(true); // 초를 멈춘다.
                System.out.println("걸린 시간: "+watch.getSeconds()+"초");
            }
        }

    }
}

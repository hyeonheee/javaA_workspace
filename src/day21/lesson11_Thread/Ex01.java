package day21.lesson11_Thread;

public class Ex01 {
    public static void main(String[] args) throws InterruptedException {
        // 쓰레드 만들기 1 : Thread 클래스 상속 받아 사용
        // 단점) 자바는 단일 상속임으로, 쓰레드를 상속 받으면 다른 클래스는 상속 받을 수 없음
        ThreadExtends te1 = new ThreadExtends("●");
        ThreadExtends te2 = new ThreadExtends("○");

        //Single Thread : 순차적으로 수행
//        te1.run();
//        te2.run();

        //Multi Thread : 각각의 쓰레드가 동시에 수행
//        te1.start();
//        te2.start();


        // 쓰레드 만들기 2 : Runnable 인터페이스 구현
        // 장점) 상속 가능, 다중 구현 가능
        // 멀티쓰레드를 위해 Thread 객체에 담아서 사용해야 한다
        ThreadImplements ti1 = new ThreadImplements("★");
        ThreadImplements ti2 = new ThreadImplements("☆");
        Thread t1 = new Thread(ti1);
        Thread t2 = new Thread(ti2);

        //Single Thread : 순차적으로 수행
//        ti1.run();
//        ti2.run();

        //Multi Thread : 각각의 쓰레드가 동시에 수행
        t1.start();
        t1.join(); // lock: main 메소드가 t1쓰레드가 끝날 때까지 기다림
        t2.start();
        t2.join();


        System.out.println("main 메소드 끝");
    }


}

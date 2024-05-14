package day21.lesson11_Thread.Quiz01;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        //동물원에 동물 3마리가 있다.
        //각 동물들은 1초에 한번씩 울음소리를 낸다.
        //항상 2마리의 동물이 먼저 울고 남은 한마리 동물이 나중에 운다.
        //각 동물은 5번씩만 울고 잠에 든다.

        AnimalThread animal1=new AnimalThread("어흥");
        AnimalThread animal2=new AnimalThread("음메~");
        AnimalThread animal3=new AnimalThread("히잉");
        Thread tiger = new Thread(animal1);
        Thread cow = new Thread(animal2);
        Thread horse = new Thread(animal3);

        tiger.start();
        cow.start();
        tiger.join();
        cow.join();
        horse.start();
    }
}

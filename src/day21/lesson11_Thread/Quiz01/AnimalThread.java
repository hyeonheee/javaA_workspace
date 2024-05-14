package day21.lesson11_Thread.Quiz01;

public class AnimalThread implements Runnable {

    private String cry;

    public AnimalThread(String cry) {
        this.cry = cry;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(this.cry);
            try {
                Thread.sleep(1000); //1초
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

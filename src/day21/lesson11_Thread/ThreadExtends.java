package day21.lesson11_Thread;

public class ThreadExtends extends Thread {
    private String resource;

    // 생성자
    public ThreadExtends(String resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        // 여기서 구현하는 내용이 쓰레드에서 수행되는 내용

        //resource 10번 출력
        for (int i = 0; i < 10; i++) {
            System.out.println(this.resource);
            try {
                Thread.sleep(300); //0.3초씩 쉰다.
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


}

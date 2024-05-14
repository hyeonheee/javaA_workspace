package day21.lesson11_Thread.Quiz02;
public class Stopwatch extends Thread{

    private boolean stop; //stop flag
    private int seconds; //결과 초

    @Override
    public void run(){
        while (!stop){ //false가 되면 시작, true가 되면 그만
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            this.seconds++;
        }
    }

    public int getSeconds(){
        return this.seconds;
    }

    public void setStop(boolean stop){
        this.stop = stop;
    }

}

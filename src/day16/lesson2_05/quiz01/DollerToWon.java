package day16.lesson2_05.quiz01;

public class DollerToWon extends Converter {


    public DollerToWon(int won){
        super.ratio = won;
    }

    @Override
    public void printConverted() {
        System.out.println((int)super.result+"원");
    }
}

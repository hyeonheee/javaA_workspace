package day16.lesson2_05.quiz01;

import java.util.Random;

public class CmToInch extends Converter{

    public CmToInch() {
        super.ratio = 0.394;
    }

    public void printConverted(){
        System.out.println((double) super.result+"inch");
    }

}

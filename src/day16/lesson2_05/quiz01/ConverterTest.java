package day16.lesson2_05.quiz01;

public class ConverterTest {

    public static void main(String[] args) {
        Converter d2w = new DollerToWon(1356); // 환율 검색하기
        d2w.convert(10000); // input 값
        d2w.printConverted();

        Converter c2i = new CmToInch(); // cm -> inch 비율 검색하기
        c2i.convert(20); // input 값
        c2i.printConverted();
    }

}

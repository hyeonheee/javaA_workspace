package day14.lesson2_02.quiz05;

public class LottoTest {
    public static void main(String[] args) {

        // 나의 의식
        //1. 로또 수동으로 주세요
        Lotto lotto1 = new Lotto();
        lotto1.manual(new int[]{2, 4, 12, 34, 43, 7});

        // 수동 번호 출력(로또)
        lotto1.printLottoNumber();



        //2. 로또 자동으로 주세요
        Lotto lotto2 = new Lotto();
        lotto2.auto();
        // 자동 번호 출력(로또)
        lotto2.printLottoNumber();



        //3. 로또 체커로 확인 => 1번만 생성
        // ---당첨 번호는 생성자에서 세팅
        // ---당첨번호 출력
        LottoChecker checker = new LottoChecker();
        checker.printLottoNumber();

        // 로또 결과 확인
        String lottoResult1 = checker.check(lotto1);
        System.out.println(lottoResult1);

        String lottoResult2 = checker.check(lotto2);
        System.out.println(lottoResult2);


    }
}

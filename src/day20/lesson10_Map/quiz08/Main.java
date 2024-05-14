package day20.lesson10_Map.quiz08;

public class Main {
    public static void main(String[] args) {

        Goods goods1 =new Goods("당근",1000,"판매중");
        Goods goods2 =new Goods("당근",1000,"판매중");
        Goods goods3 =new Goods("사과",2000,"판매완료");
        Market market =new Market();
        market.create(goods1);
        market.create(goods2);
        market.create(goods3);
        market.read();
        market.updatePrice(goods1.getName(),2000);
        market.read();
        market.delete(goods1.getName());
        market.read();



    }
}

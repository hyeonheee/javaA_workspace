package day20.lesson10_Map.quiz08;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Market {
    List<Goods> goodsList = new ArrayList<>();

    public void create(Goods goods) {
        Iterator<Goods> iter= this.goodsList.iterator();
        while (iter.hasNext()){
            Goods savedGoods = iter.next();
            if(savedGoods.getName().equals(goods.getName())){
                System.out.println("등록된 상품이 존재합니다.");
                return;
            }
        }
        if(!goods.getState().equals("판매중") && !goods.getState().equals("판매완료") && !goods.getState().equals("예약중")){
            System.out.println("판매상태가 유효하지 않습니다.");
            return;
        }

        boolean add = this.goodsList.add(goods);
        System.out.println(add? "추가되었습니다":"실패했습니다.");

    }


    // 상품 출력
    public void read() {
        if (this.goodsList.isEmpty()) {
            System.out.println("비어있습니다.");
            return;
        } else {
            Iterator<Goods> iter = goodsList.iterator();
            while (iter.hasNext()) {
                Goods goods = iter.next();
                System.out.println("물품명: " + goods.getName() + ", 가격: " + goods.getPrice() + ", 판매상태: " + goods.getState());
            }
        }
    }


    // 상품 가격 수정
    public void updatePrice(String name, int price) {
        Goods goods = getGoodsByName(name);
        if (goods == null) {
            System.out.println("수정할 상품이 존재하지 않습니다.");
            return;
        }
        goods.setPrice(price);
        System.out.println("수정되었습니다.");

    }

    public void updateState(String name, String state){
        Goods goods =getGoodsByName(name);
        if (goods==null){
            System.out.println("수정할 상품이 존재하지 않습니다.");
            return;
        }
        if(!state.equals("판매중") && !state.equals("판매완료") && !state.equals("예약중")){
            System.out.println("판매상태가 유효하지 않습니다.");
            return;
        }

        goods.setState(state);
    }


    public void delete(String name) {

        Iterator<Goods> iter = goodsList.iterator();
        while (iter.hasNext()) {
            Goods goodsName = iter.next();
            if (!goodsName.getName().equals(name)) {
                System.out.println("삭제할 상품이 존재하지 않습니다.");
            } else {
                iter.remove();
                System.out.println("삭제 되었습니다.");
                break;
            }
        }
    }

    private Goods getGoodsByName(String name) {
        Iterator<Goods> iter = this.goodsList.iterator();
        while (iter.hasNext()) {
            Goods goods = iter.next();
            if (goods.getName().equals(name)) {
                return goods;
            }
        }
        return null;
    }
}

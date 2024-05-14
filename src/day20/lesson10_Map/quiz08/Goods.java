package day20.lesson10_Map.quiz08;

public class Goods {
    private String name;
    private int price;
    private String state;

    public Goods(String name, int price, String state) {

        // 판매 상태 유효성 확인
        if (!state.equals("판매중") && !state.equals("판매완료") && !state.equals("예약중")) {
            return;
        }
        this.name = name;
        this.price = price;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getState() {
        return state;
    }

    public void setPrice(int price){
        this.price =price;
    }

    public void setState(String state){
        this.state =state;
    }
    @Override
    public String toString() {
        return "상품명: " + this.name + ", 가격: " + this.price + ", 판매상태: " + this.state;
    }


}

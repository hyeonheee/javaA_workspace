package day12.lesson2_02.quiz03;

public class Product {
    private String name;
    private int price;
    private String expiration;

    public Product(String name, int price, String expiration) {
        this.name = name;
        this.price = price;
        this.expiration = expiration;
    }

    // getter
    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public String getExpiration() {
        return this.expiration;
    }

    // 제품 n개의 가격
    public int calculatePrice(int num) {
        return this.price * num;
    }

    // 판매 가능 여부
    public String availableSale() {
        // "2024-04-04" <= "2025-05-22" : 판매가능
        // "2024-04-04" > "2025-05-22" : 판매불가
        // replace로 - 를 ""로 바꿔서 integer로 바꿔서 풀기

        String[] arr = this.expiration.split("-");
        int year = Integer.parseInt(arr[0]);
        int month = Integer.parseInt(arr[1]);
        int day = Integer.parseInt(arr[2]);

        // 이 조건에서 참이 되면 => 판매 가능
        if (year > 2024) {
            return "판매 가능 상품";
        } else if (year == 2024) {
            if (month > 4) {
                return "판매 가능 상품";
            } else if (month == 4) {
                if (day >= 4) {
                    return "판매 가능 상품";
                }
            }
        }
        // 참이 된 적 없으면 => 판매 불가
        return "판매 불가 상품";
    }



    // 판매 가능 여부2
    public String availableSale2(){
        // "2024-04-04" <= "2025-05-22" : 판매가능
        // "2024-04-04" > "2025-05-22" : 판매불가

        //A.compareTo(B)
        // 유통기한.compareTo(오늘날짜) => 0,1 일때 판매 가능
        //A(기준값)가 크면: 1
        //A(기준값)이 작으면: -1
        //A(기준값)과 같으면: 0
        if(this.expiration.compareTo("2024-04-04") >= 0) {
            return "판매 가능 상품";
        }
        return "판매 불가 상품";
    }
}

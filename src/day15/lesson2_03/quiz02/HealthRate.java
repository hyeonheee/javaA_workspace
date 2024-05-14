package day15.lesson2_03.quiz02;


// 자식 클래스
public class HealthRate extends HealthInfo {

    public HealthRate(String name, int height, int weight) {
        super(name, height, weight);
    }


    // 표준 체준
    private double sw() {
        return (super.getHeight() - 100) * 0.9;
    }

    private double getRatio() {
        return (super.getWeight() - sw()) / sw() * 100; //메소드는 this를 잘 안붙인다.
    }

    private String status(){
        if (getRatio() < 10) {
            return "정상입니다.";
        } else if (getRatio() < 20) { // 10~19
            return "과체중입니다.";
        }
        return "비만입니다.";

    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("=>" + status());
    }

}

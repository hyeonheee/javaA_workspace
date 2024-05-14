package day20.lesson10_Map.quiz07;

public class Person {
    private String name;
    private int birth;

    public void setName(String name) {
        this.name = name;
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public int getBirth() {
        return birth;
    }

    @Override
    public String toString(){
        return "이름: " + this.name + ", 생년월일: " + this.birth;
    }
}

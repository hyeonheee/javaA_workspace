package day15.lesson2_04.ex02;

public class AnimalTest {
    public static void main(String[] args) {
//        Animal animal =new Animal();
//        animal.cry();
//        animal.eat();

        int number = (int) 3.5; // 캐스팅(casting)

        //**up casting: 자식 -> 부모 캐스팅
        //1. 부모 클래스의 메소드들을 사용 가능
        //2. 부모 클래스에 있는 메소드를 오버라이드한 메소드로 호출됨
        //3. 자식 클래스에만 있는 메소드는 사용 불가
        Animal animal = (Animal) new Cat(); // 다형성(업 캐스팅을 해서 Dog가 가지고 있던 lash는 사용 불가)
        animal.eat();
        animal.cry();
        // animal.lash(); 사용 불가




        //**down casting: 부모 -> 자식 캐스팅
        //1. 자식 클래스가 여러개이므로 명확하게 캐스팅 문법을 써야한다.
        //2. instanceof 키워드를 사용해 타입 검사를 해야한다.
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal; // 다운 캐스팅은 꼭 앞에 써줘야 한다.
            dog.cry();
            dog.eat();
            dog.lash();
        } else if (animal instanceof Cat) {
            Cat cat = (Cat) animal; //개로 new로 해서 다운캐스팅을 다른걸로는 불가하다.
            cat.cry();
            cat.eat();
            cat.grooming();
        }

    }
}

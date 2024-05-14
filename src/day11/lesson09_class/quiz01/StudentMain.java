package day11.lesson09_class.quiz01;

public class StudentMain {
    // 나의 의식
    public static void main(String[] args) {

        Student stu1 = new Student();
        stu1.name = "유재석";
        stu1.age = 21;
        stu1.className = "java";
        stu1.phoneNumber = "01023453223";

        System.out.println(stu1.name);
        System.out.println(stu1.age);
        System.out.println(stu1.className);
        System.out.println(stu1.phoneNumber);
        stu1.isAdult();

        System.out.println();


        Student stu2 = new Student();
        stu2.name = "이효리";
        stu2.age = 17;
        stu2.className = "java";
        stu2.phoneNumber = "01096482734";

        System.out.println(stu2.name);
        System.out.println(stu2.age);
        System.out.println(stu2.className);
        System.out.println(stu2.phoneNumber);
        stu2.isAdult();

        System.out.println("\n");

        Student[] students = new Student[2];
        students[0] = stu1;
        students[1] = stu2;

        for (int i = 0; i < students.length; i++) { //0 1
            System.out.println(students[i].name);
            System.out.println(students[i].age);
            System.out.println(students[i].className);
            System.out.println(students[i].phoneNumber);
            students[i].isAdult();
            System.out.println();
        }

    }

}

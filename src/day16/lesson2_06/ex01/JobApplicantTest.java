package day16.lesson2_06.ex01;

public class JobApplicantTest {
    public static void main(String[] args) {

        JobApplicant hh = new JobApplicant();
        System.out.println(hh.introduce());

        Google google = new Google();
        google.recruitJavaDeveloper(hh);

    }
}

package day21.lesson12_Exception;

public class Ex01 {
    public static void main(String[] args) throws Exception {

        // 예외처리(Exception) : 예상치 못한 상황에 대한 처리를 하는 것
        // runtime error에 대한 처리
        // try - catch - finally


        try {
            //1. NPE
//            String str = null;
//            if (str.isEmpty()) {
//                System.out.println("str이 비어있다.");
//            }

            //2. 배열 범위 참조 오류
//            int[] arr = {1, 2, 3};
//            for (int i = 0; i <= arr.length; i++) {
//                System.out.println(arr[i]);
//            }

            //3. 형 변환 오류
            Object x = new Integer(5);
            System.out.println((Integer) x);

        } catch (NullPointerException npe) {
            npe.printStackTrace(); //에러 메세지를 출력해준다.
            System.out.println("NPE 발생");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열 범위 참조 오류");
        } catch (Exception e) {
            System.out.println("모든 예외를 잡아준다.");
        } finally {
            System.out.println("예외가 발생하든 아니든 무조건 불려준다.");
        }

        a();

        System.out.println("main 메소드 끝");

    }

    public static void a() throws Exception {
        b();
    }

    public static void b() throws Exception {
        c();
    }

    public static void c() throws Exception {
        // 예외 발생 시키기
        // 예외 종류 2가지
        // 1) Checked Exception -> Exception
        // 1) =>
        throw new Exception();
        // 2) Unchecked Exception -> runtime Exception
        // 2) => throw new RuntimeException();
        

        // Checked Exception 처리 방법
        // 1) 내가 처리한다.
        // 2) 회피한다.
    }


}

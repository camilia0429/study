package exam01;

public class Ex06 {
    public static void main(String[] args) {
        try {
            int num1 = 10;
            int num2 = 2;
            int result = num1 / num2; // 무슨 예외가 발생할지 모르는 경우
            System.out.println(result);

            String str = null;
            str = str.toUpperCase();// NullPointerException
            System.out.println(str);

        } catch (Exception e) { // Exception e = new NullPointerException...
            String message = e.getMessage();
            System.out.println(message);
        } /*catch (ArithmeticException e) {
            String message = e.getMessage();
            System.out.println(message);
        }*/

    }
}

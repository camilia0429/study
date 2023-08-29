package ex;


public class Ex02 {
    public static void main(String[] args) {
        double height = (double)Math.tan(Math.toRadians(60));
        double towerHeight = height * 20;
        double result = towerHeight + 1.5;
        System.out.println(result);
    }

}

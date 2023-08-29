package exam09;

public class Outer {
    int num1 = 10;
    class Inner {
        void method() {
//            System.out.println(num1);
            System.out.println("인스턴스 내부 클래스");
        }
    }
//    public void outerMethod() {
//        System.out.println("outerMethod()");
//    }
}

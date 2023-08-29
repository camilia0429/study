package exam01;

public class Ex01 {
    public static void main(String[] args) {
        C c = new C(); // C,B,A -> 다형성
        A a = c;
        B b = c;

        A ad = new D();

        if(ad instanceof C) {
            C c1 = (C) ad;
        }
    }
}

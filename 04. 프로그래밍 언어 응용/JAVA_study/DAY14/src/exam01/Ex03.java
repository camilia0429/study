package exam01;

public class Ex03 {
    public static void main(String[] args) {
//        MyLambda my1 = s -> System.out.println(s);
        MyLambda my2 = () -> System.out.println("출력");
//        my1.print("ABC");
        my2.print();
    }
}

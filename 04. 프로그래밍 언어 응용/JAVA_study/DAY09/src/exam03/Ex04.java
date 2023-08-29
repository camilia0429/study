package exam03;

public class Ex04 {
    public static void main(String[] args) {
        Integer num1 = new Integer(10);
        Integer num2 = new Integer(10);


        System.out.println("num1 주소 : "+ System.identityHashCode(num1));
        System.out.println("num2 주소 : "+ System.identityHashCode(num2));

        Integer num3 = new Integer(1000000);
        Integer num4 = new Integer(1000000);


        System.out.println("num1 주소 : "+ System.identityHashCode(num3));
        System.out.println("num2 주소 : "+ System.identityHashCode(num4));
    }//main
}

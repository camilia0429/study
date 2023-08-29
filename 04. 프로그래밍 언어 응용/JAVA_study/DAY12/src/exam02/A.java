package exam02;

public class A {
    public static void main(String[] args) {

        // A자동차 속도 60부터, 한시간마다 10씩증가
        for(int i = 60; i > 0; i+=10) {
            for(int j = 40; j > 0; j+=15) {
                int a = 0;
                int b = 0;
                a += i;
                b += j;
                if(a == b) {
                    System.out.println(a);
                    break;

                }
            }

        }


    }

}

package exam03;

import java.util.Arrays;

public class Ex07 {
    public static void main(String[] args) {
        Transportation taxi = Transportation.valueOf("TAXI");
        System.out.println(taxi);

        Transportation[] trans = Transportation.values();
        System.out.println(Arrays.toString(trans));
    }
}

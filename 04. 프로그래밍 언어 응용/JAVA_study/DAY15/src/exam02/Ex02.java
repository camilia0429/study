package exam02;

import java.util.Arrays;

public class Ex02 {
    public static void main(String[] args) {
        int[] nums = { 1,3,5,7,9,11 };
        boolean result1 = Arrays.stream(nums).allMatch(x -> x % 2 == 1);
        System.out.println("전부 홀수 ? : "+result1);

        boolean result2 = Arrays.stream(nums).anyMatch(x -> x % 2 == 1);
        System.out.println("홀수가 포함 ? : "+result2);

        boolean result3 = Arrays.stream(nums).noneMatch(x -> x % 2 == 1);
        System.out.println("전부? : "+result3);

        int num = Arrays.stream(nums).filter(x -> x % 2 == 1).findFirst().getAsInt();
        System.out.println("첫번째 홀수 ? : "+num);
    }//main
}

package exam01;

import java.util.Arrays;

public class EX01 {
    public static void main(String[] args) {
        int[] nums = {10,20,30,40,50,60};

        System.out.println("length : "+nums.length);
        for(int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        for(int num : nums) {
            System.out.println(num);
        }

        System.out.println(Arrays.toString(nums));

    }//main
}

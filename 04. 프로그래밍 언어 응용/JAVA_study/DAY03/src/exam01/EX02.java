package exam01;

import java.util.Arrays;

public class EX02 {
    public static void main(String[] args) {
        /*
        int[][] nums = new int[2][3];
        nums[0][0] = 10;
        nums[0][1] = 20;
        nums[0][2] = 30;
        nums[1][0] = 40;
        nums[1][1] = 50;
        nums[1][2] = 60;


         */
        int[][] nums = {{10,20,30},{40,50,60}};

        /*
        System.out.println("행의 갯수 : "+nums.length);
        System.out.println("0행의 열의 갯수 : "+nums[0].length);
        System.out.println("1행의 열의 갯수 : "+nums[1].length);

        for(int i = 0; i < nums.length; i++){
            System.out.println(i + "행 ---------");
            for(int j = 0; j < nums[i].length; j++){
                System.out.println(nums[i][j]);
            }
        }
        */
        System.out.println(Arrays.deepToString(nums));
    }//main
}

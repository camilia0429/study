package ex;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ex00 {
    public static void main(String[] args) {
        int[] winNums = getWinNums();
        int[] lotto1 = {44,1,0,0,31,25};
        int[] result1 = getLottoRanks(lotto1,winNums);
        System.out.println(Arrays.toString(winNums));
        System.out.println(Arrays.toString(lotto1));
        System.out.println(Arrays.toString(result1));

        int[] result2 = getLottoRanks(winNums, winNums);
        System.out.println(Arrays.toString(result2));
    }
    public static int[] getLottoRanks(int[] lottos, int[] winNums){
        int hidden = 0;
        int match = 0;

        for(int lotto:lottos) {
            if(lotto == 0) {
                hidden++;
            } else {
                boolean result = Arrays.stream(winNums).anyMatch(x->x == lotto);
                if(result) match++;
            }
        }
        int maxRank = 7-(match-hidden);
        int minRank = 7-match;

        return new int[] {maxRank, Math.min(minRank,6)};
    }
    public static int[] getWinNums() {
        Set<Integer> winNums = new HashSet<>();

        while(winNums.size() < 6) {
            int num = (int)(Math.random()*45)+1;
            winNums.add(num);
        }
        return winNums.stream().mapToInt(x->x).toArray();
    }
}


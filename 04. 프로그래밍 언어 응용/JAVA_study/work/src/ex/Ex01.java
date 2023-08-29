package ex;

public class Ex01 {
//    문항1 - 1000 이하의 소수를 나열하는 프로그램을 작성하시오
    static boolean[] PrimeNum = new boolean[1001];
    public static void  main(String[] args) {
        Prime(1000);

        for (int i = 2; i < PrimeNum.length; i++) {
            if (!PrimeNum[i]) {
                System.out.println(i);
            }
        }
    }
    public static void Prime(int n) {
        for(int i = 2; i < Math.sqrt(n); i++){
            if(PrimeNum[i]) continue;
            for(int j=i*i; j<=n; j+=i) {
                PrimeNum[j] = true;
            }
        }
    }
}

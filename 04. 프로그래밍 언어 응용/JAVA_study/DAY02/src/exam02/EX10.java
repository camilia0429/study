package exam02;

public class EX10 {
    public static void main(String[] args){
        int total=0;
        for (int i = 1; i<=100; i++){
            if(i % 2 == 1) {
                total+=i;
            }
        }
        System.out.println(total);

        int total1 = 0;

        for(int i = 1; i <= 100; i++){
            if(i % 2 == 0) {
                continue;
            }
            total1 += i;
        }
        System.out.println(total);
    } //main
}

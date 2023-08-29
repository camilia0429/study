package Ex5_continue;

public class Ex2_continue {
	public static void main(String[] args) {
		int n = 0;
		
		while(n < 10) {
			n++;
			System.out.println(n);
			
			if(n % 2 != 0) {
				continue;
			}
		}
		
//		while문에는 증감식이 없기 떄문에 continue는 조건식으로 간다.
		
		
		
		
	}//main

}

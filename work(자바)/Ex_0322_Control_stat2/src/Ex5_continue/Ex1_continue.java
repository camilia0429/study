package Ex5_continue;

public class Ex1_continue {
	public static void main(String[] args) {
//		반복문 내에서 continue를 만나게 되면 가장 가까이 있는 반복문의 증감식으로 돌아간다
//		continue문 : 반복문 내에서 특정 문장을 건너뛰고자 할 때 사용
		
		for(int i = 1; i <= 2; i++) {
			for(int j=1; j <= 5; j++) {
				if( j %2 == 0) {
					continue;
				}
				System.out.print(j+"");
			}
			System.out.println();
		}
		
//		기타제어문의 특징
//		반복문 안에서 사용된다.
//		*같은 코드블럭 내에* break, continue문 밑에는 어떠한 코드도 올 수 없다.
		
		
		
	}//main

}

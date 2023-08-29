package Ex3_while;

public class Ex1_while {
	public static void main(String[] args) {
//		for문보다는 간편한 구성을 가진 반복문(선비교 후처리)
//		기본형
//		while(조건식) {
//			조건식이 참일 동안 반복할 명령	
//		}
		
		int num = 1; // 초기식
		
		while(num <= 10) {
			System.out.print(num);
			num++; //while문은 초기식의 값을 변경해줄 수 있는 연산이 필요.
		}
		
		System.out.println();
		System.out.println();
		
		
//		1~10까지의 총합을 구하여 출력하기
		
		int total = 0;
		int i = 1;
		
		while(i <= 10) {
			total += 1;
			i++;
		}
		System.out.println(total);
		
//		do - while
//		while문은 선비교 후처리를 하지만
//		do - while문은 선처리 후비교를 하기 때문에 조건에 맞지 않아도 무조건 한번은 실행을 하게 된다.
//		제어문 중 유일하게 뒤에 세미클론(;)을 붙여야 한다.
		
//		do {
//			조건식이 참일동안 실행할 명령
//		}while(조건식);
		
		
		int a = 11;
		do {
			System.out.println(a);
		}while(a<=10);
		
		
		
	}//main

}

package Ex1_if;

public class Ex3_if_elseif_else {
	public static void main(String[] args) {
//		if - elseif - else 문
//		- 비교해야할 조건이 여러개 있는 경우 (elseif는 여러개 나올 수 있다)
		
//		기본형
//		if(조건식1) {
//			조건식1이 참일 때 실행할 명령
//		} elseif(조건식2) {
//			조건식1이 거짓이고 2가 참일때 실행할 명령
//		} elseif(조건식3) {
//			조건식1,2가 거짓이고 3이 참일때 실행할 명령
//		} elseif(조건식4) {
//			조건식1,2,3이 거짓이고 4가 참일때 실행할 명령
//		} else {
//			위 조건식이 모두 거짓일때 실행할 명령
//		}
		
//		else는 생략 가능
		
		int score = 75;
		
		if(score <=100 && score >= 90) {
			System.out.println("성적은 A입니다.");
		} else if(score >= 80) {
			System.out.println("성적은 B입니다.");
		} else if(score >= 70) {
			System.out.println("성적은 C입니다.");
		} else if(score >=60) {
			System.out.println("성적은 D입니다.");
		} else {
			System.out.println("성적은 F입니다.");
		}
		
		
//		if문의 중첩
//		if문안에 if문이 있는 경우
//		if(조건식1) {
//			if(조건식2) {
//		
//			}
//		}
		
//		정수형 변수 num에 임의의 값을 초기화 하고
//		num이 5의 배수이면서 짝수라면 "X는 짝수입니다."라고 출력하기
		
		int num = 7;
		
		if (num%5 == 0) {
			if (num%2 == 0) {
				System.out.println(num+"는 짝수입니다");
			} else {
				System.out.println(num+"는 홀수입니다");
			}
		} else {
			System.out.println(num+"는 5의 배수가 아닙니다");
		}
				
		
		
		

	}
}
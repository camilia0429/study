package Ex1_single_for;

public class Ex1_single_for {
	public static void main(String[] args) {
//		반복문
//		특정 명령을 원하는 만큼 반복 실행하는 제어문
//		for,while
		
//		기본형
//		for(초기식; 조건식; 증감식){
//			조건식이 참일 때 반복할 명령
//		}
		
//		초기식 : 반복을 하기 위한 시작값. 변수를 하나 초기화 한다.
//		조건식 : 반복을 하기 위한 종료값. 비교연산자를 많이 사용한다.
//		증감식 : 변수의 값을 증감시켜주는 역할을 한다. 증감연사자를 많이 사용한다.
		
		
		
		
		for(int i = 0; i < 3; i++) {
			System.out.println(i);
		}
		
//		1~10까지 콘솔에 출력하는 코드 작성하기
		
		for(int r = 1; r < 11; ++r) {
			System.out.println(r);
		}
		
		
		
		int num = 1;
		for(int i = 0; i < 10; i++) {
			System.out.println(num+" ");
			num++;
		}
		
//		10~1까지 출력하는 코드 작성하기
		
		for(int i = 10; i > 0; i--) {
			System.out.println(i);
		}
		
		System.out.println("");
		
//		1~10까지 3의 배수만 출력하기
		
		for(int i = 1; i < 10; i++) {
			if(i%3 == 0) {
			System.out.println(i);
			}
		}
		
		System.out.println(" ");
		
//		1~20까지 홀수만 출력
		for(int i = 1; i < 21; i++) {
			if(i%2 != 0) {
				System.out.println(i);
			}
		}
		
		
		System.out.println("");
		System.out.println("");
		
//		1~10까지 총합 구하기
		int l = 0;
		for(int i = 1; i < 11; i++) {
			l += i; // l = l+i 누적합을 구할 때
			System.out.println(l);
//		제어문 안에서 출력시 계산되는 모든 값이 보이고
		}
		
		System.out.println("");
		System.out.println(l);
//		제어문 밖에서 출력시 결과값만 보인다.
		
//		정수형 변수 dan을 2~9사이의 숫자로 초기화 하고
//		해당 구구단을 출력하시오
//		결과형태 : 2X1=2
		
		int dan = 3;
		for(int i = 1; i < 10; i++) {
			System.out.println(dan+"X"+i+"="+dan*i);
		}
		
		
		
		
	}//main

}

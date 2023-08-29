package Ex5_Work;

import java.util.Scanner;

public class CalMain {
	public static void main(String[] args) {
//		클래스로 계산기 만들어보기
		/*
		 * 첫번째 숫자입력 : 5
		 * 두번째 숫자입력 : 10
		 * 연산기호 입력 : +
		 * 결과 : 15
		 * 
		 * Scanner를 사용해 숫자 두개와 연산기호를 받은 뒤 계산해주는 CalTest 클래스를 만들고 실행하기
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력해 주세요 : ");
		int n1 = scan.nextInt();
		System.out.print("숫자를 입력해 주세요 : ");
		int n2 = scan.nextInt();
		System.out.print("연산자를 입력해 주세요 : ");
		String s1 = scan.next();
		
		CalTest ct = new CalTest();
		int rusult = ct.getResult(n1, n2, s1);
		System.out.println("계산결과 : "+result);
		
//		if(s1 == "+") {
//			n1+n2;
//		} else (s1 == "*") {
//			n1*n2;
//		} else (s1 == "/") {
//			n1/n2;
//		} else (s1 == "-") {
//			n1-n2;
//		} else (s1 == "+") {
		
//		

		
		
		
		
	}


}

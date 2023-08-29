package Ex7_Scanner;

import java.util.Scanner;

public class Ex1_scanner {
	public static void main(String[] args) {
//		Scanner : 키보드에서 값을 직접 입력받아 변수의 저장할 수 있도록 해주는 클래스
		String str = "홍길동";
		
		Scanner scan = new Scanner(System.in);
		
		
//		키보드에서 int 타입의 값을 입력받고 엔터를 치는 순간
//		num변수에 사용자가 입력받은 값을 대입해준다.
		
		System.out.print("정수를 입력해 주세요 : ");
		int num = scan.nextInt();
		
		System.out.printf("입력하신 정수는 %d입니다\n", num);
		
		System.out.print("이름을 입력해 주세요 : ");
		String name = scan.next();
		
		System.out.printf("입력하신 이름은 %s입니다",name);
	
		
		
		
	}//main

}

package Ex7_Scanner;

import java.util.Scanner;

public class Ex2_Scanner {
	public static void main(String[] args) {
//		키보드에서 값을 입력받고 해당 값에 해당하는 구구단을 출력하세요
//		2~9 이외의 숫자를 입력하면, "2~9사이의 숫자만 입력하세요"라는 메세지 출력하기
//		2 X 1 = 2
		
//		Scanner scan = new Scanner(System.in);
//				
//		System.out.println("숫자를 입력해주세요 : ");
//		int dan = scan.nextInt();		
//		
//		if(dan <2 || dan > 9) {
//			System.out.println("2~9사이의 값을 입력하세요");
//		} else {
//			for(int i = 1; i < 10; i++) {
//				System.out.printf("%d X %d = %d\n",dan,i,dan*i);
//			}
//		}
//		
//		
////		for VS while
////		for : 내가 정확히 몇번을 반복해야 하는지 아는 경우에만 사용 (대개)
////		for문으로도 무한루프문 가능.
////		for(;;) {
////			
////		}
////		while : 내가 정확히 몇번을 반복해야 하는지 모르는 경우에도 사용할 수 있다
//		System.out.println("정수를 입력해주세요 : ");
//		int num = scan.nextInt();
//		
//		while(num != -1) {
//			System.out.printf("입력한 정수 : %d\n", num);
//			System.out.println("정수를 입력해 주세요 : ");
//			num = scan.nextInt();
//			if(num == -1) {
//				System.out.println("-1이 입력되어 종료합니다.");
//				break;
//			}
//		}
		
//		키보드에서 숫자를 입력받아 변수 n에 저장한다.
//		1~n까지의 합을 계산하여 결과 출력하기
//		예를들어 5를 입력받으면 1+2+3+4+5의 연산결과인 15 출력.
		
//		System.out.print("숫자를 입력해주세요 : ");
//		int total = 0;
//		int n = scan.nextInt();
//		for(int i = 1; i <= n; i++) {
//			total += i;
//		}
//		System.out.printf("1~%d까지의 총 합 : %d",n,total);
		
		
//		키보드에서 변수 n1, n2에 값을 입력받는다.
//		n1~n2까지의 합을 계산하여 그 결과를 출력하는 프로그램 작성
//		예를 들어 2,5를 입력받으면 2+3+4+5의 연산 결과인 14출력
//		n1보다 n2의 값이 작을 경우도 작성
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력해 주세요 : ");
		int n1 = scan.nextInt();
		System.out.print("숫자를 입력해 주세요 : ");
		int n2 = scan.nextInt();
				
		int total = 0;
		
//		if(n1<n2) {
//			for(int i = n1; i<= n2; i++) {
//				total += i;
//				}
//			System.out.printf("%d~%d까지의 총합 : %d",n1,n2,total);
//		} else {
//			for(int i =n1; i>=n2; i--) {
//				total +=i;
//			}
//			System.out.printf("%d~%d까지의 총합 : %d",n1,n2,total);
//			
//		}
		

		
//		for(int i = n1; i<= n2; i++) {
//			total += i;
//			}
//		if(n1>n2) {
//			for(int i=n1; i <= n2; i++) {
//				total += i;
//			}
//			
//		}
//		
//		System.out.printf("%d~%d까지의 총 합 : %d", n1,n2,total);
	
		
//		방법2
		
		if(n1>n2) { // n의 값을 교차
			int n3 = 0;
			n3 = n1;
			n1 = n2;
			n2 = n3;
		}
		for(int i = n1; i<= n2; i++) {
		total += i;
		}
		System.out.printf("%d~%d까지의 총 합 : %d", n1,n2,total);
		
		
		
		
	}//main

}

package Ex7_Scanner;

import java.util.Scanner;

public class Ex2_Scanner {
	public static void main(String[] args) {
//		Ű���忡�� ���� �Է¹ް� �ش� ���� �ش��ϴ� �������� ����ϼ���
//		2~9 �̿��� ���ڸ� �Է��ϸ�, "2~9������ ���ڸ� �Է��ϼ���"��� �޼��� ����ϱ�
//		2 X 1 = 2
		
//		Scanner scan = new Scanner(System.in);
//				
//		System.out.println("���ڸ� �Է����ּ��� : ");
//		int dan = scan.nextInt();		
//		
//		if(dan <2 || dan > 9) {
//			System.out.println("2~9������ ���� �Է��ϼ���");
//		} else {
//			for(int i = 1; i < 10; i++) {
//				System.out.printf("%d X %d = %d\n",dan,i,dan*i);
//			}
//		}
//		
//		
////		for VS while
////		for : ���� ��Ȯ�� ����� �ݺ��ؾ� �ϴ��� �ƴ� ��쿡�� ��� (�밳)
////		for�����ε� ���ѷ����� ����.
////		for(;;) {
////			
////		}
////		while : ���� ��Ȯ�� ����� �ݺ��ؾ� �ϴ��� �𸣴� ��쿡�� ����� �� �ִ�
//		System.out.println("������ �Է����ּ��� : ");
//		int num = scan.nextInt();
//		
//		while(num != -1) {
//			System.out.printf("�Է��� ���� : %d\n", num);
//			System.out.println("������ �Է��� �ּ��� : ");
//			num = scan.nextInt();
//			if(num == -1) {
//				System.out.println("-1�� �ԷµǾ� �����մϴ�.");
//				break;
//			}
//		}
		
//		Ű���忡�� ���ڸ� �Է¹޾� ���� n�� �����Ѵ�.
//		1~n������ ���� ����Ͽ� ��� ����ϱ�
//		������� 5�� �Է¹����� 1+2+3+4+5�� �������� 15 ���.
		
//		System.out.print("���ڸ� �Է����ּ��� : ");
//		int total = 0;
//		int n = scan.nextInt();
//		for(int i = 1; i <= n; i++) {
//			total += i;
//		}
//		System.out.printf("1~%d������ �� �� : %d",n,total);
		
		
//		Ű���忡�� ���� n1, n2�� ���� �Է¹޴´�.
//		n1~n2������ ���� ����Ͽ� �� ����� ����ϴ� ���α׷� �ۼ�
//		���� ��� 2,5�� �Է¹����� 2+3+4+5�� ���� ����� 14���
//		n1���� n2�� ���� ���� ��쵵 �ۼ�
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��� �ּ��� : ");
		int n1 = scan.nextInt();
		System.out.print("���ڸ� �Է��� �ּ��� : ");
		int n2 = scan.nextInt();
				
		int total = 0;
		
//		if(n1<n2) {
//			for(int i = n1; i<= n2; i++) {
//				total += i;
//				}
//			System.out.printf("%d~%d������ ���� : %d",n1,n2,total);
//		} else {
//			for(int i =n1; i>=n2; i--) {
//				total +=i;
//			}
//			System.out.printf("%d~%d������ ���� : %d",n1,n2,total);
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
//		System.out.printf("%d~%d������ �� �� : %d", n1,n2,total);
	
		
//		���2
		
		if(n1>n2) { // n�� ���� ����
			int n3 = 0;
			n3 = n1;
			n1 = n2;
			n2 = n3;
		}
		for(int i = n1; i<= n2; i++) {
		total += i;
		}
		System.out.printf("%d~%d������ �� �� : %d", n1,n2,total);
		
		
		
		
	}//main

}

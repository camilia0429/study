package Ex5_Work;

import java.util.Scanner;

public class CalMain {
	public static void main(String[] args) {
//		Ŭ������ ���� ������
		/*
		 * ù��° �����Է� : 5
		 * �ι�° �����Է� : 10
		 * �����ȣ �Է� : +
		 * ��� : 15
		 * 
		 * Scanner�� ����� ���� �ΰ��� �����ȣ�� ���� �� ������ִ� CalTest Ŭ������ ����� �����ϱ�
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��� �ּ��� : ");
		int n1 = scan.nextInt();
		System.out.print("���ڸ� �Է��� �ּ��� : ");
		int n2 = scan.nextInt();
		System.out.print("�����ڸ� �Է��� �ּ��� : ");
		String s1 = scan.next();
		
		CalTest ct = new CalTest();
		int rusult = ct.getResult(n1, n2, s1);
		System.out.println("����� : "+result);
		
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

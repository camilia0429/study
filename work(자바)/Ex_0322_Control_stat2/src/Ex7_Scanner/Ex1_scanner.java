package Ex7_Scanner;

import java.util.Scanner;

public class Ex1_scanner {
	public static void main(String[] args) {
//		Scanner : Ű���忡�� ���� ���� �Է¹޾� ������ ������ �� �ֵ��� ���ִ� Ŭ����
		String str = "ȫ�浿";
		
		Scanner scan = new Scanner(System.in);
		
		
//		Ű���忡�� int Ÿ���� ���� �Է¹ް� ���͸� ġ�� ����
//		num������ ����ڰ� �Է¹��� ���� �������ش�.
		
		System.out.print("������ �Է��� �ּ��� : ");
		int num = scan.nextInt();
		
		System.out.printf("�Է��Ͻ� ������ %d�Դϴ�\n", num);
		
		System.out.print("�̸��� �Է��� �ּ��� : ");
		String name = scan.next();
		
		System.out.printf("�Է��Ͻ� �̸��� %s�Դϴ�",name);
	
		
		
		
	}//main

}

package Ex1_String;

import java.util.Scanner;

public class Ex1_String {
	public static void main(String[] args) {
//		String Ŭ������ �ΰ��� Ư¡�� ������ �ִ�
//		1) ��ü �������� �ΰ���(�����, �Ͻ���)
//		2) �� �� ������ ���ڿ��� ������ ������ �ʴ´�(�Һ��� Ư¡)
//		*�Ͻ��� ��ü������ StringŬ���������� ���*
		
		String s1 = "abc"; // �Ͻ��� ��ü ����
		String s2 = "abc";
		
//		�̹� �տ� ���� ���ڿ��� ������ �Ͻ��� ��ü�� �ִٸ�
//		�ռ� ������ ��ü�� �ּҸ� �����Ѵ�.
		
//		new�� ���� ��������� ��ü�� ������� ��� ������ ������ �� ��ü�� �ٸ� ��ü�̴�.
		String s3 = new String("abc");
		String s4 = new String("abc");
		
		
		
//		'==' �����ڴ� �⺻ �ڷ����� ���� ���� ���� �������� ��ü�� ���� ���� �ּҸ� ���ϴ� �����ڷ� ����� �ٲ��.		
		if(s1 == s2) {
			System.out.println("s1�� s2�� �����ϴ�");
		} else {
			System.out.println("s1�� s2�� �ٸ��ϴ�");
		}
		
		if(s1 == s3) {
			System.out.println("s1�� s3�� �����ϴ�");
		} else {
			System.out.println("s1�� s3�� �ٸ��ϴ�");
		}
		
		if(s3 == s4) {
			System.out.println("s3�� s4�� �����ϴ�");
		} else {
			System.out.println("s3�� s4�� �ٸ��ϴ�");
		}
		
		
//		���ڿ� ��ü�� ����ִ� ���� ���ϱ� ���ؼ��� equals()�� ����ؾ� �Ѵ�
		if(s3.contentEquals(s4)) {
			System.out.println("s3�� s4�� ������ �����ϴ�");
		} else {
			System.out.println("s3�� s4�� ������ �ٸ��ϴ�");
		}
		
		
		
//		============================
		
		System.out.println("=========================================");
		
		
//		�Һ��� ��Ģ
		String greet = "�ȳ�";
		greet +="�ϼ���";
		System.out.println(greet);
		
//		���� "�ȳ�"�� ������ �ʰ� "�ȳ��ϼ���"��� ��ü�� ���� �����Ǹ� ���� ��ü�� ���� �ʴ� �����Ⱑ �Ǿ� ������.
		
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
		
		
		
		
	}//main

}

package Ex3_Work;

import java.util.Scanner;

public class Ex1_Work {
	public static void main(String[] args) {
//		Ű���忡�� ���ڿ� Ư�����ڸ� ������ ���ĺ��� �������� �Է¹޴´�.
//		�Է¹��� ���ڿ��� �ҹ��� a�� � ����ִ��� �ݺ��ϴ� �ڵ带 �ۼ��غ���.
		
//		�Է� : asdfasdff
//		��� : 2
		
		Scanner scan = new Scanner(System.in);
//		System.out.print("���ڿ� : ");
//		String ch = scan.nextLine();
//		System.out.println("�Է��� ���ڿ� : "+ch);
//		
//		int count = 0; 
//		for(int i=0; i < ch.length(); i++) {
//			if(ch.charAt(i) == 'a') {
//				count++;
//			}
//			}
//		System.out.println(count);
		
		
//		ȸ�����ϱ�
//		ȸ���̶� ������ �о �Ųٷ� �о �Ȱ��� ������ ������ �ǹ�
//		�丶��, �ⷯ��, ���˺�...
//		Ű���忡�� ���ڿ��� �Է¹޾� ȸ������ �ƴ����� �Ǻ��ϴ� �ڵ� �ۼ��ϱ�
		
		System.out.print("���ڿ� : ");
		String rw = scan.nextLine();
		String rw2 = "";
		System.out.println("�Է��� ���ڿ� : "+rw);
						
				
		for(int i = rw.length()-1; i>=0; i--) {
			rw2+=rw.charAt(i);
		}
		
		if(rw.equals(rw2)) {
			System.out.println(rw+"�� ȸ���Դϴ�");
		} else {
			System.out.println(rw+"�� ȸ���� �ƴմϴ�");
		}
		
		
		
		
 
		
		
		
		
		
		
	}//main

}

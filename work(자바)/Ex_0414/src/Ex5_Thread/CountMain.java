package Ex5_Thread;

import java.util.Scanner;

public class CountMain {
	public static void main(String[] args) {
		
//		��ĳ�ʸ� �̿��Ͽ� Ű���忡�� ���ڸ� �Է� �ް�
//		�����忡�� �Է¹��� ���ڰ� 1�� �����ϴٰ� 0�� �Ǿ��� ��
//		"����"��� �޼����� �Բ� �����带 ������������  ������
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("���� : ");
		int n = sc.nextInt();
		
		
		ThreadCount tc = new ThreadCount();
		tc.getN(n);
		tc.start();
		
		
	}//main

}

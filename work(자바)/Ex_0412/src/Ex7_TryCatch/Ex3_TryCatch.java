package Ex7_TryCatch;
import java.util.Scanner;
public class Ex3_TryCatch {
	public static void main(String[] args) {
//		���� :
//		Ű���忡�� ������ �Է¹޵��� �ϰ�, ���� �̿��� ���� �Է� �Ǿ��ٸ�
//		"������ �Է� ����" �̶�� �޼����� ���
		
//		��� :
//		������ �Է¹��� ���
//		���� : 100
//		�Է¹��� �� : 100
		
//		������ �Է¹��� ���� ���
//		���� : aaa
//		������ �Է� ����
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("������ �Է��� �ּ��� : ");
			int n1 = sc.nextInt();
			System.out.println("�Է� ���� ���� : "+n1);
		} catch (Exception e) {
			System.out.println("������ �Է��� �ּ���");
		}


		
		
		
		
		
	}//main

}

package Ex5_Work;

import java.util.Scanner;

public class TimesTableMain {
//	TimesTable Ŭ������ ����� showTable()�޼��带 �����Ѵ�.
//	showTable()�޼��忡�� �������� ����ϴ� �ڵ带 �ۼ�
	
//	TimesTableMain������ Scanner�� ���� ���� �Է¹ް� TimesTable��ü�� �����Ͽ� �ش� �������� ����ϱ�
	
//	����
//	����� �� �Է� : 5
//	5��
//	5 X 1 = 5
//	5 X 2 = 10
//	5 X 3 = 15
//	5 X 4 = 20
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("����� �� : ");
		int dan = scan.nextInt();
		
		TimesTable tt = new TimesTable();
		tt.showTable(dan);
			
	}
}

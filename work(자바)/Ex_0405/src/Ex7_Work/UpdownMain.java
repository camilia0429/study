package Ex7_Work;

import java.util.Scanner;

public class UpdownMain {
	public static void main(String[] args) {
//		Updown Ŭ������ �����Ͽ� 1~50������ ������ �߻� ��Ų��
//		���� Ŭ�������� ����ڰ� Ű���忡�� ������ �Է� �޴´�
//		�Է¹��� ������ Updown Ŭ�������� ���ڸ� �Ǵ��Ͽ�
//		�߻��� �������� ũ�ٸ� Down, �۴ٸ� Up�� ���
//		����ڰ� �Է��� ���ڿ� �߻��� ������ ���� ��쿡 ���α׷� ����
//		������ ���� ��� ���α׷��� ����� ���� Ŭ�������� �̷�������� �Ѵ�.
		
		
		Scanner scan = new Scanner(System.in);
		Updown ud = new Updown();

		while (true) {
			System.out.print("���ڸ� �Է��� �ּ��� : ");
			int num = scan.nextInt();
			if(ud.check(num).Equals("����")) {
				System.out.println("�����Դϴ�");
				break;
			} else {
				System.out.println(ud.check(num));
			}
		}
		
		

		
		
		
		
	}

}

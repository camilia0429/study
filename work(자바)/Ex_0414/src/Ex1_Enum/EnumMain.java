package Ex1_Enum;
import java.util.Scanner;

public class EnumMain {
//	ENUM : ������
//	������� ����
	public enum Item {
//		����ڰ� ������ �̸��� ���������� INDEX�� �ο��ȴ�
		START,PAUSE,EXIT
	}
	
	public static void main(String[] args) {
		while(true) {
			System.out.println("0 : ���ӽ���");
			System.out.println("1 : �Ͻ�����");
			System.out.println("2 : ��������");
			
			Scanner sc = new Scanner(System.in);
			System.out.print("��ȣ�� �Է��� �ּ��� : ");
			int n = sc.nextInt();
			
			Item start = Item.START;
			Item pause = Item.PAUSE;
			Item exit = Item.EXIT;
			
			if(n == start.ordinal()) {
				System.out.println("������ ���۵�");
			} else if(n == pause.ordinal()) {
				System.out.println("������ �Ͻ�������");
				break;
			} 		

			
		}//while
	}

}

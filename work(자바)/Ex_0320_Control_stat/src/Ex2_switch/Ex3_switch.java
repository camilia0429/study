package Ex2_switch;

public class Ex3_switch {
	public static void main(String[] args) {
//		������ ������ ���� months�� �ʱ�ȭ �ϰ� 1~12������ ������ ������ �ʱ�ȭ ��Ų��.
//		�ش� ���� ���ϱ��� �ִ��� switch���� �̿��Ͽ� �ۼ��ϱ�
		
		int months = 7;
		
		switch (months) {
		case 1 :case 3 :case 5 :
		case 7 :case 8 :case 10 :
		case 12 :
			System.out.println("31�ϱ��� �ֽ��ϴ�");
			break;
		case 4 :case 6 :
		case 9 :case 11 :
			System.out.println("30�ϱ��� �ֽ��ϴ�.");
			break;
		default :
			System.out.println("28�ϱ��� �ֽ��ϴ�.");
			break;
		}
		
		
		
		
		
	}

}

package Ex2_Operator;

public class Ex3_Operator {
	public static void main(String[] args) {
//		���׿�����
//		������ �ϳ� ����Ͽ� ������ ���� �� ��ȯ�� ��, ������ �� ��ȯ�� ���� ���� ���� ������
		
		int a = 10;
		int b = 15;
		
		boolean result = ++a >= b ? true : false;
//		������ True�� ��� �ݷ��� ���� ���� ��ȯ, False�� ��� ������ ���� ��ȯ�Ѵ�.
		System.out.println("result : "+result);
		
		int n1 = 10;
		int n2 = 20;
		
		char result2 = n1 != n2 ? 'O' : 'X';
		System.out.println("result2 : "+result2);
		
		
//		�������� ��, ���, �������� �Ϸ翡 �� 5,7,5�� �����ϰ� �ִ�.
//		�Ϸ翡 ����Ǵ� �� ������ ����ϰ� �ð��� ��ü ������ ��� ���� ������ ���
//		��հ��� ��� ������ float�� �� ��
		
		int A = 5;
		int B = 7;
		int C = 5;
		
//		������ ����� ���� ���		
		int resultA = A + B + C;
		System.out.println("�Ϸ翡 ����Ǵ� �� ���� : "+resultA);
		
//		����� ����� ���� ���
		float resultB = resultA/24f;
//		float resultB = (float)resultA/24;
		System.out.println("�ð��� ����Ǵ� ���� : "+resultB);
		
		
	}

}

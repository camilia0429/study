package Ex1_Casting;

public class Ex2_Demotion {
	public static void main(String[] args) {
//		��������ȯ : ū �ڷ������� ���� �ڷ����� ����
		
		char c = 'B'; // 2byte
		int n = c+1; //�ڵ�����ȯ
		
		c=(char)n;
//		���� ����ȯ�� �ϴ� ��� �� ��ȣ�� ǥ���Լ��� ����
		
		System.out.println("c�� �� : "+c);
		
		float f = 5.5f;
		int n1 = 0;
		
		n1 = (int)f; //���� 4byte���� �ڷ����� ��ġ���� ������ ������ ���� �ʴ´�.
		System.out.println("n1�� �� : "+n1);
		//float���� int�� ĳ���� �Ǹ鼭 �Ҽ��� ���� �ڸ����� ���ǵȴ�(����)
		
		byte b1 = 100;
		byte b2 = 20;
//		byte b3 = b1 + b2; //�����߻�
//		����Ʈ������ ������ int�� ����, int=4byte, byte=1byte
		int b3 = b1+b2;
		
		
		
	}

}

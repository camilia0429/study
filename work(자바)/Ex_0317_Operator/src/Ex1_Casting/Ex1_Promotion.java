package Ex1_Casting;

public class Ex1_Promotion {
	public static void main(String[] args) {
//		�� ��ȯ : �� �ڷ������� �ٸ� �ڷ������� �ٲٴ� ��
//		- �ڵ�����ȯ(����������ȯ) : ���� �ڷ������� ū �ڷ����� ����, �ڵ����� �Ͼ
//		- ��������ȯ(���������ȯ) : ū �ڷ������� ���� �ڷ����� ����
		
		double d = 100.5; // 8byte
		int n = 200; // 4byte
		
		d = n;
		System.out.println("d�� �� : "+d);
		
		char c = 'A'; // 2byte
		long l = 100; //8byte
		
		l = c;
		System.out.println("l�� �� : "+l);	
		
	}

}

package Ex7_TryCatch;

public class Ex2_TryCatch {
	public static void main(String[] args) {
		int res = 0;
		int[] arr = new int[2];
		
		try {
			res = 10/1;
			arr[0] = 10;
			
		} catch (ArithmeticException e) {
			System.out.println("������ 0���� ���� �� �����ϴ�");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�������� �ʴ� index���� �����Դϴ�");
		} finally {
//			try ���������� ���� �߻� ���ο� ���� ����
//			�������� �ݵ�� ȣ��Ǵ� ����
//			������ ���� ��쿡�� ȣ�� ��
			System.out.println("finally");
		}
//		elseifó�� ��� ����
		
		
		
		
		
	}//main

}

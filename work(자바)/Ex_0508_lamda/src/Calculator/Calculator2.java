package Calculator;

public class Calculator2 {
	public static void main(String[] args) {
//		���� ���� �͸� Ŭ����
//		�͸� Ŭ������ ���� Ŭ����(inner class)�� �������� �̸��� ���� Ŭ������ ���Ѵ�
//		���߿� �ٽ� �ҷ��� ������ ���ٴ� ���� �����ϰ� �ִ�
//		�� ���α׷����� �Ͻ������� �ѹ��� ���ǰ� �������� ��ü��� ���� �ȴ�
		MyCalculator cal = new MyCalculator() {
			
			@Override
			public int plus(int num1, int num2) {
				// TODO Auto-generated method stub
				return 0;
			}
			
		};
		
		
		
		
		
	}//main

}

package Ex3_Calculator;

public class CalMain {
	public static void main(String[] args) {
//		CalculatorŬ������ �����
//		getResult()�Լ��� �����ϼ���
//		��ȯ���� ����, ���ڴ� �ΰ�(n1,n2)�� �ް� ���ϰ��� -1
		
//		CalplusŬ������ ����� CalculatorŬ������ ��ӹ޴´�
//		�������̵��� �̿��Ͽ� getResult()�Լ��� ������ �Ͽ�
//		���ڷ� ���� n1+n2�� �ϴ� �Լ��� �����
//		�� �� ���ϰ��� -1�̸� �ȵ�
		
//		CalMinusŬ������ ����� CalculatorŬ������ ��ӹ޴´�.
//		�������̵��� �̿��Ͽ� getResult()�Լ��� ������ �Ͽ�
//		���ڷ� ���� n1-n2�� �ϴ� �Լ��� �����
		
//		Main���� �����Ͽ� �Ʒ��� ���� ����� ������ ����
//		CalPlus : 30
//		CalMinus : 15
		
		CalPlus cp = new CalPlus();
		System.out.println("CalPlus : "+cp.getResult(10,20));
		
		CalMinus cm = new CalMinus();
		System.out.println("CalMinus : "+cm.getResult(20, 10));
		
	}

}

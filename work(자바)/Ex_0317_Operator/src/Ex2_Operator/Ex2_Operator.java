package Ex2_Operator;

public class Ex2_Operator {
	public static void main(String[] args) {
//		�񱳿�����
//		������ ����� ���� ���Ͽ� ���� ������ �Ǵ��ϴ� ������
//		������ ����� �׻� ���� ��(true)�� ����(false)���� ��ȯ�ȴ�.
//		<(�̸�), >(�ʰ�), <=(����), >=(�̻�), ==(����), !=(�����ʴ�)
		
		int n1 = 10;
		int n2 = 20;
		
		boolean result = n1 < n2;
		System.out.println("result : "+result);
		
		result = n1 == n2;
		System.out.println("result : "+result);
		
		result = n1 != n2;
		System.out.println("result : "+result);
		
//		��������
//		�񱳿����ڸ� ���� ������ 2�� �̻� �ʿ��� �� ���
//		����� �������� ��ȯ�Ѵ�.
//		&&, ||, !
		
//		&&�� And(�׸���)�� �ǹ̸� ������ �ִ�. �� �ڰ� ��� true���� true�� ��ȯ�Ѵ�.

		int a = 10;
		int b = 7;
		result = a > b && a != b;
		System.out.println("&&������ : "+result);
//		&&������ ����� ����� ��
//		T && T -> T
//		T && F -> F
//		F && T -> F
//		F && F -> F
//		����Ȳ���� �պκ��� False�� ��� ���� ���� �������� ����
		result = a < b && (a +=1) != b;
		System.out.println("a�� �� : "+a);
		
		
//		||�� Or(�Ǵ�)�� �ǹ̸� ������ �ִ�. �� �� ������ �ϳ��� true�� true�� ��ȯ�Ѵ�.
		result = a < b || a != b;
		System.out.println("||������ : "+result);
//		||������ ����� ����� ��
//		T || T -> T
//		T || F -> T
//		F || T -> T
//		F || F -> F
//		����Ȳ���� �պκ��� true�� ��� ���� ���� �������� ����
		result = a > b || (a +=1) != b;
		System.out.println("a�� �� : "+a);
		
		
//		! Not(����)�� �ǹ̸� ������ �ִ�. True�� False�� False�� True�� �ٲ�
//		���� ���� �տ� !�� ���
		result = a < b || a != b;
		System.out.println("||������ : "+!result);
		
//		����������
//		++,--
//		1�� ������Ű�ų�, 1�� ���ҽ�Ű�� ������ (�ſ� ���� ����)
		int c = 1;
//		�������� : ������ �տ��� ���ȴ�.
		System.out.println("c : "+ ++c);
				
//		�������� : ������ �ڿ��� ���ȴ�.
		System.out.println("c : "+ c++);	//�ܻ��� ����. ������ ���� ���� ���� ��� ����Ѵ�.
		System.out.println("c : "+ c++);
		
		
		
		
		
	}

}

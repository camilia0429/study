package Ex3_while;

public class Ex1_while {
	public static void main(String[] args) {
//		for�����ٴ� ������ ������ ���� �ݺ���(���� ��ó��)
//		�⺻��
//		while(���ǽ�) {
//			���ǽ��� ���� ���� �ݺ��� ���	
//		}
		
		int num = 1; // �ʱ��
		
		while(num <= 10) {
			System.out.print(num);
			num++; //while���� �ʱ���� ���� �������� �� �ִ� ������ �ʿ�.
		}
		
		System.out.println();
		System.out.println();
		
		
//		1~10������ ������ ���Ͽ� ����ϱ�
		
		int total = 0;
		int i = 1;
		
		while(i <= 10) {
			total += 1;
			i++;
		}
		System.out.println(total);
		
//		do - while
//		while���� ���� ��ó���� ������
//		do - while���� ��ó�� �ĺ񱳸� �ϱ� ������ ���ǿ� ���� �ʾƵ� ������ �ѹ��� ������ �ϰ� �ȴ�.
//		��� �� �����ϰ� �ڿ� ����Ŭ��(;)�� �ٿ��� �Ѵ�.
		
//		do {
//			���ǽ��� ���ϵ��� ������ ���
//		}while(���ǽ�);
		
		
		int a = 11;
		do {
			System.out.println(a);
		}while(a<=10);
		
		
		
	}//main

}

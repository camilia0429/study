package Ex6_printf;

public class ex1_printf {
	public static void main(String[] args) {
//		printf:���ڿ��� ������ ����ִ� �����͸� �Բ� ����� �� �ֵ��� �����ִ� ��������
//		printf�� f�� format�̶�� ��
		
		int su1 = 10;
		int su2 = 7;
		
//		10+7+17
		
		System.out.println(su1+"+"+su2+"="+(su1+su2));
		System.out.printf("%d + %d = %d\n",su1,su2,(su1+su2));
		
//		���� ������ (*�ܿ��)
//		1. %d : �������� �Է¹��� �� ���
//		2. %c : �������� �Է¹��� �� ���
//		3. %s : ���ڿ��� �Է¹��� �� ���
//		4. %f : �Ǽ����� �Է¹��� �� ���
		
		int age = 30;
//		���� ���̴� 30�� �Դϴ�.
		System.out.println("���� ���̴� "+age+"�� �Դϴ�");
		System.out.printf("���� ���̴� %d�� �Դϴ�",age);
		System.out.println();
		
//		���� ���̴� 30�� �̰� Ű�� 175�Դϴ�.
		System.out.printf("���� ���̴� %d���̰� Ű�� %d�Դϴ�",age,175);
		
//		�������� 3.141592�Դϴ�.
		System.out.printf("�������� %.2f�Դϴ�\n",3.141592);
		
//		1 2 3 4
//		5 6 7 8
//		9 10 11 12
		
		int count = 1;
		for(int i=0; i <3; i++) {
			for(int j=0; j<4; j++) {
				System.out.printf("%03d ",count);
				count++;
			}
			System.out.println();
		}
		
		
	}//main

}

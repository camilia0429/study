package Ex1_Overload;

public class Ex1_Overload {
//	�޼��� �����ε� : �޼����� '�ߺ�����'��� �ϸ�
//	�ϳ��� Ŭ���� ������ ���� �̸��� ���� �޼��尡 ������ ���� �Ǵ°�
	
//	�޼��� �����ε��� ��Ģ
//	1) �޼����� �̸��� ���ƾ� �Ѵ�
//	2) �Ķ������ ������ �ٸ����
//	3) �Ķ������ ������ ���Ƶ� Ÿ���� �ٸ� ���
//	4) �Ķ������ ������ ���Ƶ� ������ �ٸ� ���
	
	public void result() {
		System.out.println("���ڰ� ���� �޼��� : ");
	}
	public void result(int n) {
		System.out.println("������ ���ڷ� �޴� �޼���");
	}
	public void result(char ch) {
		System.out.println("���ڸ� ���ڷ� �޴� �޼���");
	}
	public void result(String s, int n) {
		System.out.println("���ڿ�, ������ ���ڷ� �޴� �޼���");
	}
	public void result(int n,String s) {
		System.out.println("����, ���ڿ��� ���ڷ� �޴� �޼���");
	}
	
//	��ǥ�� �����ε� : ����Լ�

}

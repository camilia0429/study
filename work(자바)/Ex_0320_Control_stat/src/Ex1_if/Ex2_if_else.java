package Ex1_if;

public class Ex2_if_else {
	public static void main(String[] args) {
//		if - else ��
		
//		�⺻��
//		if(���ǽ�){
//			���ǽ��� ���� �� ������ ���
//		} else {
//			���ǽ��� ������ �� ������ ���
//		}
		
		int n = 49;
		String str = null;	// �ƹ��͵� �ƴ� ��
//		String str; 		       ���� �ص� ����� ����
		
		if(n >= 50) {
			str = "n�� 50 �̻��� ��";
		} else {
			str = "n�� 50 �̸��� ��";
		}
		System.out.println(str);
		
		
//		������ ���� age�� ���̸� �ʱ�ȭ �ϰ�
//		30�� �̻����� "��Ǹ�ŭ ��̳׿�"
//		�׷��� ������ "�� �弼��"�� ����ϴ� if���� ������ ��
//		"�����մϴ�" ��� ���� ���
		
		int age = 33;
		String A = null;
		
		if (age >= 30) {
			A = "��Ǹ�ŭ ��̳׿�";
		} else {
			A = "�� �弼��";
		}
		System.out.println(A+" �����մϴ�");
		
//		�ڻ��׿����� ���
		String str2 = age >= 30 ? "��Ǹ�ŭ ��̳׿�" : "�� �弼��";
		System.out.println(str2+" �����մϴ�");
		
	}

}

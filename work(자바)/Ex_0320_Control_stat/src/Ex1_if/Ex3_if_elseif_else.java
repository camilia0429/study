package Ex1_if;

public class Ex3_if_elseif_else {
	public static void main(String[] args) {
//		if - elseif - else ��
//		- ���ؾ��� ������ ������ �ִ� ��� (elseif�� ������ ���� �� �ִ�)
		
//		�⺻��
//		if(���ǽ�1) {
//			���ǽ�1�� ���� �� ������ ���
//		} elseif(���ǽ�2) {
//			���ǽ�1�� �����̰� 2�� ���϶� ������ ���
//		} elseif(���ǽ�3) {
//			���ǽ�1,2�� �����̰� 3�� ���϶� ������ ���
//		} elseif(���ǽ�4) {
//			���ǽ�1,2,3�� �����̰� 4�� ���϶� ������ ���
//		} else {
//			�� ���ǽ��� ��� �����϶� ������ ���
//		}
		
//		else�� ���� ����
		
		int score = 75;
		
		if(score <=100 && score >= 90) {
			System.out.println("������ A�Դϴ�.");
		} else if(score >= 80) {
			System.out.println("������ B�Դϴ�.");
		} else if(score >= 70) {
			System.out.println("������ C�Դϴ�.");
		} else if(score >=60) {
			System.out.println("������ D�Դϴ�.");
		} else {
			System.out.println("������ F�Դϴ�.");
		}
		
		
//		if���� ��ø
//		if���ȿ� if���� �ִ� ���
//		if(���ǽ�1) {
//			if(���ǽ�2) {
//		
//			}
//		}
		
//		������ ���� num�� ������ ���� �ʱ�ȭ �ϰ�
//		num�� 5�� ����̸鼭 ¦����� "X�� ¦���Դϴ�."��� ����ϱ�
		
		int num = 7;
		
		if (num%5 == 0) {
			if (num%2 == 0) {
				System.out.println(num+"�� ¦���Դϴ�");
			} else {
				System.out.println(num+"�� Ȧ���Դϴ�");
			}
		} else {
			System.out.println(num+"�� 5�� ����� �ƴմϴ�");
		}
				
		
		
		

	}
}
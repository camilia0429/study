package Ex1_single_for;

public class Ex1_single_for {
	public static void main(String[] args) {
//		�ݺ���
//		Ư�� ����� ���ϴ� ��ŭ �ݺ� �����ϴ� ���
//		for,while
		
//		�⺻��
//		for(�ʱ��; ���ǽ�; ������){
//			���ǽ��� ���� �� �ݺ��� ���
//		}
		
//		�ʱ�� : �ݺ��� �ϱ� ���� ���۰�. ������ �ϳ� �ʱ�ȭ �Ѵ�.
//		���ǽ� : �ݺ��� �ϱ� ���� ���ᰪ. �񱳿����ڸ� ���� ����Ѵ�.
//		������ : ������ ���� ���������ִ� ������ �Ѵ�. ���������ڸ� ���� ����Ѵ�.
		
		
		
		
		for(int i = 0; i < 3; i++) {
			System.out.println(i);
		}
		
//		1~10���� �ֿܼ� ����ϴ� �ڵ� �ۼ��ϱ�
		
		for(int r = 1; r < 11; ++r) {
			System.out.println(r);
		}
		
		
		
		int num = 1;
		for(int i = 0; i < 10; i++) {
			System.out.println(num+" ");
			num++;
		}
		
//		10~1���� ����ϴ� �ڵ� �ۼ��ϱ�
		
		for(int i = 10; i > 0; i--) {
			System.out.println(i);
		}
		
		System.out.println("");
		
//		1~10���� 3�� ����� ����ϱ�
		
		for(int i = 1; i < 10; i++) {
			if(i%3 == 0) {
			System.out.println(i);
			}
		}
		
		System.out.println(" ");
		
//		1~20���� Ȧ���� ���
		for(int i = 1; i < 21; i++) {
			if(i%2 != 0) {
				System.out.println(i);
			}
		}
		
		
		System.out.println("");
		System.out.println("");
		
//		1~10���� ���� ���ϱ�
		int l = 0;
		for(int i = 1; i < 11; i++) {
			l += i; // l = l+i �������� ���� ��
			System.out.println(l);
//		��� �ȿ��� ��½� ���Ǵ� ��� ���� ���̰�
		}
		
		System.out.println("");
		System.out.println(l);
//		��� �ۿ��� ��½� ������� ���δ�.
		
//		������ ���� dan�� 2~9������ ���ڷ� �ʱ�ȭ �ϰ�
//		�ش� �������� ����Ͻÿ�
//		������� : 2X1=2
		
		int dan = 3;
		for(int i = 1; i < 10; i++) {
			System.out.println(dan+"X"+i+"="+dan*i);
		}
		
		
		
		
	}//main

}

package Ex1_Array;

public class Ex1_Array {
	public static void main(String[] args) {
		
//		Array(�迭) : ���� �ڷ����� �����͵��� ��Ƴ��� ����
//		ȿ������ ������ ���ؼ� �ݵ�� �ʿ�!
		
//		1. �迭�� ����
//		�ڷ���[] �迭��;
		int[] ar;
		
//		2. �迭�� ����
//		�迭�� = new �ڷ���[����];
		ar = new int[4];
		
//		���� + ����
		int[] arr = new int[4];
		
//		������ �濡 ������ �ֱ�
//		�迭��[index] = ������;
		ar[0] = 100;
		ar[1] = 200;
		ar[2] = 300;
		ar[3] = 400;
		
//		������ �ε�����ȣ : ���� - 1
//		�迭�� ������ �濡 ���� ������ ���� �ִ�.
		for(int i = 0; i < 4; i++) {
			arr[i] = (i+1)*100;
			System.out.println(arr[i]);
		}
		
//		�迭�� �ʱ�ȭ
//		��ȣ ���� ������ ����ŭ �迭�� ũ�⸦ �ڵ����� ����� ��
		int[] iArr = {10,20,30,40,50};
		
		
//		�迭�� ���
		System.out.println(ar[1]);
		
//		�迭�� ���2
//		�ݺ��� �̿�
		for(int i = 0; i < 5; i++) {
			System.out.println(iArr[i]);
		}
		
		
		
	}//main

}

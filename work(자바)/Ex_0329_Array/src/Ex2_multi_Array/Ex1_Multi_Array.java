package Ex2_multi_Array;

public class Ex1_Multi_Array {
	public static void main(String[] args) {
//		�������迭 : 2���� �̻��� �迭�� �ǹ��ϸ�, �迭�� ��ҷ� �迭�� ������ ���� �ǹ�.
//		2���� �迭�� 1���� �迭�� ��ҷ� ����, 3���� �迭�� 2���� �迭�� ��ҷ� ���´�.
		
//		�ڷ���[][] �迭�� = new �ڷ���[1���� �迭�� ����][1���� �迭�� �� ����� ����];
		
//		int [][]arr = new int[2][3];
//		
//		arr[0][0] = 100;
//		arr[0][1] = 200;
//		arr[0][2] = 300;
//		
//		arr[1][0] = 400;
//		arr[1][1] = 500;
//		arr[1][2] = 600;
//		
////		System.out.println(arr[0][0]);
//		
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++)
//				System.out.println(arr[i][j]);
//		}
//		
//		
////		1���� �迭�� �� ����� ���̰� �ٸ� ���
//		char[][] ch = {{'A','B'},{'C','D','E'},{'F'}};
//		
//		for(int i = 0; i < ch.length; i++) {
//			for(int j = 0; j < ch[i].length; j++)
//				System.out.print(ch[i][j]);
//		}
//		
//		1���� �迭�� ����� ���̸� ���� ������ ���� �ִ�.
//		int num[][] = new int[2][];
//		num[0] = new int[3];
//		num[1] = new int[2];
//		
//		for(int i = 0; i < num.length; i++) {
//			for(int j = 0; j < num[i].length; j++) {
//				System.out.print((num[i][j]= n+=100)+" ");
//			}
//		}
		
//		2���� �迭 ar�� ��� ��� ���� �� �հ� ����� ���ϴ� ���α׷� �ۼ��ϱ�
		int ar[][] = {
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				{16,17,18,19,20}
		};
		
		int sum = 0;
		double avg = 0;
		int count = 0; //������ ����� ���� ����
		
		for(int i = 0; i<ar.length; i++) {
			for(int j = 0; j<ar[i].length; j++) {
				sum += ar[i][j];
				count++;		
			}
		}
		
		System.out.println(sum);
		avg=(double)sum/count;
		System.out.println(avg);
		
		
		
	}//main

}

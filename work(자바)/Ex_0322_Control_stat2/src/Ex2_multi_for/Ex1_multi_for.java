package Ex2_multi_for;

public class Ex1_multi_for {
	public static void main(String[] args) {
//		����for�� : for�� �ȿ� for���� �ִ� ���
//		2��(�ι� ��ø), 3��(3�� ��ø). ���� 2��ø���� ���
		
//		�⺻��
//		for(�ʱ��; ���ǽ�; ������) {
//			for(�ʱ��; ���ǽ�; ������) {
//				�ݺ��ϰ��� �ϴ� ���;
//			}
//		}
		
		for(int i = 1; i <= 3; i++) {
			for(int j = 1; j <= 3; j++) {
				System.out.println(i + " " + j); 
			}
		}
		
		
//		1 2 3 4
//		1 2 3 4
//		1 2 3 4
		
		System.out.println("");
		System.out.println("");
		
		for(int i = 0; i < 3; i++) {
			for(int j = 1; j <= 4; j++) {
				System.out.print(j+ " ");
			}
			System.out.println("");
		}
		
		System.out.println("");//�ٹٲ�
		System.out.println("");//�ٹٲ�
		
//		A B C D
//		A B C D
//		A B C D
		
		for(char i = 65; i <= 68; i++) {
			for(char j = 65; j <= 68; j++) {
				System.out.print(j+" ");
			}
			System.out.println("");
		}
		
		System.out.println("");//�ٹٲ�
		System.out.println("");//�ٹٲ�
		
		for(char i = 'A'; i <= 'D'; i++) {
			for(char j = 'A'; j <='D'; j++) {
				System.out.print(j+" ");
			}
			System.out.println(" ");
		}
		
		System.out.println("");//�ٹٲ�
		System.out.println("");//�ٹٲ�
		
		for(int i = 0; i < 3; i++) {
			for(int j = 65; j < 69; j++) {
				System.out.print((char)j+" ");
			}
			System.out.println();
		}
		
		
//		1 2 3 4
//		5 6 7 8
//		9 10 11 12
		
		int a = 1;
		for(int i = 0; i < 3; i++) {
			for(int j = 1; j < 5; j++) {
				System.out.print(a+" ");
				a++;
			}
			System.out.println();
		}
		
		
		
//		1 2 3 4 5 6 7 8 9 10
//		2 3 4 5 6 7 8 9 10 1
//		3 4 5 6 7 8 9 10 1 2
//		4 5 6 7 8 9 10 1 2 3
//		5 6 7 8 9 10 1 2 3 4
//		6 7 8 9 10 1 2 3 4 5
//		7 8 9 10 1 2 3 4 5 6
//		8 9 10 1 2 3 4 5 6 7
//		9 10 1 2 3 4 5 6 7 8
		
		System.out.println();
		System.out.println();
		
		
		for(int i = 1; i <= 10; i++) {
			for(int j = 0; j < 10; j++) {
				int num1 = i+j;
				if(num1>10) {
					num1-=10;
				}
				System.out.print(num1+" ");
				num1++;
			}
			System.out.println("");
			
			}
		
		
		
	}//main

}

package Ex4_break;

public class Ex1_break {
	public static void main(String[] args) {
//		break�� �ݺ��� �������� ����� �ȴ�.
//		break�� ������ �Ǹ� ���� ������ �ִ� �ݺ����� �������� ���� �ڵ带 �����ϰ� �ȴ�.
		
		for(int i = 1; i <= 2; i++) {
			for(int j=1; j <= 3; j++) {
				if( j %2 == 0) {
					break;
				}
				System.out.print(j+"");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
	}//main

}

package Ex4_break;

public class Ex4_label_break {
	public static void main(String[] args) {
		int n = 0;
		outer:while(true) {
			if(n >= 10) {
				break;
			}
			while(true) {
				n++;
				if(n % 3 == 0) {
					System.out.println("continue�� ����");
					continue outer;
				}
				System.out.println(n);
			}
		}
		
		System.out.println();
		System.out.println();

//		�ݺ��� �ȿ��� ���� ����ġ�� break�� ��� �ɱ�
		n = 0;
		
		w:while(n < 10) {
			n++;
			switch(n) {
			case 1:
				System.out.println("switch�� 1�� ���İ�");
				break w; // switch������ break�� switch���� ���������� ������ �켱 �����Ѵ�.label�� ����ϴ� ��� �����
			case 2:
				System.out.println("switch�� 2�� ���İ�");
//				switch���� �ܵ����� ����� �� ���� continue�� ����� �� ����. �ݺ��� ���̶� continue�� ��� ����.
				continue;
			}
			System.out.println(n);
		}
		
		
	}//main

}

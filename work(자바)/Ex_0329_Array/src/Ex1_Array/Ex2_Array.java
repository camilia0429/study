package Ex1_Array;

public class Ex2_Array {
	public static void main(String[] args) {
//		����+����
		char[] ch = new char[4];
		
		ch[0] = 'J';
		ch[1] = 'A';
		ch[2] = 'V';
		ch[3] = 'A';
		
		for(int i = 0; i<=3; i++) {
			System.out.printf("ch[%d] : %c\n",i,ch[i]);
		}
		System.out.println("-------------------");
		
		System.out.println(ch);
		
		System.out.println("-------------------");
		
		
		
//		�濡 ���� ���� ��� null�� ��µȴ�.
		String[] str = new String[3];
		str[0] = "hello";
		
		for(int i = 0; i < 3; i++) {
			System.out.println(str[i]);
		}
		
//		���ڿ��迭�� �ݵ�� �ݺ������� ����ؾ� �Ѵ�.
		System.out.println(str);
		
		
		
	}//main

}

package Ex7_TryCatch;



public class Ex4_TryCatch {
	public static void main(String[] args) {
//		���� : 100
//		��� : 100
		
//		���� : aab
//		aab��(��) ������ �ƴմϴ�
		
		Scanner sc = new Scanner(System.in);
		
		String str = "";
		
		try {
			System.out.print("������ �Է��� �ּ��� : ");
			str = sc.next();
			int num = Integer.parseInt(str);
			System.out.print("�Է� ���� ���� : "+ num);
		} catch (Exception e) {
			System.out.println(str+"��(��) ������ �ƴմϴ�");
		}
		
		
		
		
		
	}//main

}

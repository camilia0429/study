package Ex6_Static;

public class BankMain {
	public static void main(String[] args) {
		Bank bk1 = new Bank("����","02-1111-1111");
		Bank bk2 = new Bank("�д�","031-333-3333");
		Bank bk3 = new Bank("����","042-444-4444");
		
		Bank.interst = 0.1f;
		
		bk1.printBank();
		bk2.printBank();
		bk3.printBank();
//		static ������ Ŭ������ �̸����� �������� ������ �� �ִ�.
//		��ü ���� ���̵� ������ ������ ����� �� �ִ�.
//		static ������ �� �ʿ��� ���� ���

		
		
		
		
		
		
	}//main

}

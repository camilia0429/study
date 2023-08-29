package Ex6_Static;

public class BankMain {
	public static void main(String[] args) {
		Bank bk1 = new Bank("강남","02-1111-1111");
		Bank bk2 = new Bank("분당","031-333-3333");
		Bank bk3 = new Bank("대전","042-444-4444");
		
		Bank.interst = 0.1f;
		
		bk1.printBank();
		bk2.printBank();
		bk3.printBank();
//		static 변수는 클래스의 이름으로 언제든지 접근할 수 있다.
//		객체 생성 없이도 언제든 가져다 사용할 수 있다.
//		static 변수는 꼭 필요할 때만 사용

		
		
		
		
		
		
	}//main

}

package Ex1_Computer;

public class ComMain {
	public static void main(String[] args) {
//		객체화
		Computer com1 = new Computer();
		
//		다른 클래스에 있는 변수 호출하는 법
//		객체명.변수명;
		
		com1.getInfo();
		
		Computer com2 = new Computer();
		
		com2.getInfo();
		
	}//main

}

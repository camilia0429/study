package Ex7_TryCatch;

public class Ex1_TryCatch {
	public static void main(String[] args) {
//		자바에서 프로그램이 실행되는 도중 예외(오류, 에러, 버그)가 발생하면 그 시점에서 프로그램이 종료된다
//		하지만 예상 가능한 오류가 있거나 오류 발생시 이를 무시하고 이후의 작업을 진행해야 하는 경우가 있다
//		예외처리를 통해 프로그램의 비정상적인 종료를 줄여보자
		
//		예상 가능한 오류 : 키보드에서 값을 받을 때 원하는 타입이 아닌 다른 타입으로 받으면 발생하는 오류
		
		int result = 0;
		char[] arr = new char[3];
		
//		ArithmeticException : 정수를 0으로 나누려고 하는 예외
//		ArrayIndexOutOfBoundsException : 없는 방에 값을 넣으려고 할 때 발생하는 예외
				
		try {
//			오류가 날 가능성이 있는 코드가 위치
//			모든 코드를 이 곳에 넣을 경우 정말 오류가 나는 위치가 표시가 되지 않을 경우가 있어
//			try영억 안에는 오류가 날만한 코드 위주로 작성하는 것이 좋다
//			
			result = 10/0;
			arr[3] = 'A';
		} catch (Exception e) {
			e.printStackTrace();
//			System.out.println("정수는 0으로 나눌 수 없습니다.");
//			System.out.println("없는 방에 값을 넣을 수 없습니다.");
//			코드는 위에서 아래로 흐르기 떄문에 위에서 오류가 날 경우 밑에 존재하는 코드는 무시되고 바로 catch영역으로 들어가게 된다
		}
		
		
		
		
		
		
		
		
	}//main

}

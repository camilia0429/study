package Ex7_TryCatch;

public class Ex2_TryCatch {
	public static void main(String[] args) {
		int res = 0;
		int[] arr = new int[2];
		
		try {
			res = 10/1;
			arr[0] = 10;
			
		} catch (ArithmeticException e) {
			System.out.println("정수를 0으로 나눌 수 없습니다");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("존재하지 않는 index로의 접근입니다");
		} finally {
//			try 영역에서의 예외 발생 여부와 관계 없이
//			마지막에 반드시 호출되는 영역
//			오류가 없는 경우에도 호출 됨
			System.out.println("finally");
		}
//		elseif처럼 사용 가능
		
		
		
		
		
	}//main

}

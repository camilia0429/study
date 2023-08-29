package Ex7_TryCatch;



public class Ex4_TryCatch {
	public static void main(String[] args) {
//		정수 : 100
//		결과 : 100
		
//		정수 : aab
//		aab은(는) 정수가 아닙니다
		
		Scanner sc = new Scanner(System.in);
		
		String str = "";
		
		try {
			System.out.print("정수를 입력해 주세요 : ");
			str = sc.next();
			int num = Integer.parseInt(str);
			System.out.print("입력 받은 정수 : "+ num);
		} catch (Exception e) {
			System.out.println(str+"은(는) 정수가 아닙니다");
		}
		
		
		
		
		
	}//main

}

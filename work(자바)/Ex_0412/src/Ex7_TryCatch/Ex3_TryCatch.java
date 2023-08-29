package Ex7_TryCatch;
import java.util.Scanner;
public class Ex3_TryCatch {
	public static void main(String[] args) {
//		문제 :
//		키보드에서 정수를 입력받도록 하고, 정수 이외의 값이 입력 되었다면
//		"정수만 입력 가능" 이라는 메세지를 출력
		
//		결과 :
//		정수를 입력받은 경우
//		정수 : 100
//		입력받은 수 : 100
		
//		정수를 입력받지 않은 경우
//		정수 : aaa
//		정수만 입력 가능
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("정수를 입력해 주세요 : ");
			int n1 = sc.nextInt();
			System.out.println("입력 받은 정수 : "+n1);
		} catch (Exception e) {
			System.out.println("정수만 입력해 주세요");
		}


		
		
		
		
		
	}//main

}

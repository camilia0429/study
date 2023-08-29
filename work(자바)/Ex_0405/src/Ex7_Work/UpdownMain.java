package Ex7_Work;

import java.util.Scanner;

public class UpdownMain {
	public static void main(String[] args) {
//		Updown 클래스를 생성하여 1~50사이의 난수를 발생 시킨다
//		메인 클래스에서 사용자가 키보드에서 정수를 입력 받는다
//		입력받은 정수를 Updown 클래스에서 숫자를 판단하여
//		발생한 나눗보다 크다면 Down, 작다면 Up을 출력
//		사용자가 입력한 숫자와 발생한 난수가 같을 경우에 프로그램 종료
//		정답을 맞춘 경우 프로그램의 종료는 메인 클래스에서 이루어지도록 한다.
		
		
		Scanner scan = new Scanner(System.in);
		Updown ud = new Updown();

		while (true) {
			System.out.print("숫자를 입력해 주세요 : ");
			int num = scan.nextInt();
			if(ud.check(num).Equals("정답")) {
				System.out.println("정답입니다");
				break;
			} else {
				System.out.println(ud.check(num));
			}
		}
		
		

		
		
		
		
	}

}

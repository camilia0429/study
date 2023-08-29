package Ex5_Work;

import java.util.Scanner;

public class TimesTableMain {
//	TimesTable 클래스를 만들고 showTable()메서드를 정의한다.
//	showTable()메서드에는 구구단을 출력하는 코드를 작성
	
//	TimesTableMain에서는 Scanner를 통해 값을 입력받고 TimesTable객체를 생성하여 해당 구구단을 출력하기
	
//	예시
//	출력할 단 입력 : 5
//	5단
//	5 X 1 = 5
//	5 X 2 = 10
//	5 X 3 = 15
//	5 X 4 = 20
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("출력할 단 : ");
		int dan = scan.nextInt();
		
		TimesTable tt = new TimesTable();
		tt.showTable(dan);
			
	}
}

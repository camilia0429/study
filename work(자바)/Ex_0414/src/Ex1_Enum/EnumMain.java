package Ex1_Enum;
import java.util.Scanner;

public class EnumMain {
//	ENUM : 열거형
//	상수들의 묶음
	public enum Item {
//		사용자가 지정한 이름에 순차적으로 INDEX가 부여된다
		START,PAUSE,EXIT
	}
	
	public static void main(String[] args) {
		while(true) {
			System.out.println("0 : 게임시작");
			System.out.println("1 : 일시정지");
			System.out.println("2 : 게임종료");
			
			Scanner sc = new Scanner(System.in);
			System.out.print("번호를 입력해 주세요 : ");
			int n = sc.nextInt();
			
			Item start = Item.START;
			Item pause = Item.PAUSE;
			Item exit = Item.EXIT;
			
			if(n == start.ordinal()) {
				System.out.println("게임이 시작됨");
			} else if(n == pause.ordinal()) {
				System.out.println("게임이 일시정지됨");
				break;
			} 		

			
		}//while
	}

}

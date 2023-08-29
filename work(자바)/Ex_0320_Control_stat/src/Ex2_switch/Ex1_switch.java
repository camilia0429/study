package Ex2_switch;

public class Ex1_switch {
	public static void main(String[] args) {
//		기본형
		
//		switch(비교값){
//		case 조건값1:
//			비교값과 조건값1이 일치할 때 실행할 명령;
//			break;
//		case 조건값2:
//			비교값과 조건값2이 일치할 때 실행할 명령;
//			break;
//		case 조건값3:
//			비교값과 조건값3이 일치할 때 실행할 명령;
//			break;
//		}
		
		int n = 4;
		switch(n) {
		case 1:
			System.out.println("1. 게임하기");
			break; // 현재 switch문을 빠져나오는 키워드
		case 2:
			System.out.println("2. 게임소개");
			break;
		case 3:
			System.out.println("3. 종료");
			break;
		default: // 비교값과 조건값이 일치하는 것이 하나도 없는경우 실행되는 영역
			System.out.println("메뉴선택이 올바르지 않습니다.");
		}
		
//		if VS switch
//		if문은 범위와 관련된 조건에서 많이 사용한다.
//		switch문은 하나하나 비교하는 조건에서 많이 사용된다.
		
		
		
		
		
		
	}

}

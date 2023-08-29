package Ex2_switch;

public class Ex3_switch {
	public static void main(String[] args) {
//		임의의 정수형 변수 months를 초기화 하고 1~12사이의 임의의 값으로 초기화 시킨다.
//		해당 달이 몇일까지 있는지 switch문을 이용하여 작성하기
		
		int months = 7;
		
		switch (months) {
		case 1 :case 3 :case 5 :
		case 7 :case 8 :case 10 :
		case 12 :
			System.out.println("31일까지 있습니다");
			break;
		case 4 :case 6 :
		case 9 :case 11 :
			System.out.println("30일까지 있습니다.");
			break;
		default :
			System.out.println("28일까지 있습니다.");
			break;
		}
		
		
		
		
		
	}

}

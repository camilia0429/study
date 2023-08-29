package Ex2_switch;

public class Ex2_switch {
	public static void main(String[] args) {
		char c = 'C';
		switch(c) {
		case 'A':
			System.out.println("100~90점 사이입니다.");
			break;
		case 'B':
			System.out.println("89~80점 사이입니다.");
			break;
		case 'C':
			System.out.println("79~70점 사이입니다.");
			break;
		case 'D':
			System.out.println("69~60점 사이입니다.");
			break;
		default:
			System.out.println("59점 이하입니다.");
			break;
		}
		
		String str = "김";
		switch(str) {
		case "김":
			System.out.println("김길동");
			break;
		case "이":
			System.out.println("이길동");
			break;
		case "박":
			System.out.println("박길동");
			break;
		case "홍":
			System.out.println("홍길동");
			break;
		}
		
//		break를 의도적으로 생략하는 경우

		int num = 6;
		
		switch(num) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 9:
			System.out.println(num+"은 홀수입니다.");
			break;
		case 2:
		case 4:
		case 6:
		case 8:
		case 10:
			System.out.println(num+"은 짝수입니다");
			break;
		}
		
		
		
	} //main

}

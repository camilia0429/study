package Ex2_switch;

public class Ex2_switch {
	public static void main(String[] args) {
		char c = 'C';
		switch(c) {
		case 'A':
			System.out.println("100~90�� �����Դϴ�.");
			break;
		case 'B':
			System.out.println("89~80�� �����Դϴ�.");
			break;
		case 'C':
			System.out.println("79~70�� �����Դϴ�.");
			break;
		case 'D':
			System.out.println("69~60�� �����Դϴ�.");
			break;
		default:
			System.out.println("59�� �����Դϴ�.");
			break;
		}
		
		String str = "��";
		switch(str) {
		case "��":
			System.out.println("��浿");
			break;
		case "��":
			System.out.println("�̱浿");
			break;
		case "��":
			System.out.println("�ڱ浿");
			break;
		case "ȫ":
			System.out.println("ȫ�浿");
			break;
		}
		
//		break�� �ǵ������� �����ϴ� ���

		int num = 6;
		
		switch(num) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 9:
			System.out.println(num+"�� Ȧ���Դϴ�.");
			break;
		case 2:
		case 4:
		case 6:
		case 8:
		case 10:
			System.out.println(num+"�� ¦���Դϴ�");
			break;
		}
		
		
		
	} //main

}

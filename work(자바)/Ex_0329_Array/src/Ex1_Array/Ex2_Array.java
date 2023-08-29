package Ex1_Array;

public class Ex2_Array {
	public static void main(String[] args) {
//		선언+생성
		char[] ch = new char[4];
		
		ch[0] = 'J';
		ch[1] = 'A';
		ch[2] = 'V';
		ch[3] = 'A';
		
		for(int i = 0; i<=3; i++) {
			System.out.printf("ch[%d] : %c\n",i,ch[i]);
		}
		System.out.println("-------------------");
		
		System.out.println(ch);
		
		System.out.println("-------------------");
		
		
		
//		방에 값이 없는 경우 null로 출력된다.
		String[] str = new String[3];
		str[0] = "hello";
		
		for(int i = 0; i < 3; i++) {
			System.out.println(str[i]);
		}
		
//		문자열배열은 반드시 반복문으로 출력해야 한다.
		System.out.println(str);
		
		
		
	}//main

}

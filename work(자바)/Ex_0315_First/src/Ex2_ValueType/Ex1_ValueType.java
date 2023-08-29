 package Ex2_ValueType;

public class Ex1_ValueType {
	public static void main(String[] args) {
//		자료형
//		문장의 조건 : 2글자 이상, ""안에 들어가 있는 것
		
//		논리형 : 	boolean	- 1bit
//		정수형 : 	byte	- 1byte -128 ~ 127 
//				short	- 2byte -32,768 ~ 32,767
//				int		- 4byte -2,147,483,648 ~ 2,147,483,647
//				long	- 8byte	-900경 ~ 900경
//		실수형 : 	float	- 4byte
//				double	- 8byte
//		문자형 : 	char	- 2byte	(''안의 한글자 ex)'A')
		
//		변수
//		자료형이 컵의 재질과 크기라면 변수는 컵을 만드는 과정

//		1. 변수의 선언과 대입
//		선언 : 비어있는 컵을 만듦
//		자료형 변수명;
		
//		대입 : 만들어진 컵에 물을 넣는것(데이터를 넣는것)
//		변수명 = 데이터;
		
//		2. 변수의 초기화 -> 컵을 만듦과 동시에 음료를 채워넣는 것 (리셋X 초기값을 적용하는 개념)
//		초기화 : 초기값을 세팅
//		자료형 변수명 = 데이터; -> 선언 = 대입
		
//		변수명 명명규칙
//		1. 첫글자에 숫자가 들어갈 수 없다.
//		2. _를 제외하고 특수문자는 사용할 수 없다.
//		3. 예약어 금지(if,for,switch,while 등)
//		4. 한글은 절대X
//		5. 첫글자에 대문자는 사용하지 않는다.
//		6. 의미있는 단어로 짓기(숫자면 number,이름이면 name)
		
		/*
		 * 논리형 (참인지 거짓인지 판별, ture, fals 두가지) 
		 * 참(true), 거짓(false)
		 */
		
		boolean b1 = true;
		System.out.println("b1의 값 : "+b1);
	
		/*
		 * boolean b2 = 1; 변수의 자료형과 데이터의 자료형이 일치하지 않아 오류발생 (boolean 논리형, 숫자1은 정수)
		 */
		
		/*
		 * 문자형
		 * 문자형 데이터는 ''안에 들어가고 무조건 한 글자만 들어갈 수 있다.
		 */
		char ch = 'A';
		System.out.println("ch의 값 : "+ch);
		
		char ch2 = 65;
		System.out.println("ch2의 값 : "+ch2);
//		아스키코드 값으로 변환되어 출력
		
//		정수형 (소수점이 없는 숫자)
//		byte b = 128; byte의 자료형의 표현범위를 벗어났기 때문에 오류 발생
		byte b = 127;
		short s = 32767;
		int i = 550;
		
		System.out.println("b의 값은 : "+b);
		System.out.println("s의 값은 : "+s);
		System.out.println("i의 값은 : "+i);
		
//		실수형 (소수점이 있는 숫자)
		float f = 3.14f;
//		실수에 대한 기본 자료형은 double로 되어있다.
//		f를 뒤에 붙혀서 명시를 해줘야 한다.
//		이때 실수 뒤에 붙은 f는 출력되지 않는다.
		double d = 1.23;
		
		System.out.println("f의 값은 : "+f);
		System.out.println("d의 값은 : "+d);
		
		
		
		
	
		
	}

}

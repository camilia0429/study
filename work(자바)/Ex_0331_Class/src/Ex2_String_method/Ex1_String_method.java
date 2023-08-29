package Ex2_String_method;

public class Ex1_String_method {
	public static void main(String[] args) {
//		해당 클래스를 객체로 만드는 법
//		클래스명 객체명 = new 클래스명();
		
//		함수 호출하는 법
//		위에서 만든 객체를 통해 -> 객체명.함수명();
		
		String str = "Kim Mal Dong";
		System.out.println("문자열 str의 길이 : "+str.length());
//		클래스명.length(); 공백을 포함하여 길이를 반환한다.
		
		System.out.println("맨 처음 문자 K의 위치 : "+str.indexOf('K'));
//		클래스명.indexOf(''); 공백을 포함하여 추출할 문자의 위치값을 반환
		
		System.out.println("추출한 문자 : "+str.charAt(4));
//		클래스명.charAt();공백 제외 문자열 추출
		
		System.out.println("원하는 문자열 추출하기 : "+str.substring(4,7));
//		클래스명.substring(4,7); 4이상, 7미만의 문자열 추출
		
		
		String[] str2 = str.split(" ");
		for(int i = 0; i<str2.length; i++) {
			System.out.printf("str2[%d] : %s\n",i,str2[i]);
		}
//		클래스.split("");어떠한 문자를 기준으로 잘라서 배열에 넣어준다. 
		
		
//		숫자 모양을 하고 있는 문자열을 실제 숫자로 바꾸는 법 (매우 많이 쓰임)
		String number = "100";
		int n = Integer.parseInt(number);
		System.out.println(n+1);
//		반대의 경우
		int num = 10;
		String s = Integer.toString(num);
		System.out.println(s+1);
		
		
		
		
	}//main

}

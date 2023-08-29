package Ex1_Casting;

public class Ex2_Demotion {
	public static void main(String[] args) {
//		강제형변환 : 큰 자료형에서 작은 자료형에 대입
		
		char c = 'B'; // 2byte
		int n = c+1; //자동형변환
		
		c=(char)n;
//		강제 형변환을 하는 경우 앞 괄호에 표현함수를 기입
		
		System.out.println("c의 값 : "+c);
		
		float f = 5.5f;
		int n1 = 0;
		
		n1 = (int)f; //같은 4byte여도 자료형이 일치하지 않으면 대입이 되지 않는다.
		System.out.println("n1의 값 : "+n1);
		//float에서 int로 캐스팅 되면서 소수점 이하 자리수가 유실된다(버림)
		
		byte b1 = 100;
		byte b2 = 20;
//		byte b3 = b1 + b2; //오류발생
//		바이트끼리의 연산은 int로 도출, int=4byte, byte=1byte
		int b3 = b1+b2;
		
		
		
	}

}

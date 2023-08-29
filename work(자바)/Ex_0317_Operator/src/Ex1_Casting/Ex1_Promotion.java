package Ex1_Casting;

public class Ex1_Promotion {
	public static void main(String[] args) {
//		형 변환 : 한 자료형에서 다른 자료형으로 바꾸는 것
//		- 자동형변환(묵시적형변환) : 작은 자료형에서 큰 자료형에 대입, 자동으로 일어남
//		- 강제형변환(명시적형변환) : 큰 자료형에서 작은 자료형에 대입
		
		double d = 100.5; // 8byte
		int n = 200; // 4byte
		
		d = n;
		System.out.println("d의 값 : "+d);
		
		char c = 'A'; // 2byte
		long l = 100; //8byte
		
		l = c;
		System.out.println("l의 값 : "+l);	
		
	}

}

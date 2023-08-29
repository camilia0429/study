package Ex2_Operator;

public class Ex3_Operator {
	public static void main(String[] args) {
//		삼항연산자
//		조건을 하나 명시하여 조건이 참일 때 반환할 값, 거짓일 때 반환할 값을 얻어내기 위한 연산자
		
		int a = 10;
		int b = 15;
		
		boolean result = ++a >= b ? true : false;
//		조건이 True일 경우 콜론의 왼쪽 값을 반환, False일 경우 오른쪽 값을 반환한다.
		System.out.println("result : "+result);
		
		int n1 = 10;
		int n2 = 20;
		
		char result2 = n1 != n2 ? 'O' : 'X';
		System.out.println("result2 : "+result2);
		
		
//		과수원에 배, 사과, 오렌지를 하루에 각 5,7,5개 생산하고 있다.
//		하루에 생산되는 총 개수를 출력하고 시간당 전체 과일의 평균 생산 개수를 출력
//		평균값을 담는 변수는 float로 할 것
		
		int A = 5;
		int B = 7;
		int C = 5;
		
//		총합을 담아줄 변수 사용		
		int resultA = A + B + C;
		System.out.println("하루에 생산되는 총 개수 : "+resultA);
		
//		평균을 담아줄 변수 사용
		float resultB = resultA/24f;
//		float resultB = (float)resultA/24;
		System.out.println("시간당 생산되는 개수 : "+resultB);
		
		
	}

}

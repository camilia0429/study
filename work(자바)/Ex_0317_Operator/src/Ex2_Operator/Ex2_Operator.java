package Ex2_Operator;

public class Ex2_Operator {
	public static void main(String[] args) {
//		비교연산자
//		변수나 상수의 값을 비교하여 참과 거짓을 판단하는 연산자
//		연산의 결과가 항상 논리형 참(true)과 거짓(false)으로 반환된다.
//		<(미만), >(초과), <=(이하), >=(이상), ==(같다), !=(같지않다)
		
		int n1 = 10;
		int n2 = 20;
		
		boolean result = n1 < n2;
		System.out.println("result : "+result);
		
		result = n1 == n2;
		System.out.println("result : "+result);
		
		result = n1 != n2;
		System.out.println("result : "+result);
		
//		논리연산자
//		비교연산자를 통한 연산이 2개 이상 필요할 때 사용
//		결과를 논리형으로 반환한다.
//		&&, ||, !
		
//		&&는 And(그리고)의 의미를 가지고 있다. 앞 뒤가 모두 true여야 true를 반환한다.

		int a = 10;
		int b = 7;
		result = a > b && a != b;
		System.out.println("&&연산자 : "+result);
//		&&연산자 결과의 경우의 수
//		T && T -> T
//		T && F -> F
//		F && T -> F
//		F && F -> F
//		위상황에서 앞부분이 False일 경우 뒤의 값을 연산하지 않음
		result = a < b && (a +=1) != b;
		System.out.println("a의 값 : "+a);
		
		
//		||는 Or(또는)의 의미를 가지고 있다. 앞 뒤 연산중 하나라도 true면 true를 반환한다.
		result = a < b || a != b;
		System.out.println("||연산자 : "+result);
//		||연산자 결과의 경우의 수
//		T || T -> T
//		T || F -> T
//		F || T -> T
//		F || F -> F
//		위상황에서 앞부분이 true일 경우 뒤의 값을 연산하지 않음
		result = a > b || (a +=1) != b;
		System.out.println("a의 값 : "+a);
		
		
//		! Not(부정)의 의미를 가지고 있다. True를 False로 False를 True로 바꿈
//		논리형 변수 앞에 !를 사용
		result = a < b || a != b;
		System.out.println("||연산자 : "+!result);
		
//		증감연산자
//		++,--
//		1씩 증가시키거나, 1씩 감소시키는 연산자 (매우 많이 쓰임)
		int c = 1;
//		선행증감 : 변수의 앞에서 사용된다.
		System.out.println("c : "+ ++c);
				
//		후행증감 : 변수의 뒤에서 사용된다.
		System.out.println("c : "+ c++);	//외상의 개념. 다음에 같은 식이 나올 경우 계산한다.
		System.out.println("c : "+ c++);
		
		
		
		
		
	}

}

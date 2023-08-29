package Calculator;

public class Calculator3 {
	public static void main(String[] args) {
//		(파라미터)->{명령or반환값};
		
		MyCalculator calc = (int num1,int num2) -> {
			return num1+num2;
		};
		
//		인터페이스에 이미 정의가 되어 있기 때문에 자료형도 생략이 가능.
//		중괄호와 return도 생략이 가능
		MyCalculator calc2 = (num1,num2) -> num1+num2;
		
		MyFunction myfunction = num1 -> System.out.println(num1);
		
//		:: (이중콜론) : 메서드 참조연산자.
//		람다식을 보다 간결하게 사용할 수 있도록 해준다
		MyFunction myfunc = System.out::println;
		
		
		
	}//main

}

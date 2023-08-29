package Calculator;

public class Calculator {
	public static void main(String[] args) {
		
		MyCalculator calc = (int num1,int num2) -> {return num1 + num2;};
		
		int result = calc.plus(20, 30);
		System.out.println(result);
		
		
		
		
	}//main

}

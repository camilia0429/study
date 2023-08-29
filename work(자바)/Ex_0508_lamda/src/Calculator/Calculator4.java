package Calculator;

public class Calculator4 {
	public static void main(String[] args) {
		MyCalculator calc = (num1,num2) -> num1+num2;
		int result = myCalc(calc);
		
		System.out.println(result);
		
		int result2 = myCalc((num1,num2)->num1+num2);
		System.out.println(result2);
		
		
		
	}//main
	
	static int myCalc(MyCalculator calc) {
		return calc.plus(1, 2);
	}

}

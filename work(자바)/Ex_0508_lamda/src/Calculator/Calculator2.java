package Calculator;

public class Calculator2 {
	public static void main(String[] args) {
//		지역 내부 익명 클래스
//		익명 클래스는 내부 클래스(inner class)의 일종으로 이름이 없는 클래스를 말한다
//		나중에 다시 불러질 이유가 없다는 뜻을 내포하고 있다
//		즉 프로그램에서 일시적으로 한번만 사용되고 버려지는 객체라고 보면 된다
		MyCalculator cal = new MyCalculator() {
			
			@Override
			public int plus(int num1, int num2) {
				// TODO Auto-generated method stub
				return 0;
			}
			
		};
		
		
		
		
		
	}//main

}

package Calculator;

@FunctionalInterface
//컴파일러에게 이 인터페이스를 람다식으로 사용할 예정이라고 선언.
public interface MyCalculator {
	
	public int plus(int num1,int num2);

}

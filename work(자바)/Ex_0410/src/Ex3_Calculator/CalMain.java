package Ex3_Calculator;

public class CalMain {
	public static void main(String[] args) {
//		Calculator클래스를 만들고
//		getResult()함수를 정의하세요
//		반환형은 정수, 인자는 두개(n1,n2)를 받고 리턴값은 -1
		
//		Calplus클래스를 만들어 Calculator클래스를 상속받는다
//		오버라이딩을 이용하여 getResult()함수를 재정의 하여
//		인자로 받은 n1+n2를 하는 함수로 만든다
//		이 때 리턴값도 -1이면 안됨
		
//		CalMinus클래스를 만들어 Calculator클래스를 상속받는다.
//		오버라이딩을 이용하여 getResult()함수를 재정의 하여
//		인자로 받은 n1-n2를 하는 함수로 만든다
		
//		Main에서 실행하여 아래와 같은 결과가 나오면 성공
//		CalPlus : 30
//		CalMinus : 15
		
		CalPlus cp = new CalPlus();
		System.out.println("CalPlus : "+cp.getResult(10,20));
		
		CalMinus cm = new CalMinus();
		System.out.println("CalMinus : "+cm.getResult(20, 10));
		
	}

}

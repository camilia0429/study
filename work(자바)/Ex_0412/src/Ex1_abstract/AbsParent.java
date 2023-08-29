package Ex1_abstract;

abstract public class AbsParent {
	
//	추상메서드를 하나라도 가지고 있는 클래스는 '추상클래스'라고 정의
	
	int value = 100;
	public int getValue() { // 일반적인 메서드
		return value;
	}
	
//	일반메서드와 다른점은 {}안의 내용이 없음
//	추상메서드는 body가 없기 때문에 "미완성적 개념"이라고 한다
	
	abstract public void setValue(int n); //추상메서드
//	public abstract void setValue(int n); 이렇게도 사용 가능
	
//	그러므로 미완성적 개념을 자식이 물려받아서
//	완성 시켜야 하는것이 하나의 조건이 된다
	
	
	
	
	

}

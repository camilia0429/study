package Ex1_abstract;

public class AbsMain {
	public static void main(String[] args) {
		
//		일반적인 방법으로는 추상 클래스를 객체화 시킬 수 없다.
//		AbsParent ap = new AbsParent(); <=이거안됨
		
//		추상 클래스는 자신의 기능을 자식이 완성 시키도록 조건부 상속하여
//		자식클래스가 생성될 때 객체가 된다
		AbsChild ac = new AbsChild();
		ac.setValue(20);
		System.out.println(ac.getValue());
		
		
		
		
	}//main

}

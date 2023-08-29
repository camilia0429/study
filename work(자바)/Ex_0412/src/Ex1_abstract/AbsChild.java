package Ex1_abstract;

public class AbsChild extends AbsParent {
	
	
//	추상 클래스를 상속받은 자식클래스는
//	부모가 가지고 있는 추상메서드(미완성)를 무조건 받아둬야 한다
//	재정의 할 필요는 없지만 오버라이딩을 해서 가지고 있어야 한다
	
	@Override
	public void setValue(int n) {
		System.out.println("추상메서드 재정의 함");
	}
	
	
	
	
	
	
	

}

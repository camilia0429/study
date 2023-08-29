package Ex6_Object;

public class ExtendsEx1 {
//	현재 클래스의 변수나 메서드가 어떨때는 String을 받고
//	어떨때는 int를 받는 등, 상황에 따라서 자료형을 받아야 한다면
//	변수의 자료형이나 메서드의 파라미터에 자료형을 어떻게 선언을 해야 할까
	
	Object value; //자바 객체의 최상위인 Object형으로 변수를 생성
	
	public Object getValue() {
		return value;
	}
	
	public void getValue(Object value) {
		this.value = value;
	}

}

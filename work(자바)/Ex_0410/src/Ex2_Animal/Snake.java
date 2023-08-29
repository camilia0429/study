package Ex2_Animal;

public class Snake extends Animal {
	
	String sensor = "감각이 발달";
	
//	메서드 오버라이딩 : "메서드의 재 정의" 의미를 가진다.
//	상속관계의 객체에서 부모의 메서드를 자식이 가져와 사용하되,
//	이름은 그대로 두고 내용만 현재 자식클래스의 사정에 맞도록 재정의 하는 것
//	오버라이딩 된 메서드는 내용을 제외하고는 부모의 것과 완전히 동일해야 한다.
//	int leg = 0; <=이렇게 사용해도 문제는 없다.
	
	
	
	
//	@Override -> 어노테이션, 주석의 일부. 내용에 영향은 없음.
	@Override
	public int getLeg() {
		return 0;
	}
	

}

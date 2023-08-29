package Ex4_Super;

public class Child extends Parent {
	
	public Child() {
		super(1); // 부모 클래스의 생성자가 파라미터를 받으면
				  // 생략할 수 없다.
		System.out.println("자식(Child)클래스");
	}
	
	@Override
	public int result() {
		return super.result();
	}

}

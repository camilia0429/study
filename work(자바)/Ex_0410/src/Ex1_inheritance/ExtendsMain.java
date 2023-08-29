package Ex1_inheritance;

public class ExtendsMain {
	public static void main(String[] args) {
		
//		Child 클래스는 Parent 클래스를 상속받은 상태이므로
//		부모로부터 상속받은 money, str 등의 변수를 마음대로 가져가 사용할 수 있다.
		
		Child c1 = new Child();
		System.out.println(c1.car);
		System.out.println(c1.money);
		System.out.println(c1.str);
		
		System.out.println("-------------------");
		
		Parent p1 = new Parent();
		System.out.println(p1.money);
		System.out.println(p1.str);
		
//		상속 관계라 할지라도 부모 클래스는 자식의 재산을 마음대로 가져가 사용할 수 없다.
//		System.out.println(p1.car); <= 사용X
		
		
//		c1이 Parent와 상속관계라면
//		instanceof 키워드를 통해 true값을 얻을 수 있다.
		if(c1 instanceof Parent) {
			System.out.println("c1은 Parent의 자식!!");
		}
		
		
//		상속의 특징
//		1. 한명의 자녀가 두명의 부모를 갖는게 불가능하다.
//		2. 언제 어떤 상황이 됐든 상속관계의 꼭대기에는 Object 클래스가 있다.
//		Object는 모든 타입을 받아 들일 수 있는 최상위 객체.
//		3. 한명의 부모는 여러명의 자식을 가질 수 있다.
		
		
		
		
	}//main

}

package Ex1_generic;

public class GenEx<T> {
	
//	제네릭스
//	일반적인 코드를 작성하고 이 코드를 다양한 타입의 객체에 대하여 재사용 하는 객체지향 기법
//	객체의 타입을 컴파일 할 때 체크하기 때문에 타입에 대해 안정성을 높히고 행변환을 행야하는 번거로움을 줄일 수 있다.
	
//	public class 클래스명<제네릭타입> {}
//	public interface 인터페이스명<제너릭타입> {}
//	T를 타입변수(typed variable)라고 하며 Type의 첫글자에서 따온것
//	E(Element),K(Key),V(Value)를 사용하기도 한다.
	
	T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
	

}

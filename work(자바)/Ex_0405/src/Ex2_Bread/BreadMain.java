package Ex2_Bread;

public class BreadMain {
//	Bread 클래스를 만들어 각기 다른 기능을 하는 makeBread() 메서드를 세개 만든다
//	BreadMain클래스에서 각각의 메서드를 호출했을 때의 결과를 보고
//	로직을 구현해보세요
	
//	빵을 만들었습니다. -> 첫번째 makeBread()메서드 호출
	
//	빵을 만들었습니다.
//	빵을 만들었습니다.
//	...
//	빵을 만들었습니다.
//	요청하신 n개의 빵을 만들었습니다. -> 두번째 makeBread()메서드 출력
	
//	00빵을 만들었습니다.
//	00빵을 만들었습니다.
//	...
//	00빵을 만들었습니다.
//	요청하신 n개의 00빵을 만들었습니다. -> 세번째 makeBread() 메서드 출력
	
	public static void main(String[] args) {
		makeBread mb = new makeBread();
		mb.result();
		mb.result(5);
		mb.result(3, "호밀");
		
	}//main
}

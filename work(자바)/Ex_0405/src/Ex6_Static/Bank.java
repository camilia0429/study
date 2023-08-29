package Ex6_Static;

public class Bank {
	
//	변수가 static으로 선언되면 객체를 생성하지 않고도 사용할 수 있다.
//	static변수를 가지는 객체를 아무리 많이 생성한다고 할지라도
//	static변수는 메모리에 오직 한번만 만들어진다.
	
	private String name = "우리은행";
	private String point; // 지점
	private String tel; // 전화번호
	static float interst = 10f; //이자율
	
	public Bank(String point,String tel) {
		this.point = point;
		this.tel = tel;
	}
	
	
	
//	getter 역할을 하는 메서드
	public void printBank() {
		System.out.println("이름 : "+name);
		System.out.println("위치 : "+point);
		System.out.println("전화번호 :"+tel);
		System.out.println("이자율 :"+interst+"%");
		System.out.println("===================");
	}
	

}

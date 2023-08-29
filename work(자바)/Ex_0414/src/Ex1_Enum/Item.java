package Ex1_Enum;

public enum Item {
	START("시작",0),STOP("멈춤",1),EXIT("종료",2);
	
	String ItemStr;
	int sign;
	
//	하단 생성자는 enum클래스내에 꼭 생성.
//	외부에서 호출할 수 없어 프라이빗으로 만들어짐
	private Item(String str, int sign) {
		this.ItemStr = str;
		this.sign = sign;
	}
	
	public String getItemStr() {
		return ItemStr;
	}
	public int getsign() {
		return sign;
	}

}

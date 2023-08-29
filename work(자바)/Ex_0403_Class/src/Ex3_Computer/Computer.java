package Ex3_Computer;

public class Computer {
	private String brand = "SAMSUNG";
	
//	setter & getter 
//	목적은 private으로 만들어진 변수의 값을 변경하거나 조회하고 싶을 때 사용하는 메서드
	
	public void setBrand(String a) {
		brand = a;
	}
		
	public String getBrand() {
		return brand;
	}

}

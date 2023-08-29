package Ex2_generic;

public class Main {
	public static void main(String[] args) {
//		Main클래스를 만들어 Integer[], Double[], Character[]를 만든뒤
//		Gen클래스의 prinArr메서드를 각각 호출하여 배열의 내용을 출력하도록 해보자
		
		
		Integer[] iArr = {1,2,3,4,5};
		Double[] dArr = {1.1,2.2,3.3,4.4,5.5};
		Character[] cArr = {'A','B','C','D','E'};
		
		Gen<> g1 = new Gen();
		g1.printArr(iArr);
		g1.printArr(cArr);
		g1.printArr(dArr);
		
		
		
		
		
	}//main

}

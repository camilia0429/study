package Ex1_Enum;

public class TransportationMain {
	public static void main(String[] args) {
//		values() : 열거형 상수안에 들어있는 내용들을 enum타입의 배열로 반환
		
		Transportation[] trans = Transportation.values();
		
		for (int i = 0; i < trans.length; i++) {
			System.out.printf("name : %s, 100km - fare : %d\n",trans[i].name(),trans[i].totalFare(100));
		}
		
		
		
		
		
	}//main

}

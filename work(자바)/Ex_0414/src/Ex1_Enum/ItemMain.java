package Ex1_Enum;

public class ItemMain {
	public static void main(String[] args) {
		
//		Item item = new Item(); -> 열거형의 생성자를 외부에서 호출하는 것은 불가능!
		
//		for문을 이용하여 열겨형의 전체 내용 출력하기
		
		Item[] items = Item.values();
		
//		향상된 for문. 배열만 사용가능. 중간에 멈추거나 삭제, 수정이 불가능하다
		for(Item item : items) {
			System.out.printf("%s,%d\n",item.getItemStr(),item.getsign());
		}
		

		

		
		
		
	}//main

}

package ArrayList;

import java.util.ArrayList;

public class Ex2_ArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10); //index : 0
		list.add(10); //index : 1
		list.add(1, 20); //index 1에 데이터 추가, 방번호가 밀린다.
		list.set(2, 20); //index 2의 값을 데이터로 수정
		list.add(55);
		list.remove(1);//중간 index가 삭제되면 뒤의 인덱스들이 당겨진다
		System.out.println(list.isEmpty()); // 비어있으면 true, 아니면 false반환
		
		System.out.println(list.indexOf(55)); // Value값의 인덱스 번호를 반환하는 메서드
		
		System.out.println(list);
		
		
		
		
		
		
	}//main

}

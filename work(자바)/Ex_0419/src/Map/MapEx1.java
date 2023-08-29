package Map;

import java.util.HashMap;

public class MapEx1 {
	public static void main(String[] args) {
//		Map의 구조는 키(Key)와 값(Value)이 하나의 데이터로 저장
//		Map구조는 Key를 통해서 Value를 검색해내므로 많은 양의 데이터를
//		조회하는데 있어 매우 뛰어난 성능을 발휘
		
//		Map을 구현하고 있는 자식 클래스 중 가장 많이 사용하는 클래스는 HashMap이다.
		HashMap<Integer, Character> map = new HashMap<Integer, Character>();
		
//		HashMap에 데이터 추가하기
		map.put(1, 'A');
		map.put(2, 'B');
		map.put(3, 'C');
		
//		map에 저장되는 Value값은 중복이 될 수 있다.
		map.put(4, 'A');
//		map의 Key값은 중복이 될 수 없다.
		map.put(1, 'F'); // 이미 존재하는 Key값이 있다면 Value를 갱신한다
		
//		map에서 데이터 제거하기
		map.remove(3);
		
//		map에서 value값 한개 꺼내오기
		System.out.println(map.get(1));
		
//		map의 크기
		System.out.println(map.size());
		
		System.out.println(map);
		
		
	}//main

}

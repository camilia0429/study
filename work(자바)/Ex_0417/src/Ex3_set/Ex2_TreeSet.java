package Ex3_set;

import java.util.Iterator;
import java.util.TreeSet;

public class Ex2_TreeSet {
	public static void main(String[] args) {
		
//		TreeSet은 이진탐색트리 중 성능을 향상시킨 레드 -> 블랙 트리로 구현되어 있다
//		레드-블랙 트리는 부모 노드보다 작은 값을 가지는 노드는 왼쪽 자식으로 큰값을 가지는 노드는 오른쪽 가지로 
//		배치하여 데이터의 추가나 삭제 시 트리가 반쪽으로 치우치지 않도록 균형을 맞춰 준다
		
		TreeSet<Integer> set1 = new TreeSet<Integer>();
//		TreeSet<Integer> set1 = new TreeSet<>();
//		TreeSet<Integer> set2 = new TreeSet<Integer>(set1); set1의 모든 요소를 갖고 TreeSet 생성
		
//		TreeSet에 값 추가하기
		set1.add(7);
		set1.add(4);
		set1.add(9);
		set1.add(1);
		set1.add(5);
		
		set1.add(7); //-> 역시 중복 X
		
		System.out.println(set1); // 전체 출력
		System.out.println(set1.first()); // 최소값 출력
		System.out.println(set1.last()); // 최대값 출력
		System.out.println(set1.higher(3));//입력값보다 큰 데이터 중에서 최소값. 없으면 null 반환
		System.out.println(set1.lower(3)); //입력값보다 작은 데이터 중에서 최대값. 없으면 null 반환
		
//		반복자(iterator)를 이용한 출력
		Iterator iter = set1.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		
	}//main

}

package ArrayList;

import java.util.ArrayList;

public class Ex1_ArrayList {
	public static void main(String[] args) {
//		ArrayList : index 제한없이 값을 추가하거나 제거하는 용도의 클래스
//		중복된 값을 무시하지 않고 추가
//		index번호를 가지고 있다.
		
//		배열과 비슷하지만 배열은 크기가 정해져 있는 반면 List 구조는 size가 늘었다가 주는 등 유동적인 것이 특징
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(100);
		list.add(100);
		list.add(20);
		
//		list의 크기
		System.out.println(list.size());
		
		System.out.println(list);
		
//		list에서 하나의 값 꺼내오기
		int res = list.get(2);
		System.out.println(res);
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
//		개선(향상)된 for문 (반복가능 객체. list 배열, 문자열, 무자집합 등)
//		배열, list와 같은 순차적 index구조로 자동 접근하여 내용을 출력하는 것이 간편해진다
//		단, index로 직접적인 접근이 불가능하기 때문에 수정, 삭제가 불가능하다
		for(int i : list) {
			System.out.println(i);
		}
		
		
		
		
		
		
	}//main

}

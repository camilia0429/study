package Ex3_set;

import java.util.HashSet;
import java.util.Random;

public class Ex1_HashSet {
	public static void main(String[] args) {
//		컬렉션(collection) : java.util 패키지의 인터페이스 (상수+추상메서드)
//		배열의 단점을 보완하여 index개수가 정해져있지 않은 다수의 객체를 다루기 위해 사용하는 프로그래밍 방식
		
//		Set, Map, List
//		
//		Set인터페이스를 구현한 자식 클래스
//		HashSet, TreeSet
		
		HashSet<String> hs1 = new HashSet<String>();
		
//		HashSet에 데이터를 추가하는 법
		hs1.add("a");
		hs1.add("b");
		hs1.add("f");
		hs1.add("d");

		
//		HashSet에는 중복된 데이터를 추가할 수 없다.
		hs1.add("a");
		hs1.add("b");
		
//		HashSet의 크기 측정
		int res = hs1.size();
		System.out.println("set의 크기 : "+ res);
		

		
//		HashSet에 저장되어 있는 데이터 제거하기
//		지운 후 액션에 따라 리무브와 클리어 사용하는 것이 달라질수도
		hs1.remove("a"); // 지우고 boolean값 변환		
//		hs1.removeAll(hs1) // 모든 내용 제거
//		hs1.clear(); // 지우고 변환값 없음
		
//		*index번호 없음*
		
		System.out.println(hs1);
		
//		HashSet은 중복되는 값이 들어가지 않기 때문에 난수를 생성해서 넣기가 편하다
		
//		로또번호 생성기 set에 중복이 되지 않는 6개의 값 넣기
		HashSet<Integer> hs2 = new HashSet<Integer>();
				

		while(hs2.size() != 6) {
			int rnd = new Random().nextInt(45)+1;
			hs2.add(rnd);
		}
		System.out.println(hs2);
		
		
		
//		배열 - > 해쉬셋으로 옮겨 중복값 제거하기
		int arr[] = {1,1,2,2,3,3,4,4,5,5,6,6};
		HashSet<Integer> hs3 = new HashSet<Integer>();
		for(int i = 0; i < arr.length; i++) {
			hs3.add(arr[i]);
		}
		
//		해쉬셋 -> 다시 배열로 바꾸기
//		new Integer[0] : set이 add해둔 요소의 개수만큼 자동으로 배열의 index가 생성된다
		Integer [] arr2 = hs3.toArray(new Integer[0]);
		for(int i = 0; i<arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
		
		
		
		
		
		
		
	}//main

}

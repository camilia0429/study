package Calculator;

import java.util.ArrayList;

public class Calculator5 {
	public static void main(String[] args) {
//		컬렉션 프레임워크(List,Set,Map)과 함수형 인터페이스
		ArrayList<String> list = new ArrayList<String>();
		list.add("이름1");
		list.add("이름2");
		list.add("이름3");
		list.add("이름4");
		list.add("이름5");
		list.add("이름6");
		list.add("이름7");
		
//		향상된 for문 사용
		for(String name : list) {
			System.out.println(name);
		}
		
		System.out.println("------------");
		
		list.forEach(x -> System.out.println(x));
		System.out.println("------------");
		list.forEach(System.out::println);

		
		
		
		
		
		
	}//main

}

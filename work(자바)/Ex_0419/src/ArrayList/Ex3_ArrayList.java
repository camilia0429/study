package ArrayList;

import java.util.ArrayList;

public class Ex3_ArrayList {
	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();
		
		Person p1 = new Person();
		p1.name = "홍길동";
		p1.age = 30;
		
		Person p2 = new Person();
		p2.name = "김길동";
		p2.age = 34;
		
		list.add(p1); //index : 0
		list.add(p2); //index : 1
		
		
		System.out.println(list.get(0).name); // list.get(0) == p1
		
//		ArrayList의 가장 큰 장점 : 객체를 저장 가능하며 가장 많이 활용되는 이유
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).name);
			System.out.println(list.get(i).age);
		}
		
		
		
		
	}//main

	
}

package ArrayList;

import java.util.ArrayList;

public class Ex3_ArrayList {
	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();
		
		Person p1 = new Person();
		p1.name = "ȫ�浿";
		p1.age = 30;
		
		Person p2 = new Person();
		p2.name = "��浿";
		p2.age = 34;
		
		list.add(p1); //index : 0
		list.add(p2); //index : 1
		
		
		System.out.println(list.get(0).name); // list.get(0) == p1
		
//		ArrayList�� ���� ū ���� : ��ü�� ���� �����ϸ� ���� ���� Ȱ��Ǵ� ����
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).name);
			System.out.println(list.get(i).age);
		}
		
		
		
		
	}//main

	
}

package Ex2_Function;

import java.util.HashMap;

public class Ex2_Function {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("id1", "�̸�1");
		map.put("id2", "�̸�2");
		map.put("id3", "�̸�3");
		map.put("id4", "�̸�4");
		map.put("id5", "�̸�5");
		
		
//		compute() : Map�� ����ִ� Value���� ������ �� ���
		map.forEach((key,value) -> {
			map.compute(key, (k,v)->v+"**");
		});
		
		map.forEach((key,value)->{
			System.out.printf("key = %s, value=%s\n",key,value);
		});
		
		
		
		
		
		
	}//main

}

package Ex2_Function;

import java.util.HashMap;

public class Ex2_Function {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("id1", "이름1");
		map.put("id2", "이름2");
		map.put("id3", "이름3");
		map.put("id4", "이름4");
		map.put("id5", "이름5");
		
		
//		compute() : Map에 들어있는 Value값을 수정할 때 사용
		map.forEach((key,value) -> {
			map.compute(key, (k,v)->v+"**");
		});
		
		map.forEach((key,value)->{
			System.out.printf("key = %s, value=%s\n",key,value);
		});
		
		
		
		
		
		
	}//main

}

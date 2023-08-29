package Map;

import java.util.HashMap;

public class MapEx2 {
	public static void main(String[] args) {
		
		HashMap<String, Float> map = new HashMap<>();
		map.put("k1", 100.0f);
		map.put("k2", 3.14f);
		map.put("k3", 4.15f);
		
		if(map.containsKey("k3")) {
			System.out.println("k3라는 Key가 존재합니다");
		}
		
		if(map.containsValue(3.14f)) {
			System.out.println("3.14값을 가지고 있습니다");
		}
		
		
		
		
	}//main

}

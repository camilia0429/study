package Map;

import java.util.HashMap;
import java.util.Scanner;

public class MapEx3 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("Kim", 1111);
		map.put("Lee", 2222);
		map.put("Park", 3333);
		
//		키보드에서 id와 pw를 입력받는다
//		id : aaa
//		pw : 1111
//		아이디가 존재하지 않습니다
		
//		id : Lee
//		pw : 3333
//		비밀번호 불일치
		
//		id : Park
//		pw : 3333
//		로그인 성공
		 
		Scanner sc = new Scanner(System.in);
		System.out.print("ID : ");
		String n1 = sc.next();
		System.out.print("PW : ");
		int n2 = sc.nextInt();
		
		if(!map.containsKey(n1)) {
			System.out.println("아이디가 존재하지 않습니다");
		} else {
			if(map.get(n1) != n2) {
				System.out.println("비밀번호 불일치");
			}else {
				System.out.println("로그인성공!");
			}
		}
		
		
		
		
		
		
		
//		if(map.containsKey(n1)) {
//			if(map.containsValue(n2)) {
//				System.out.println("로그인 성공");
//			}else{
//				System.out.println("비밀번호 불일치");
//			}
//		} else {
//			System.out.println("아이디가 존재하지 않습니다");
//		}
		
		
		
		
		
	}//main

}

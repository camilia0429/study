package Work;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex1_work {
	public static void main(String[] args) {
//		아이디 생성 : abc
//		abc
//		아이디 생성 : abc2
//		abc abc2
//		아이디 생성 : abc3
//		abc abc2 abc3
		
//		아이디 생성 : ...
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> list = new ArrayList<String>();
		
		
	
		while(true) {
			System.out.print("아이디 생성 : ");
			String id = sc.next();
			
			if(list.contains(id)) {
				System.out.println("중복된 아이디 입니다");
				continue;
			}
			
			list.add(id);
			
			for(String i : list) {
				System.out.println(i);
			}
		}
		
		
//		바로 위 코드에서 중복된 아이디를 검사하는 로직 추가하기
//		중복된 아이디
		
		
		
//		while(true) {
//			System.out.print("아이디 생성 : ");
//			String id = sc.next();
//			
//			for(int i = 0; i<list.size(); i++) {
//				if(id.equals(list.get(i))) {
//					System.out.println("중복된 아이디 입니다");
//					continue outer;
//				}
//			
//			list.add(id);
//			
//			for(String i : list) {
//				System.out.println(i);
//			}
//		}
//		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main

}

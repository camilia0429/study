package Work;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

public class UserMain {
	public static void main(String[] args) {
//		유저의 아이디와 패스워드를 담을 수 있는 UserInfo클래스를 만들고
//		main 클래스에서 유저의 아이디와 비밀번호를 키보드에서 입력받아 객체에 저장하고
//		ArrayList에 추가하여 출력하기
		
//		--결과--
//		아이디생성 : aaa
//		패스워드 생성 : 1234
//		aaa
//		1234
//		------------
//		아이디생성 : bbb
//		패스워드 생성 : 5678
//		bbb
//		5678
//		------------
		
		Scanner sc = new Scanner(System.in);
		ArrayList<UserInfo> list = new ArrayList<UserInfo>();
		
		while(true) {
			UserInfo ui = new UserInfo();
		System.out.print("아이디 생성 : ");
		ui.setId(sc.next());
		
		for(int i = 0; i<list.size(); i++) {
			if(ui.getId().equals(list.get(i))) {
				System.out.println("중복");
				continue outer;
			}
		}
		
		System.out.println("비밀번호 생성 : ");
		ui.setPw(sc.next());
		
		list.add(ui);
		
		for(UserInfo ui2:list) {
			System.out.println(ui2.getId());
			System.out.println(ui2.getPw());
			System.out.println("----------");
		}
		
		
		
	}
		
		
		
		
	}//main

}

package Work;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

public class UserMain {
	public static void main(String[] args) {
//		������ ���̵�� �н����带 ���� �� �ִ� UserInfoŬ������ �����
//		main Ŭ�������� ������ ���̵�� ��й�ȣ�� Ű���忡�� �Է¹޾� ��ü�� �����ϰ�
//		ArrayList�� �߰��Ͽ� ����ϱ�
		
//		--���--
//		���̵���� : aaa
//		�н����� ���� : 1234
//		aaa
//		1234
//		------------
//		���̵���� : bbb
//		�н����� ���� : 5678
//		bbb
//		5678
//		------------
		
		Scanner sc = new Scanner(System.in);
		ArrayList<UserInfo> list = new ArrayList<UserInfo>();
		
		while(true) {
			UserInfo ui = new UserInfo();
		System.out.print("���̵� ���� : ");
		ui.setId(sc.next());
		
		for(int i = 0; i<list.size(); i++) {
			if(ui.getId().equals(list.get(i))) {
				System.out.println("�ߺ�");
				continue outer;
			}
		}
		
		System.out.println("��й�ȣ ���� : ");
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

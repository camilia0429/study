package Work;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex1_work {
	public static void main(String[] args) {
//		���̵� ���� : abc
//		abc
//		���̵� ���� : abc2
//		abc abc2
//		���̵� ���� : abc3
//		abc abc2 abc3
		
//		���̵� ���� : ...
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> list = new ArrayList<String>();
		
		
	
		while(true) {
			System.out.print("���̵� ���� : ");
			String id = sc.next();
			
			if(list.contains(id)) {
				System.out.println("�ߺ��� ���̵� �Դϴ�");
				continue;
			}
			
			list.add(id);
			
			for(String i : list) {
				System.out.println(i);
			}
		}
		
		
//		�ٷ� �� �ڵ忡�� �ߺ��� ���̵� �˻��ϴ� ���� �߰��ϱ�
//		�ߺ��� ���̵�
		
		
		
//		while(true) {
//			System.out.print("���̵� ���� : ");
//			String id = sc.next();
//			
//			for(int i = 0; i<list.size(); i++) {
//				if(id.equals(list.get(i))) {
//					System.out.println("�ߺ��� ���̵� �Դϴ�");
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

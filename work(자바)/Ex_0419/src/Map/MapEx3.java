package Map;

import java.util.HashMap;
import java.util.Scanner;

public class MapEx3 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("Kim", 1111);
		map.put("Lee", 2222);
		map.put("Park", 3333);
		
//		Ű���忡�� id�� pw�� �Է¹޴´�
//		id : aaa
//		pw : 1111
//		���̵� �������� �ʽ��ϴ�
		
//		id : Lee
//		pw : 3333
//		��й�ȣ ����ġ
		
//		id : Park
//		pw : 3333
//		�α��� ����
		 
		Scanner sc = new Scanner(System.in);
		System.out.print("ID : ");
		String n1 = sc.next();
		System.out.print("PW : ");
		int n2 = sc.nextInt();
		
		if(!map.containsKey(n1)) {
			System.out.println("���̵� �������� �ʽ��ϴ�");
		} else {
			if(map.get(n1) != n2) {
				System.out.println("��й�ȣ ����ġ");
			}else {
				System.out.println("�α��μ���!");
			}
		}
		
		
		
		
		
		
		
//		if(map.containsKey(n1)) {
//			if(map.containsValue(n2)) {
//				System.out.println("�α��� ����");
//			}else{
//				System.out.println("��й�ȣ ����ġ");
//			}
//		} else {
//			System.out.println("���̵� �������� �ʽ��ϴ�");
//		}
		
		
		
		
		
	}//main

}

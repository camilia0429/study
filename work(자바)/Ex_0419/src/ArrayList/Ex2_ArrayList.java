package ArrayList;

import java.util.ArrayList;

public class Ex2_ArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10); //index : 0
		list.add(10); //index : 1
		list.add(1, 20); //index 1�� ������ �߰�, ���ȣ�� �и���.
		list.set(2, 20); //index 2�� ���� �����ͷ� ����
		list.add(55);
		list.remove(1);//�߰� index�� �����Ǹ� ���� �ε������� �������
		System.out.println(list.isEmpty()); // ��������� true, �ƴϸ� false��ȯ
		
		System.out.println(list.indexOf(55)); // Value���� �ε��� ��ȣ�� ��ȯ�ϴ� �޼���
		
		System.out.println(list);
		
		
		
		
		
		
	}//main

}

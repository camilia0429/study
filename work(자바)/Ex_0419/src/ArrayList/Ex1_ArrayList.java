package ArrayList;

import java.util.ArrayList;

public class Ex1_ArrayList {
	public static void main(String[] args) {
//		ArrayList : index ���Ѿ��� ���� �߰��ϰų� �����ϴ� �뵵�� Ŭ����
//		�ߺ��� ���� �������� �ʰ� �߰�
//		index��ȣ�� ������ �ִ�.
		
//		�迭�� ��������� �迭�� ũ�Ⱑ ������ �ִ� �ݸ� List ������ size�� �þ��ٰ� �ִ� �� �������� ���� Ư¡
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(100);
		list.add(100);
		list.add(20);
		
//		list�� ũ��
		System.out.println(list.size());
		
		System.out.println(list);
		
//		list���� �ϳ��� �� ��������
		int res = list.get(2);
		System.out.println(res);
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
//		����(���)�� for�� (�ݺ����� ��ü. list �迭, ���ڿ�, �������� ��)
//		�迭, list�� ���� ������ index������ �ڵ� �����Ͽ� ������ ����ϴ� ���� ����������
//		��, index�� �������� ������ �Ұ����ϱ� ������ ����, ������ �Ұ����ϴ�
		for(int i : list) {
			System.out.println(i);
		}
		
		
		
		
		
		
	}//main

}

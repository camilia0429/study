package Ex3_set;

import java.util.Iterator;
import java.util.TreeSet;

public class Ex2_TreeSet {
	public static void main(String[] args) {
		
//		TreeSet�� ����Ž��Ʈ�� �� ������ ����Ų ���� -> �� Ʈ���� �����Ǿ� �ִ�
//		����-�� Ʈ���� �θ� ��庸�� ���� ���� ������ ���� ���� �ڽ����� ū���� ������ ���� ������ ������ 
//		��ġ�Ͽ� �������� �߰��� ���� �� Ʈ���� �������� ġ��ġ�� �ʵ��� ������ ���� �ش�
		
		TreeSet<Integer> set1 = new TreeSet<Integer>();
//		TreeSet<Integer> set1 = new TreeSet<>();
//		TreeSet<Integer> set2 = new TreeSet<Integer>(set1); set1�� ��� ��Ҹ� ���� TreeSet ����
		
//		TreeSet�� �� �߰��ϱ�
		set1.add(7);
		set1.add(4);
		set1.add(9);
		set1.add(1);
		set1.add(5);
		
		set1.add(7); //-> ���� �ߺ� X
		
		System.out.println(set1); // ��ü ���
		System.out.println(set1.first()); // �ּҰ� ���
		System.out.println(set1.last()); // �ִ밪 ���
		System.out.println(set1.higher(3));//�Է°����� ū ������ �߿��� �ּҰ�. ������ null ��ȯ
		System.out.println(set1.lower(3)); //�Է°����� ���� ������ �߿��� �ִ밪. ������ null ��ȯ
		
//		�ݺ���(iterator)�� �̿��� ���
		Iterator iter = set1.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		
	}//main

}

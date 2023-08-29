package Ex3_set;

import java.util.HashSet;
import java.util.Random;

public class Ex1_HashSet {
	public static void main(String[] args) {
//		�÷���(collection) : java.util ��Ű���� �������̽� (���+�߻�޼���)
//		�迭�� ������ �����Ͽ� index������ ���������� ���� �ټ��� ��ü�� �ٷ�� ���� ����ϴ� ���α׷��� ���
		
//		Set, Map, List
//		
//		Set�������̽��� ������ �ڽ� Ŭ����
//		HashSet, TreeSet
		
		HashSet<String> hs1 = new HashSet<String>();
		
//		HashSet�� �����͸� �߰��ϴ� ��
		hs1.add("a");
		hs1.add("b");
		hs1.add("f");
		hs1.add("d");

		
//		HashSet���� �ߺ��� �����͸� �߰��� �� ����.
		hs1.add("a");
		hs1.add("b");
		
//		HashSet�� ũ�� ����
		int res = hs1.size();
		System.out.println("set�� ũ�� : "+ res);
		

		
//		HashSet�� ����Ǿ� �ִ� ������ �����ϱ�
//		���� �� �׼ǿ� ���� ������� Ŭ���� ����ϴ� ���� �޶�������
		hs1.remove("a"); // ����� boolean�� ��ȯ		
//		hs1.removeAll(hs1) // ��� ���� ����
//		hs1.clear(); // ����� ��ȯ�� ����
		
//		*index��ȣ ����*
		
		System.out.println(hs1);
		
//		HashSet�� �ߺ��Ǵ� ���� ���� �ʱ� ������ ������ �����ؼ� �ֱⰡ ���ϴ�
		
//		�ζǹ�ȣ ������ set�� �ߺ��� ���� �ʴ� 6���� �� �ֱ�
		HashSet<Integer> hs2 = new HashSet<Integer>();
				

		while(hs2.size() != 6) {
			int rnd = new Random().nextInt(45)+1;
			hs2.add(rnd);
		}
		System.out.println(hs2);
		
		
		
//		�迭 - > �ؽ������� �Ű� �ߺ��� �����ϱ�
		int arr[] = {1,1,2,2,3,3,4,4,5,5,6,6};
		HashSet<Integer> hs3 = new HashSet<Integer>();
		for(int i = 0; i < arr.length; i++) {
			hs3.add(arr[i]);
		}
		
//		�ؽ��� -> �ٽ� �迭�� �ٲٱ�
//		new Integer[0] : set�� add�ص� ����� ������ŭ �ڵ����� �迭�� index�� �����ȴ�
		Integer [] arr2 = hs3.toArray(new Integer[0]);
		for(int i = 0; i<arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
		
		
		
		
		
		
		
	}//main

}

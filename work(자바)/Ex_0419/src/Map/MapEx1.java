package Map;

import java.util.HashMap;

public class MapEx1 {
	public static void main(String[] args) {
//		Map�� ������ Ű(Key)�� ��(Value)�� �ϳ��� �����ͷ� ����
//		Map������ Key�� ���ؼ� Value�� �˻��س��Ƿ� ���� ���� �����͸�
//		��ȸ�ϴµ� �־� �ſ� �پ ������ ����
		
//		Map�� �����ϰ� �ִ� �ڽ� Ŭ���� �� ���� ���� ����ϴ� Ŭ������ HashMap�̴�.
		HashMap<Integer, Character> map = new HashMap<Integer, Character>();
		
//		HashMap�� ������ �߰��ϱ�
		map.put(1, 'A');
		map.put(2, 'B');
		map.put(3, 'C');
		
//		map�� ����Ǵ� Value���� �ߺ��� �� �� �ִ�.
		map.put(4, 'A');
//		map�� Key���� �ߺ��� �� �� ����.
		map.put(1, 'F'); // �̹� �����ϴ� Key���� �ִٸ� Value�� �����Ѵ�
		
//		map���� ������ �����ϱ�
		map.remove(3);
		
//		map���� value�� �Ѱ� ��������
		System.out.println(map.get(1));
		
//		map�� ũ��
		System.out.println(map.size());
		
		System.out.println(map);
		
		
	}//main

}

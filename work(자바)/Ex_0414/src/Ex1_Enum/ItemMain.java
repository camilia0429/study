package Ex1_Enum;

public class ItemMain {
	public static void main(String[] args) {
		
//		Item item = new Item(); -> �������� �����ڸ� �ܺο��� ȣ���ϴ� ���� �Ұ���!
		
//		for���� �̿��Ͽ� �������� ��ü ���� ����ϱ�
		
		Item[] items = Item.values();
		
//		���� for��. �迭�� ��밡��. �߰��� ���߰ų� ����, ������ �Ұ����ϴ�
		for(Item item : items) {
			System.out.printf("%s,%d\n",item.getItemStr(),item.getsign());
		}
		

		

		
		
		
	}//main

}

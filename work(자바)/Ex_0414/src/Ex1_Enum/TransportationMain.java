package Ex1_Enum;

public class TransportationMain {
	public static void main(String[] args) {
//		values() : ������ ����ȿ� ����ִ� ������� enumŸ���� �迭�� ��ȯ
		
		Transportation[] trans = Transportation.values();
		
		for (int i = 0; i < trans.length; i++) {
			System.out.printf("name : %s, 100km - fare : %d\n",trans[i].name(),trans[i].totalFare(100));
		}
		
		
		
		
		
	}//main

}

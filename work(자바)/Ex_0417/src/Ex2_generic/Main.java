package Ex2_generic;

public class Main {
	public static void main(String[] args) {
//		MainŬ������ ����� Integer[], Double[], Character[]�� �����
//		GenŬ������ prinArr�޼��带 ���� ȣ���Ͽ� �迭�� ������ ����ϵ��� �غ���
		
		
		Integer[] iArr = {1,2,3,4,5};
		Double[] dArr = {1.1,2.2,3.3,4.4,5.5};
		Character[] cArr = {'A','B','C','D','E'};
		
		Gen<> g1 = new Gen();
		g1.printArr(iArr);
		g1.printArr(cArr);
		g1.printArr(dArr);
		
		
		
		
		
	}//main

}

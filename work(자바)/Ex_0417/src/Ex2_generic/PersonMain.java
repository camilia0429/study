package Ex2_generic;

public class PersonMain {
	public static void main(String[] args) {
		Person<String, Integer> p1 = new Person<String, Integer>("ȫ�浿", 30);
		Person<String, Integer> p2 = new Person<>("�̻���", 28);
		
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		System.out.println("--------------------");
		System.out.println(p2.getName());
		System.out.println(p2.getAge());
		
//		GenŬ������ ����� ���׸�Ÿ��<T>�� ���� printArr�޼��带 �������
//		printArr�޼��� ���ο��� �迭�� ���������� ����ϴ� �ڵ� �ۼ�
		
//		MainŬ������ ����� Integer[], Double[], Character[]�� �����
//		GenŬ������ prinArr�޼��带 ���� ȣ���Ͽ� �迭�� ������ ����ϵ��� �غ���
		
//		���
//		1,2,3,4,5 //integer
//		1.1,2.2,3.3,4.4,5.5 double�迭 ���
//		A B C D E //Character�迭 ���
		
		
	}//main

}

package Ex1_inheritance;

public class ExtendsMain {
	public static void main(String[] args) {
		
//		Child Ŭ������ Parent Ŭ������ ��ӹ��� �����̹Ƿ�
//		�θ�κ��� ��ӹ��� money, str ���� ������ ������� ������ ����� �� �ִ�.
		
		Child c1 = new Child();
		System.out.println(c1.car);
		System.out.println(c1.money);
		System.out.println(c1.str);
		
		System.out.println("-------------------");
		
		Parent p1 = new Parent();
		System.out.println(p1.money);
		System.out.println(p1.str);
		
//		��� ����� ������ �θ� Ŭ������ �ڽ��� ����� ������� ������ ����� �� ����.
//		System.out.println(p1.car); <= ���X
		
		
//		c1�� Parent�� ��Ӱ�����
//		instanceof Ű���带 ���� true���� ���� �� �ִ�.
		if(c1 instanceof Parent) {
			System.out.println("c1�� Parent�� �ڽ�!!");
		}
		
		
//		����� Ư¡
//		1. �Ѹ��� �ڳడ �θ��� �θ� ���°� �Ұ����ϴ�.
//		2. ���� � ��Ȳ�� �Ƶ� ��Ӱ����� ����⿡�� Object Ŭ������ �ִ�.
//		Object�� ��� Ÿ���� �޾� ���� �� �ִ� �ֻ��� ��ü.
//		3. �Ѹ��� �θ�� �������� �ڽ��� ���� �� �ִ�.
		
		
		
		
	}//main

}

package Ex6_Static;

public class Bank {
	
//	������ static���� ����Ǹ� ��ü�� �������� �ʰ� ����� �� �ִ�.
//	static������ ������ ��ü�� �ƹ��� ���� �����Ѵٰ� ������
//	static������ �޸𸮿� ���� �ѹ��� ���������.
	
	private String name = "�츮����";
	private String point; // ����
	private String tel; // ��ȭ��ȣ
	static float interst = 10f; //������
	
	public Bank(String point,String tel) {
		this.point = point;
		this.tel = tel;
	}
	
	
	
//	getter ������ �ϴ� �޼���
	public void printBank() {
		System.out.println("�̸� : "+name);
		System.out.println("��ġ : "+point);
		System.out.println("��ȭ��ȣ :"+tel);
		System.out.println("������ :"+interst+"%");
		System.out.println("===================");
	}
	

}

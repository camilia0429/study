package Ex2_Bread;

public class BreadMain {
//	Bread Ŭ������ ����� ���� �ٸ� ����� �ϴ� makeBread() �޼��带 ���� �����
//	BreadMainŬ�������� ������ �޼��带 ȣ������ ���� ����� ����
//	������ �����غ�����
	
//	���� ��������ϴ�. -> ù��° makeBread()�޼��� ȣ��
	
//	���� ��������ϴ�.
//	���� ��������ϴ�.
//	...
//	���� ��������ϴ�.
//	��û�Ͻ� n���� ���� ��������ϴ�. -> �ι�° makeBread()�޼��� ���
	
//	00���� ��������ϴ�.
//	00���� ��������ϴ�.
//	...
//	00���� ��������ϴ�.
//	��û�Ͻ� n���� 00���� ��������ϴ�. -> ����° makeBread() �޼��� ���
	
	public static void main(String[] args) {
		makeBread mb = new makeBread();
		mb.result();
		mb.result(5);
		mb.result(3, "ȣ��");
		
	}//main
}

package Ex4_Super;

public class Child extends Parent {
	
	public Child() {
		super(1); // �θ� Ŭ������ �����ڰ� �Ķ���͸� ������
				  // ������ �� ����.
		System.out.println("�ڽ�(Child)Ŭ����");
	}
	
	@Override
	public int result() {
		return super.result();
	}

}

package Ex4_Unit;

abstract public class Unit {
	
	String name; //�̸�
	int energy; //ü��
	
//	ĳ���Ͱ� ������ ������ �� ü�� ���ҷ��� �����ϱ� ���� �޼���
//	ĳ���͸��� ü�� ���ҷ��� �ٸ��� ������ �߻�޼���� ����
	abstract public void decEnergy();
	
	public int getEnergy() {
		return energy;
	}
	
	
	
	
	
	

}

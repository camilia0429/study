package Ex1_Enum;

public enum Item {
	START("����",0),STOP("����",1),EXIT("����",2);
	
	String ItemStr;
	int sign;
	
//	�ϴ� �����ڴ� enumŬ�������� �� ����.
//	�ܺο��� ȣ���� �� ���� �����̺����� �������
	private Item(String str, int sign) {
		this.ItemStr = str;
		this.sign = sign;
	}
	
	public String getItemStr() {
		return ItemStr;
	}
	public int getsign() {
		return sign;
	}

}

package Ex6_interface;

public class Kitchen implements Menu1 {
//	Menu1�� Menu2,3�� ��ӹ޾ұ� ������ Menu1�� �����ص� O
	
	
	@Override
	public String boggembab() {
		return "���+����+��";
	}
	@Override
	public String tangsuyuck() {
		return "�������+���+����";
	}
	
	@Override
	public String jajang() {
		return "�߸�+����+�ϵ���";
	}
	
	@Override
		public String jambbong() {
			return "�߸�+ȫ��+û��ä";
		}
	

}

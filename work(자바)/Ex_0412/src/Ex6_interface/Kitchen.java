package Ex6_interface;

public class Kitchen implements Menu1 {
//	Menu1이 Menu2,3을 상속받았기 때문에 Menu1만 기입해도 O
	
	
	@Override
	public String boggembab() {
		return "계란+춘장+쌀";
	}
	@Override
	public String tangsuyuck() {
		return "돼지고기+양념+양파";
	}
	
	@Override
	public String jajang() {
		return "중면+춘장+완두콩";
	}
	
	@Override
		public String jambbong() {
			return "중면+홍합+청경채";
		}
	

}

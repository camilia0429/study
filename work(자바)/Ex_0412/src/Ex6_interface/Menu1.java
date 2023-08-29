package Ex6_interface;

public interface Menu1 extends Menu2, Menu3 {
//	인터페이스는 인터페이스끼리 상속이 가능
//	인터페이스는 구현능력이 없기 때문에 다중 상속이 가능
		
	abstract public String jajang();
	
	abstract public String jambbong();

}

package Ex4_Unit;

abstract public class Unit {
	
	String name; //이름
	int energy; //체력
	
//	캐릭터가 공격을 당했을 때 체력 감소량을 관리하기 위한 메서드
//	캐릭터마다 체력 감소량이 다르기 때문에 추상메서드로 정의
	abstract public void decEnergy();
	
	public int getEnergy() {
		return energy;
	}
	
	
	
	
	
	

}

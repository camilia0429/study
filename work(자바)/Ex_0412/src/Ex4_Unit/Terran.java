package Ex4_Unit;

public class Terran extends Unit {
	
//	���Ƶ�� true, �ƴϸ� false
	boolean fly;
	
	public Terran(String name, int energy, boolean fly) {
		super.name = name;
		super.energy = energy;
		this.fly = fly;
	}
	
	
	
	
	
	@Override
	public void decEnergy() {
		energy -= 3;
	}
	
	

}

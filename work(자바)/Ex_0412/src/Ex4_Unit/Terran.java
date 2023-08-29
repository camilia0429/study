package Ex4_Unit;

public class Terran extends Unit {
	
//	날아디면 true, 아니면 false
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

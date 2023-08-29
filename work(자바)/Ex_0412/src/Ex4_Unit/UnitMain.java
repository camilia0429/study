package Ex4_Unit;

public class UnitMain {
	public static void main(String[] args) {
		Terran t1 = new Terran("해병",100,false);
		t1.decEnergy(); //한번 공격당함
		System.out.println("해병의 에너지 : "+t1.getEnergy());
		
		Protoss p1 = new Protoss("광전사",150,false);
		p1.decEnergy();
		p1.decEnergy();
		p1.decEnergy();
		System.out.println("광전사의 에너지 : "+p1.getEnergy());
		
		Zerg z1 = new Zerg("무리군주",200,true);
		z1.decEnergy();
		z1.decEnergy();
		System.out.println("무리군주의 에너지 : "+z1.getEnergy());
		
		
		
//		추상화와 유사
//		클래스가 가지고 있는 변수, 일반적인 함수, 추상메서드를 가지고 있지만
//		인터페이스는 추상메서드와 상수만 가질 수 있다
//		중계자같은 역할
		
		
		
		
		
		
	}//main

}

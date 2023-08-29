package Ex1_Enum;

public enum Transportation {
	BUS(100){
		@Override
		int totalFare(int distance) {
			return distance = fare;
		}
	}
	,TRAIN(150){
		@Override
		int totalFare(int distance) {
			return distance = fare;
		}
	}
	,SHIP(200){
		@Override
		int totalFare(int distance) {
			return distance = fare;
		}
	}
	,AIRPLANE(250){
		@Override
		int totalFare(int distance) {
			return distance = fare;
		}
	};
	
	int fare;
	
	Transportation(int fare){
		this.fare = fare;
	}
	
//	class에서 
//	public static final int Transportation BUS = new Transportation(100);
//	위 내용과 같은 내용
	
	abstract int totalFare(int distance);
	
	
	
	
	
	
	

}

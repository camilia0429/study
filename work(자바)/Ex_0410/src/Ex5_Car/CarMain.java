package Ex5_Car;

public class CarMain {
	public static void main(String[] args) {
//		Car클래스를 생성하고 gasGauge라는 변수를 갖고 있다.
//		생성자를 통해 외부에서 잔여가스량을 받는다.
//		잔여량을 출력하는 메서드인 showCurrentGauge()를 갖고 있다.
		
//		HybridCar 클래스는 electricGauge변수를 갖고 있고, car클래스를 상속 받고
//		생성자를 통해 통해 gasGauge와 electricGauge를 받는다.
//		메서드는 오버라이딩 하여 잔여 가스량과 전기량을 출력
		
//		HybridWaterCar 클래스는 waterGauge변수를 갖고 있고, Hybridcar클래스를 상속 받고
//		생성자를 통해 통해 gasGauge와 electricGauge와 waterGauge를 받는다.
//		메서드는 오버라이딩 하여 잔여 가스량과 전기량과 물의 양을 출력
		
//		main에서 HybridWaterCar 객체를 생성하여 잔여량을 출력해보자.
//		잔여가스량 : 15
//		잔여전기량 : 30
//		잔여물의양 : 25
		
		HybridWaterCar hwc = new HybridWaterCar(15,30,25);
		hwc.showCurrentGauge();
		
		
		
		
	}//main

}

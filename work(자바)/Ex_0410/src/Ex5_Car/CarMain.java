package Ex5_Car;

public class CarMain {
	public static void main(String[] args) {
//		CarŬ������ �����ϰ� gasGauge��� ������ ���� �ִ�.
//		�����ڸ� ���� �ܺο��� �ܿ��������� �޴´�.
//		�ܿ����� ����ϴ� �޼����� showCurrentGauge()�� ���� �ִ�.
		
//		HybridCar Ŭ������ electricGauge������ ���� �ְ�, carŬ������ ��� �ް�
//		�����ڸ� ���� ���� gasGauge�� electricGauge�� �޴´�.
//		�޼���� �������̵� �Ͽ� �ܿ� �������� ���ⷮ�� ���
		
//		HybridWaterCar Ŭ������ waterGauge������ ���� �ְ�, HybridcarŬ������ ��� �ް�
//		�����ڸ� ���� ���� gasGauge�� electricGauge�� waterGauge�� �޴´�.
//		�޼���� �������̵� �Ͽ� �ܿ� �������� ���ⷮ�� ���� ���� ���
		
//		main���� HybridWaterCar ��ü�� �����Ͽ� �ܿ����� ����غ���.
//		�ܿ������� : 15
//		�ܿ����ⷮ : 30
//		�ܿ����Ǿ� : 25
		
		HybridWaterCar hwc = new HybridWaterCar(15,30,25);
		hwc.showCurrentGauge();
		
		
		
		
	}//main

}

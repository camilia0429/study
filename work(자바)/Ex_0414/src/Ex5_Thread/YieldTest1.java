package Ex5_Thread;

public class YieldTest1 implements Runnable {
//	yield() :  자신의 시간을 양보하는 메서드. 
//	스레드가 작업을 수행하던 중 Yield()를 만나면 자신에게 할당된 시간을 다음 차례 스레드에게 양도 함
	
	
	
	
	@Override
	public void run() {
		for(int i = 0; i < 30; i++) {
			System.out.println("★"+i);
			Thread.yield();
		}
	}

}

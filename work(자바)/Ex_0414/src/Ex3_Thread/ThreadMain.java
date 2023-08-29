package Ex3_Thread;

public class ThreadMain {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start(); // run() 메서드를 호출하는 메서드
		
		MyThread2 mt2 = new MyThread2();
		Thread t = new Thread(mt2);
		t.start();
		
//		run()메서드를 사용할 경우 각각 독립적으로 실행하지 못한다
//		run()메서드의 내용을 별개로 수행하고 싶다면 start()메서드를 사용해야 한다
		
		for(int i = 0; i<10; i++) {
			System.out.println("메인함수 진행중 "+i);
		}
		
		
		
		
		
	}//main

}

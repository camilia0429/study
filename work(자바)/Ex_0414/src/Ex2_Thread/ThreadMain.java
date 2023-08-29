package Ex2_Thread;

public class ThreadMain {
	public static void main(String[] args) {
		//thread를 상속받은 경우
		ThreadTest tt = new ThreadTest();
		tt.start();
		
		//thread를 상속받지 않은 경우
		RunnableTest rt = new RunnableTest();
		Thread t1 = new Thread(rt);
		t1.start();
		
	}//main

}

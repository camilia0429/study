package Ex2_Thread;

public class ThreadMain {
	public static void main(String[] args) {
		//thread�� ��ӹ��� ���
		ThreadTest tt = new ThreadTest();
		tt.start();
		
		//thread�� ��ӹ��� ���� ���
		RunnableTest rt = new RunnableTest();
		Thread t1 = new Thread(rt);
		t1.start();
		
	}//main

}

package Ex3_Thread;

public class ThreadMain {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start(); // run() �޼��带 ȣ���ϴ� �޼���
		
		MyThread2 mt2 = new MyThread2();
		Thread t = new Thread(mt2);
		t.start();
		
//		run()�޼��带 ����� ��� ���� ���������� �������� ���Ѵ�
//		run()�޼����� ������ ������ �����ϰ� �ʹٸ� start()�޼��带 ����ؾ� �Ѵ�
		
		for(int i = 0; i<10; i++) {
			System.out.println("�����Լ� ������ "+i);
		}
		
		
		
		
		
	}//main

}

package Ex5_Thread;

public class SleepThread extends Thread {
//	sleep() : �����带 ������ �ð����� Blocked���·� �����.
//	�ð��� 1000���� 1�ʱ��� ������ �� ������,
//	������ �ð��� ������ ������� �ٽ� Runnable ���·� ���ư���.
	
	
	
	@Override
	public void run() {
		System.out.println("ī��Ʈ�ٿ� 5��");
		for(int i = 5; i > 0; i--) {
			if(i != 0) {
				try {
					Thread.sleep(1000);
					System.out.println(i);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		System.out.println("����!");
	}

}

package Ex5_Thread;

public class ThreadCount extends Thread {
	
	int n;
	
	public void getN(int n) {
		this.n = n;
	}
	
	
	@Override
	public void run() {
		System.out.printf("ī��Ʈ�ٿ� %d��\n",n);
		for(int i = n; i > 0; i--) {
			if(i != 0) {
				try {
					Thread.sleep(1000);
					System.out.println(i+"��");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		System.out.println("����!");
	}
	
	

}

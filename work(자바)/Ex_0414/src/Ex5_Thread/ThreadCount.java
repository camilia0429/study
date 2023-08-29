package Ex5_Thread;

public class ThreadCount extends Thread {
	
	int n;
	
	public void getN(int n) {
		this.n = n;
	}
	
	
	@Override
	public void run() {
		System.out.printf("카운트다운 %d초\n",n);
		for(int i = n; i > 0; i--) {
			if(i != 0) {
				try {
					Thread.sleep(1000);
					System.out.println(i+"초");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		System.out.println("종료!");
	}
	
	

}

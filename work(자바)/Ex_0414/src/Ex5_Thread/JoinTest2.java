package Ex5_Thread;

public class JoinTest2 implements Runnable {
	
	
	
	@Override
	public void run() {
		for(int i = 0; i < 19; i++) {
			System.out.println("t2 : "+i);
		}
		System.out.println("<<t2 ¿Ï·á>>");
	}

}

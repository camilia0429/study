package Ex1_Chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer extends Thread{
//	HTTP���, Socket���
//	HTTP(S) : Hyper Text(HTML) Transform Protocol(Secure)(HTMl��űԾ�)
//	HTTP����� Client�� ��û(Request)�� ���� ������ Server�� ����(Response)�Ͽ� �ش� ������ �����ϰ� ��ٷ� ������ ����
//	Client�� Request�� �ϴ� ��쿡�� Server�� Response �� �� �ִ� �ܹ��� ���
//	Server�� Client���� Request�� �� �� ����
	
//	Socket����� Server�� Client�� Ư�� Port�� ���� �ǽð����� ����� ����� �ϴ� ���
//	Server�� Client�� Port�� ���� ����Ǿ� �־�, �ǽð����� ����� ����� �� �� �ִ�
//	Streaming�̳� �ǽð� ä��, ���ӵ�� ���� �ﰢ������ ������ �ְ�޴� ��쿡 ���

//	Socket����� ��Ģ
//	1. ���� ��ٸ��� ���� Server��� �ϸ�, Server�� Port�� ���� Client�� ������ ��ٸ��ϴ�
//	2. ������ �ϴ� ���� Client��� �ϸ�, Server�� IP�� Port�� �����Ͽ� ����� ����˴ϴ�
//	3. Server�� Client���� ����� Send,Receive�� ���·� �ְ� �޽��ϴ�
//	4. ����� ������ Close()�� ������ �����ϴ�
//	5. Thread�� ������ ���
	
	ServerSocket ss;
	
	public MyServer() {
		try {
//			���������� �����ÿ� ���� ��Ʈ��ȣ�� ����.
//			��Ʈ�� Ŭ���̾�Ʈ�� ������ �� �ʿ�
			ss = new ServerSocket(3000); //�����غ�Ϸ�
			System.out.println("���� �غ� �Ϸ�!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
		public void run() {
//			���ѹݺ� �ӿ��� �����ڵ��� �׻� ���� �غ� �ؾ� �Ѵ�
			while(true) {
				try {
					Socket s = ss.accept();
					
//					������ ������ ��Ʈ�� ������ Ŭ���̾�Ʈ�� IP�ּҸ� �����´�
					String ip = s.getInetAddress().getHostAddress();
					System.out.println(ip+"�� �Դ� ��!");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	
	public static void main(String[] args) {
		MyServer ms = new MyServer();
		ms.start();
		
		
	}//main
	
	
	
	
	
	
	
}

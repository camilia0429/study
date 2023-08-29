package Ex1_Chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer extends Thread{
//	HTTP통신, Socket통신
//	HTTP(S) : Hyper Text(HTML) Transform Protocol(Secure)(HTMl통신규약)
//	HTTP통신은 Client의 요청(Request)이 있을 때에만 Server가 응답(Response)하여 해당 정보를 전송하고 곧바로 연결을 종료
//	Client가 Request를 하는 경우에만 Server가 Response 할 수 있는 단방향 통신
//	Server가 Client에게 Request를 할 수 없다
	
//	Socket통신은 Server와 Client가 특정 Port를 통해 실시간으로 양방향 통신을 하는 방식
//	Server와 Client가 Port를 통해 연결되어 있어, 실시간으로 양방향 통신을 할 수 있다
//	Streaming이나 실시간 채팅, 게임등과 같이 즉각적으로 정보를 주고받는 경우에 사용

//	Socket통신의 규칙
//	1. 먼저 기다리는 측을 Server라고 하며, Server는 Port를 열고 Client의 접속을 기다립니다
//	2. 접속을 하는 측을 Client라고 하며, Server의 IP와 Port에 접속하여 통신이 연결됩니다
//	3. Server와 Client간의 통신은 Send,Receive의 형태로 주고 받습니다
//	4. 통신이 끝나면 Close()로 접속을 끊습니다
//	5. Thread를 무조건 사용
	
	ServerSocket ss;
	
	public MyServer() {
		try {
//			서버소켓을 생성시에 서비스 포트번호를 지정.
//			포트는 클라이언트가 접속할 때 필요
			ss = new ServerSocket(3000); //서버준비완료
			System.out.println("서버 준비 완료!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
		public void run() {
//			무한반복 속에서 접속자들을 항상 받을 준비를 해야 한다
			while(true) {
				try {
					Socket s = ss.accept();
					
//					위에서 지정한 포트로 접속한 클라이언트의 IP주소를 가져온다
					String ip = s.getInetAddress().getHostAddress();
					System.out.println(ip+"님 왔다 감!");
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

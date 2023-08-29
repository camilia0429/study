package Ex3_Chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChatServer extends Thread {
	
	ServerSocket ss;
	ArrayList<CopyClient> list; //복사본 클라이언트를 담을 리스트를 준비
	
	public ChatServer() {
		try {
			
			list = new ArrayList<CopyClient>(); // 리스트 생성
			
			ss = new ServerSocket(3200);
//			서버소켓 객체가 생성되었다는 이유만으로 서버의 기능을 함
			
			System.out.println("서버시작");
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new ChatServer().start();
		
		
	}//main
	
	@Override
	public void run() {
		
		while(true) {
			try {
				Socket s = ss.accept();
				String ip = s.getInetAddress().getHostAddress();
				System.out.println(ip+"님 접속");
				
				CopyClient cc = new CopyClient(s, this);
				list.add(cc);
				cc.start();//클라이언트 복사본의 스레드를 구동
				//이렇게 해야 CopyClient의 스레드에서 inputStream을 통해 클라이언트로부터 넘어온 값을 처리할 수 있다
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}//while
		
		
		
	}//run메서드
	
	public void sendMessage(String msg) {
//		접속자들의 정보는 CopyClient로 만들어서 ArrayList에 모두 저장된 상태
		
		try {
			for(CopyClient cc:list) {
				cc.out.println(msg); // 서버의 접속자들에게 메세지 전달
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void removeClient(CopyClient cc) {
		list.remove(cc); //인자로 전달된 CopyClient객체를 ArrayList에서 삭제
		sendMessage("----"+cc.ip+"님 퇴장 ----");
	}
	
	
	
	
	
	
	

}

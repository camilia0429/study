package Ex2_Message;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;


public class MyServer extends Thread {
	
	ServerSocket ss;
	
	public MyServer() {
		try {
			ss = new ServerSocket(3001);
			System.out.println("서버 시작");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
//		thread가 해야할 일
//		접속자를 받고,접속자가 입력한 문자열 받기
//		그 문자열을 IP와 함께 출력
		while(true) {
			try {
				Socket s = ss.accept();
//				클라이언트는 접속을 하자마자 문자열을 보내기 때문에
//				문자열을 받아두기
				BufferedReader reader = new BufferedReader(new InputStreamReader(s.getInputStream()));
				
				String msg = reader.readLine();//접속자가 보낸 메세지를 읽어오는 명령
				String ip = s.getInetAddress().getHostAddress();
				
				System.out.println(ip+" : "+msg);
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
//		프로그램의 시작
		MyServer ms = new MyServer();
		ms.start();
		
		
		
	}//main

}

package Ex2_Message;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class MyClient {
	public static void main(String[] args) {
		
//		프로그램 시작
		System.out.print("입력 : ");
		Scanner sc = new Scanner(System.in);
		String msg = sc.nextLine();
		
		if(msg != null && msg.trim().length() > 0) {
			Socket s = null;
			
//			서버의 IP와 포트
			try {
				s = new Socket("192.168.1.24",3001);
				
//				문자열을 서버로 보내기 위한 스트림 준비
				PrintWriter out = new PrintWriter(s.getOutputStream());
				
//				서버로 문자열 전송
				out.write(msg);
				
//				스트림에 적재한 내용 비우기
				out.flush();
				
				if(out != null) {
					out.close();//스트림닫기
				}
				if(s != null) {
					s.close();//소켓닫기
				}
				
				
				
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}//main

}

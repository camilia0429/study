package Ex3_FileOutput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Ex2_FileOutput {
	public static void main(String[] args) {
		
		try {
			FileOutputStream fos = new FileOutputStream("D:\\JAVA19_JYM/fileOut.txt",true); //기본이 덮어쓰기이나,두번째 파라미터에 true를 넣으면 덮어쓰기가 되지 않음.
			
//			fos.write('f');
//			fos.write('i');
//			fos.write('l');
//			fos.write('e');
			
			String msg = "fileOutput 예제입니다\n";
			String msg2 = "여러줄도 가능\n";
			
//			getBytes() : 문자열을 바이트배열로 바꿔주는 메서드
			fos.write(msg.getBytes());
			fos.write(msg2.getBytes());
			
			fos.close();
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}//main

}

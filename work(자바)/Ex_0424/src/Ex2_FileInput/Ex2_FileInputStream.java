package Ex2_FileInput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex2_FileInputStream {
	public static void main(String[] args) {
		String path = "D:\\JAVA19_JYM/test.txt";
		
		File f = new File(path); //생략가능
		
		byte[] read1 = new byte[(int)f.length()]; //한글출력 - byte사용. f.length()는 long type이라 int로 형변환
		
		if(f.exists()) {
			try {
				FileInputStream fis = new FileInputStream(f);
				fis.read(read1);
				
				String res = new String(read1);
				System.out.println(res);
				
				fis.close(); // 써줘야 함
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
		
		
	}//main

}

package Ex4_CharacterStream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class ByteCharReader {
	public static void main(String[] args) {
//		byte 스트림과 char스트림의 연결
		
		File f = new File("D:\\\\JAVA19_JYM\\\\work\\\\Ex_0424\\\\src\\\\Ex2_FileInput\\\\Ex2_FileInputStream.java");
		
		try {
			FileInputStream fis = new FileInputStream(f);
//			byte기반의 스트림은 한 줄 단위 처리가 안된다
//			BufferedReader가 필요
			BufferedReader br = new BufferedReader(new InputStreamReader(fis));
			
			String str;
			while((str = br.readLine())!= null){
				System.out.println(str);
			}
			
			if(br != null) {
				br.close();
			}
			
			if(fis != null) {
				fis.close();
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}//main

}

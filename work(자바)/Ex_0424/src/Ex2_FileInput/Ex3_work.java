package Ex2_FileInput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex3_work {
	public static void main(String[] args) {
		
//		file.txt의 내용을 FileInputStream으로 읽어온 뒤
//		이 값이 회문인지 아닌지를 판별하세요.
//		회문 -> 앞으로 읽어도 뒤로 읽어도 똑같이 읽히는 문장
		
		
String path = "D:\\JAVA19_JYM/file.txt";
		
		File f = new File(path); //생략가능
		
		byte[] read1 = new byte[(int)f.length()];
		

		try {
			FileInputStream fis = new FileInputStream(f);
			fis.read(read1);
			
			String res = new String(read1);
			String res1 = "";
			
			for(int i=res.length()-1; i>=0; i--) {
				res1+=res.charAt(i);
			}
			
			if(res.equals(res1)) {
				System.out.println(res+"는 회문입니다");
			} else {
				System.out.println(res+"는 회문이 아닙니다");
			}
			
			fis.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

		
		
	}//main

}

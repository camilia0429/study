package Ex2_FileInput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex1_FileInputStream {
	public static void main(String[] args) {
//		파일 안의 내용을 읽어오기 위해서는 FileInputstream이라고 하는 클래스가 할 수 있다
//		1) ...stream : byte기반의 스트림. 1byte씩 읽어온다
//		2) ...Reader,...Writer : char기반의 스트림. ->2byte씩 읽어온다
		
		String path = "D:\\JAVA19_JYM/test.txt";
		
		File f = new File(path); //생략가능
		
		if(f.exists()) { // 파일이 존재할때만 수행
			try {
				FileInputStream fis = new FileInputStream(f);
				int code = 0;
				
//				read()메서드는 한번에 1byte씩 읽어오다가
//				더이상 읽어올 단어가 없다면 문장의 끝(End Of File)인 01을 가져온다
//				아스키코드에서도 유니코드에서도 -1에 해당하는 글자가 없기 때문에 -1로 정했다.
				
				while((code = fis.read()) != -1) {
					System.out.print((char)code+" ");
				}
				fis.close();
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
	}//main

}

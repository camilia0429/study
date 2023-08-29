package Ex4_CharacterStream;

import java.io.FileReader;

public class Ex2_FileReader {
	public static void main(String[] args) {
//		test.txt의 내용을 읽어서 내용에 알파벳 대문자와 소문자의 개수를 출력하세요.
		
//		대문자 : X개
//		소문자 : X개
		
//		한글과 특수문자는 판단할 필요X
		
		int bc = 0;
		int sc = 0;
		
		try {
			FileReader fr = new FileReader("D:\\JAVA19_JYM/test.txt");
			int code = 0;
			
			while((code = fr.read()) !=-1) {
				if(code >= 65 && (char)code<=90) {
					bc++;
				}
				if(code >= 97 && (char)code<=122) {
					sc++;
				}
				
			}
			System.out.println("대문자 : "+bc);
			System.out.println("소문자 : "+sc);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}//main

}

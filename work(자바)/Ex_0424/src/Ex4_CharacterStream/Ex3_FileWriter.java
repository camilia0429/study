package Ex4_CharacterStream;

import java.io.FileWriter;
import java.io.IOException;

public class Ex3_FileWriter {
	public static void main(String[] args) {
		
		try {
			FileWriter fw = new FileWriter("D:\\JAVA19_JYM/fileWriter예제.txt");
			
			fw.write("첫번째 줄 작성합니다");
			fw.write("\n");
			fw.write("두번째 줄도 문제없지");
			
			fw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}//main

}

package Ex4_CharacterStream;

import java.io.FileWriter;
import java.io.IOException;

public class Ex3_FileWriter {
	public static void main(String[] args) {
		
		try {
			FileWriter fw = new FileWriter("D:\\JAVA19_JYM/fileWriter����.txt");
			
			fw.write("ù��° �� �ۼ��մϴ�");
			fw.write("\n");
			fw.write("�ι�° �ٵ� ��������");
			
			fw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}//main

}

package Ex4_CharacterStream;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ex1_FileReader {
	public static void main(String[] args) {
//		char����� ��Ʈ���� Reader,Writer�� �ڽ�Ŭ�������� ���
//		�⺻������ 2byte�� �����ϱ� ������ 2byte���� ������ ���ϵ� ���� ������� ����
		
		try {
			FileReader fr = new FileReader("D:\\JAVA19_JYM/test.txt");
			int code = 0;
			
			while((code = fr.read()) !=-1) {
				System.out.print((char)code);
			}
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		
		
		
		
	}//main

}

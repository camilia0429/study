package Ex4_CharacterStream;

import java.io.FileReader;

public class Ex2_FileReader {
	public static void main(String[] args) {
//		test.txt�� ������ �о ���뿡 ���ĺ� �빮�ڿ� �ҹ����� ������ ����ϼ���.
		
//		�빮�� : X��
//		�ҹ��� : X��
		
//		�ѱ۰� Ư�����ڴ� �Ǵ��� �ʿ�X
		
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
			System.out.println("�빮�� : "+bc);
			System.out.println("�ҹ��� : "+sc);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}//main

}

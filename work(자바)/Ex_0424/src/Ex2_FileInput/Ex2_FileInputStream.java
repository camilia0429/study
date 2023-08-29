package Ex2_FileInput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex2_FileInputStream {
	public static void main(String[] args) {
		String path = "D:\\JAVA19_JYM/test.txt";
		
		File f = new File(path); //��������
		
		byte[] read1 = new byte[(int)f.length()]; //�ѱ���� - byte���. f.length()�� long type�̶� int�� ����ȯ
		
		if(f.exists()) {
			try {
				FileInputStream fis = new FileInputStream(f);
				fis.read(read1);
				
				String res = new String(read1);
				System.out.println(res);
				
				fis.close(); // ����� ��
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
		
		
	}//main

}

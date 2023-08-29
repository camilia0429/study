package Ex2_FileInput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex1_FileInputStream {
	public static void main(String[] args) {
//		���� ���� ������ �о���� ���ؼ��� FileInputstream�̶�� �ϴ� Ŭ������ �� �� �ִ�
//		1) ...stream : byte����� ��Ʈ��. 1byte�� �о�´�
//		2) ...Reader,...Writer : char����� ��Ʈ��. ->2byte�� �о�´�
		
		String path = "D:\\JAVA19_JYM/test.txt";
		
		File f = new File(path); //��������
		
		if(f.exists()) { // ������ �����Ҷ��� ����
			try {
				FileInputStream fis = new FileInputStream(f);
				int code = 0;
				
//				read()�޼���� �ѹ��� 1byte�� �о���ٰ�
//				���̻� �о�� �ܾ ���ٸ� ������ ��(End Of File)�� 01�� �����´�
//				�ƽ�Ű�ڵ忡���� �����ڵ忡���� -1�� �ش��ϴ� ���ڰ� ���� ������ -1�� ���ߴ�.
				
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

package Ex3_FileOutput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Ex2_FileOutput {
	public static void main(String[] args) {
		
		try {
			FileOutputStream fos = new FileOutputStream("D:\\JAVA19_JYM/fileOut.txt",true); //�⺻�� ������̳�,�ι�° �Ķ���Ϳ� true�� ������ ����Ⱑ ���� ����.
			
//			fos.write('f');
//			fos.write('i');
//			fos.write('l');
//			fos.write('e');
			
			String msg = "fileOutput �����Դϴ�\n";
			String msg2 = "�����ٵ� ����\n";
			
//			getBytes() : ���ڿ��� ����Ʈ�迭�� �ٲ��ִ� �޼���
			fos.write(msg.getBytes());
			fos.write(msg2.getBytes());
			
			fos.close();
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}//main

}

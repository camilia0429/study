package Ex2_FileInput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex3_work {
	public static void main(String[] args) {
		
//		file.txt�� ������ FileInputStream���� �о�� ��
//		�� ���� ȸ������ �ƴ����� �Ǻ��ϼ���.
//		ȸ�� -> ������ �о �ڷ� �о �Ȱ��� ������ ����
		
		
String path = "D:\\JAVA19_JYM/file.txt";
		
		File f = new File(path); //��������
		
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
				System.out.println(res+"�� ȸ���Դϴ�");
			} else {
				System.out.println(res+"�� ȸ���� �ƴմϴ�");
			}
			
			fis.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

		
		
	}//main

}

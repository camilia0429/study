package Ex_File;

import java.io.File;

public class Ex2_File {
	public static void main(String[] args) {
		String path = "D:\\JAVA19_JYM/";
//		���� �������� �����̸� ���� ��ϵ��� �̸��� ������ �� �ִ�
		File f = new File(path);
		
//		isDirectory() : ���� �������� �����̸� true��ȯ
		if(f.isDirectory()) {
			String[] names = f.list();
//			f����� ���� ��ҵ��� ���ڿ��迭 ���·� ��ȯ
			
			for(String s : names) {
				System.out.println(s);
			}
		}
		
		
		
		
		
	}//main

}

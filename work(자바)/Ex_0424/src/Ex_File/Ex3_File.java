package Ex_File;

import java.io.File;

public class Ex3_File {
	public static void main(String[] args) {
		String path = "D:\\JAVA19_JYM/aaa/bbb";
		
		File f = new File(path);
		
//		exists() : ���� Ŭ������ path��η� ã�ư��� �� ���������� ������ ������ �����Ѵٸ� true��ȯ
//		mkdirs() : make directories�� ����. ���丮 ����
		if(!f.exists()) {
			System.out.println("���� ����!");
			f.mkdirs();
		}
//		if(f.exists()) {
//			System.out.println("���� ����!");
//			f.delete();
//		}
		
	}//main

}

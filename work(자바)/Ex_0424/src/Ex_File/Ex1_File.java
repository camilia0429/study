package Ex_File;

import java.io.File;

public class Ex1_File {
	public static void main(String[] args) {
//		IO(Input,Output) : ����� ��Ʈ��
//		��Ʈ�� : �����͸� ������ϱ� ���� ���
		
//		File ��ü�� ������ ���
		String path = "D:\\JAVA19_JYM/test.txt";
		
//		�غ�� ��η� File ��ü ����
		File f = new File(path);
//		FileŬ������ �����Ǹ鼭 path��α��� ��Ʈ���� ����
		
//		isFile() : ���� Ŭ������ ������ ���� �������� ���������� ��� true
//		length() : ������ �뷮�� ������ �� �ִ�. �ѱ��� 1���� 2byte,����� 1���� 1byte
		if(f.isFile()) {
			System.out.println(f.length()+"byte");
		}
		
		
		
		
	}//main

}

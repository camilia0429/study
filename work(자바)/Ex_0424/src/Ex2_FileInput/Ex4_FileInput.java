package Ex2_FileInput;

import java.io.IOException;
import java.util.Scanner;

public class Ex4_FileInput {
	public static void main(String[] args) {
		
		byte[] keyboard = new byte[100];
		
		
		System.out.print("�� : ");
		
//		Ű���忡�� ���� �Է¹ޱ� ���� ǥ�� �Է���ġ ��Ʈ��
//		Ű���忡�� �Է¹޴°͵� �ܺο��� ���� �ԷµǴ°�
		try {
			System.in.read(keyboard); // 
			
			String s = new String(keyboard).trim();
			System.out.println(s);
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Scanner scanner = new Scanner(System.in);
		
//		System.in�� static�̱� ������ �޸𸮿� �ѹ��� �ö󰡰�
//		close�� �ݰԵǸ� �ٸ� Ŭ���������� �ݾ�����. ������ �Ժη� ���� �ʴ´�
		
		
	}//main

}

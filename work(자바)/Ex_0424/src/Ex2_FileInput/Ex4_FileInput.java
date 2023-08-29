package Ex2_FileInput;

import java.io.IOException;
import java.util.Scanner;

public class Ex4_FileInput {
	public static void main(String[] args) {
		
		byte[] keyboard = new byte[100];
		
		
		System.out.print("값 : ");
		
//		키보드에서 값을 입력받기 위한 표준 입력장치 스트림
//		키보드에서 입력받는것도 외부에서 값이 입력되는것
		try {
			System.in.read(keyboard); // 
			
			String s = new String(keyboard).trim();
			System.out.println(s);
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Scanner scanner = new Scanner(System.in);
		
//		System.in은 static이기 때문에 메모리에 한번만 올라가고
//		close로 닫게되면 다른 클래스에서도 닫아진다. 때문에 함부로 닫지 않는다
		
		
	}//main

}

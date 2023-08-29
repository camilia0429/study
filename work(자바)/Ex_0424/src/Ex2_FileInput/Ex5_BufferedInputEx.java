package Ex2_FileInput;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex5_BufferedInputEx {
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		byte _byte[] = new byte[100];
		byte result[] = new byte[100];
		
		
		try {
			System.out.println("경로 입력 : ");
			System.in.read(_byte);
			String path = new String(_byte).trim();
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
//		try {
//		System.out.println("경로 입력 : ");
//		System.in.read(_byte);
//		String path = new String(_byte).trim();
//		
//		fis = new FileInputStream(path);
//		bis = new BufferedInputStream(fis);
//		
//		
//		bis.read(result);
//		System.out.print(new String(result).trim());
//		
//		} catch(IOException e){
//			e.printStackTrace();
//		} finally {
//			Try{
//				if(fis !=null) {
//					fis.close();
//				}
//				if(bis != null) {
//					bis.close();
//				}
//			} catch(Exception e) {
//			}
//		}
	}//main

}

package Ex_File;

import java.io.File;

public class Ex2_File {
	public static void main(String[] args) {
		String path = "D:\\JAVA19_JYM/";
//		최종 목적지가 폴더이면 하위 목록들의 이름을 가져올 수 있다
		File f = new File(path);
		
//		isDirectory() : 최종 목적지가 폴더이면 true반환
		if(f.isDirectory()) {
			String[] names = f.list();
//			f경로의 하위 요소들을 문자열배열 형태로 변환
			
			for(String s : names) {
				System.out.println(s);
			}
		}
		
		
		
		
		
	}//main

}

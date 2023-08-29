package Ex_File;

import java.io.File;

public class Ex3_File {
	public static void main(String[] args) {
		String path = "D:\\JAVA19_JYM/aaa/bbb";
		
		File f = new File(path);
		
//		exists() : 파일 클래스가 path경로로 찾아가는 중 정상적으로 폴더나 파일이 존재한다면 true반환
//		mkdirs() : make directories의 약자. 디렉토리 생성
		if(!f.exists()) {
			System.out.println("폴더 생성!");
			f.mkdirs();
		}
//		if(f.exists()) {
//			System.out.println("폴더 삭제!");
//			f.delete();
//		}
		
	}//main

}

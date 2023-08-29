package Ex_File;

import java.io.File;

public class Ex1_File {
	public static void main(String[] args) {
//		IO(Input,Output) : 입출력 스트림
//		스트림 : 데이터를 입출력하기 위한 통로
		
//		File 객체를 생성할 경로
		String path = "D:\\JAVA19_JYM/test.txt";
		
//		준비된 경로로 File 객체 생성
		File f = new File(path);
//		File클래스가 형성되면서 path경로까지 스트림을 생성
		
//		isFile() : 파일 클래스가 접근한 최종 목적지가 파일형식일 경우 true
//		length() : 파일의 용량을 가져올 수 있다. 한글은 1글자 2byte,영어는 1글자 1byte
		if(f.isFile()) {
			System.out.println(f.length()+"byte");
		}
		
		
		
		
	}//main

}

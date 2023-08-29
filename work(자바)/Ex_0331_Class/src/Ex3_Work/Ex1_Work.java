package Ex3_Work;

import java.util.Scanner;

public class Ex1_Work {
	public static void main(String[] args) {
//		키보드에서 숫자와 특수문자를 제외한 알파벳을 무작위로 입력받는다.
//		입력받은 문자열에 소문자 a가 몇개 들어있는지 반별하는 코드를 작성해보자.
		
//		입력 : asdfasdff
//		결과 : 2
		
		Scanner scan = new Scanner(System.in);
//		System.out.print("문자열 : ");
//		String ch = scan.nextLine();
//		System.out.println("입력한 문자열 : "+ch);
//		
//		int count = 0; 
//		for(int i=0; i < ch.length(); i++) {
//			if(ch.charAt(i) == 'a') {
//				count++;
//			}
//			}
//		System.out.println(count);
		
		
//		회문구하기
//		회문이란 앞으로 읽어도 거꾸로 읽어도 똑같이 읽히는 문장을 의미
//		토마토, 기러기, 별똥별...
//		키보드에서 문자열을 입력받아 회문인지 아닌지를 판별하는 코드 작성하기
		
		System.out.print("문자열 : ");
		String rw = scan.nextLine();
		String rw2 = "";
		System.out.println("입력한 문자열 : "+rw);
						
				
		for(int i = rw.length()-1; i>=0; i--) {
			rw2+=rw.charAt(i);
		}
		
		if(rw.equals(rw2)) {
			System.out.println(rw+"는 회문입니다");
		} else {
			System.out.println(rw+"는 회문이 아닙니다");
		}
		
		
		
		
 
		
		
		
		
		
		
	}//main

}

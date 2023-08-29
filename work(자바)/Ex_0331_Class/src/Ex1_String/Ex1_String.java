package Ex1_String;

import java.util.Scanner;

public class Ex1_String {
	public static void main(String[] args) {
//		String 클래스는 두가지 특징을 가지고 있다
//		1) 객체 생성법이 두가지(명시적, 암시적)
//		2) 한 번 생성된 문자열의 내용은 변하지 않는다(불변의 특징)
//		*암시적 객체생성은 String클래스에서만 사용*
		
		String s1 = "abc"; // 암시적 객체 생성
		String s2 = "abc";
		
//		이미 앞에 같은 문자열로 생성된 암시적 객체가 있다면
//		앞서 생성된 객체의 주소를 재사용한다.
		
//		new를 통해 명시적으로 객체가 만들어진 경우 내용이 같더라도 각 개체는 다른 객체이다.
		String s3 = new String("abc");
		String s4 = new String("abc");
		
		
		
//		'==' 연산자는 기본 자료형을 비교할 때는 값을 비교하지만 객체를 비교할 때는 주소를 비교하는 연산자로 기능이 바뀐다.		
		if(s1 == s2) {
			System.out.println("s1과 s2는 같습니다");
		} else {
			System.out.println("s1과 s2는 다릅니다");
		}
		
		if(s1 == s3) {
			System.out.println("s1과 s3는 같습니다");
		} else {
			System.out.println("s1과 s3는 다릅니다");
		}
		
		if(s3 == s4) {
			System.out.println("s3과 s4는 같습니다");
		} else {
			System.out.println("s3과 s4는 다릅니다");
		}
		
		
//		문자열 객체에 들어있는 값을 비교하기 위해서는 equals()를 사용해야 한다
		if(s3.contentEquals(s4)) {
			System.out.println("s3과 s4는 내용이 같습니다");
		} else {
			System.out.println("s3과 s4는 내용이 다릅니다");
		}
		
		
		
//		============================
		
		System.out.println("=========================================");
		
		
//		불변의 법칙
		String greet = "안녕";
		greet +="하세요";
		System.out.println(greet);
		
//		기존 "안녕"은 변하지 않고 "안녕하세요"라는 객체가 새로 생성되며 기존 객체는 쓰지 않는 쓰레기가 되어 버린다.
		
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
		
		
		
		
	}//main

}

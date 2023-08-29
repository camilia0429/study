package Ex1_if;

public class Ex2_if_else {
	public static void main(String[] args) {
//		if - else 문
		
//		기본형
//		if(조건식){
//			조건식이 참일 때 실행할 명령
//		} else {
//			조건식이 거짓일 때 실행할 명령
//		}
		
		int n = 49;
		String str = null;	// 아무것도 아닌 값
//		String str; 		       선언만 해도 상관은 없음
		
		if(n >= 50) {
			str = "n은 50 이상의 수";
		} else {
			str = "n은 50 미만의 수";
		}
		System.out.println(str);
		
		
//		정수형 변수 age에 나이를 초기화 하고
//		30세 이상히면 "드실만큼 드셨네요"
//		그렇지 않으면 "더 드세요"를 출력하는 if문을 구현한 후
//		"감사합니다" 라는 문장 출력
		
		int age = 33;
		String A = null;
		
		if (age >= 30) {
			A = "드실만큼 드셨네요";
		} else {
			A = "더 드세요";
		}
		System.out.println(A+" 감사합니다");
		
//		★삼항연사자 사용
		String str2 = age >= 30 ? "드실만큼 드셨네요" : "더 드세요";
		System.out.println(str2+" 감사합니다");
		
	}

}

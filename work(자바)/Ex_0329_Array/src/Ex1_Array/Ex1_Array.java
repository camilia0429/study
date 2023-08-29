package Ex1_Array;

public class Ex1_Array {
	public static void main(String[] args) {
		
//		Array(배열) : 같은 자료형의 데이터들을 모아놓은 묶음
//		효율적인 관리를 위해서 반드시 필요!
		
//		1. 배열의 선언
//		자료형[] 배열명;
		int[] ar;
		
//		2. 배열의 생성
//		배열명 = new 자료형[길이];
		ar = new int[4];
		
//		선언 + 생성
		int[] arr = new int[4];
		
//		각각의 방에 데이터 넣기
//		배열명[index] = 데이터;
		ar[0] = 100;
		ar[1] = 200;
		ar[2] = 300;
		ar[3] = 400;
		
//		마지막 인덱스번호 : 길이 - 1
//		배열의 각각의 방에 값을 대입할 수도 있다.
		for(int i = 0; i < 4; i++) {
			arr[i] = (i+1)*100;
			System.out.println(arr[i]);
		}
		
//		배열의 초기화
//		괄호 안의 데이터 수만큼 배열의 크기를 자동으로 만들어 줌
		int[] iArr = {10,20,30,40,50};
		
		
//		배열의 출력
		System.out.println(ar[1]);
		
//		배열의 출력2
//		반복문 이용
		for(int i = 0; i < 5; i++) {
			System.out.println(iArr[i]);
		}
		
		
		
	}//main

}

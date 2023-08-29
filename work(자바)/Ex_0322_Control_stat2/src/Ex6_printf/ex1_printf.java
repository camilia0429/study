package Ex6_printf;

public class ex1_printf {
	public static void main(String[] args) {
//		printf:문자열과 변수에 들어있는 데이터를 함께 출력할 수 있도록 도와주는 포맷형식
//		printf의 f는 format이라는 뜻
		
		int su1 = 10;
		int su2 = 7;
		
//		10+7+17
		
		System.out.println(su1+"+"+su2+"="+(su1+su2));
		System.out.printf("%d + %d = %d\n",su1,su2,(su1+su2));
		
//		형식 지정자 (*외우기)
//		1. %d : 정수형을 입력받을 때 사용
//		2. %c : 문자형을 입력받을 때 사용
//		3. %s : 문자열을 입력받을 때 사용
//		4. %f : 실수형을 입력받을 때 사용
		
		int age = 30;
//		저의 나이는 30세 입니다.
		System.out.println("저의 나이는 "+age+"세 입니다");
		System.out.printf("저의 나이는 %d세 입니다",age);
		System.out.println();
		
//		저의 나이는 30세 이고 키는 175입니다.
		System.out.printf("저의 나이는 %d세이고 키는 %d입니다",age,175);
		
//		원주율은 3.141592입니다.
		System.out.printf("원주율은 %.2f입니다\n",3.141592);
		
//		1 2 3 4
//		5 6 7 8
//		9 10 11 12
		
		int count = 1;
		for(int i=0; i <3; i++) {
			for(int j=0; j<4; j++) {
				System.out.printf("%03d ",count);
				count++;
			}
			System.out.println();
		}
		
		
	}//main

}

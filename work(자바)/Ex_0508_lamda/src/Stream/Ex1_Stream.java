package Stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex1_Stream {
	public static void main(String[] args) {
		String[] strArray = {"홍길동","김자바","박람다"};
		Stream<String> strStream = Arrays.stream(strArray);
		//forEach 보통 결과만들기에서 사용하는 메서드. 
		strStream.forEach(item -> System.out.print(item+" "));
		System.out.println();
		
		
		int[] intArray = {1,2,3,4,5};
		IntStream intStream = Arrays.stream(intArray);
		intStream.forEach(item->System.out.print(item+" "));
		System.out.println();
		
//		스트림의 연산
//		중간연산 : 연산의 결과가 스트림이어야 함. 스트림에 연속해서 연산을 할 수 있다.
//		최종연산 : 연산의 결과가 스트림이 아닌 연산. 스트림의 요소를 소모하므로 단 한번만 가능
		
		int[] nums = {1,44,33,21,35,67,99,4,5,6,1,1,1,2,2,3,3,3};
//		distinct : 중복제거
		Arrays.stream(nums).distinct().sorted().limit(5).forEach(System.out::print);
		System.out.println();
		
		for(int n:nums) {
			System.out.print(n+" ");
		} //원본값을 변하지 않음
		
		
		
		
		
		
		
	}//main

}

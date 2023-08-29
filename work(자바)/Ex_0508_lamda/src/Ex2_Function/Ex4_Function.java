package Ex2_Function;

import java.util.function.Function;

public class Ex4_Function {
	public static void main(String[] args) {
//		Function의 합성
										//Integer.parseInt(값,진수); : 진수값으로 바꿔줌
		Function<String, Integer> f = s -> Integer.parseInt(s,16);
		
										//2진수로 값을 바꿔줌
		Function<Integer, String> g = i -> Integer.toBinaryString(i);
		
//		f.andThen(g) : f함수를 먼저 적용하고 그 다음에 g를 적용한다
		Function<String,String> h = f.andThen(g);
		
		System.out.println(h.apply("FF")); // FF-> 255 -> 11111111
		
//		f.compose(g) : g함수를 먼저 적용하고 그 다음에 f를 적용한다
		Function<Integer,Integer> h2 = f.compose(g);
		System.out.println(h2.apply(2)); // 2 -> 10 -> 16
		
		
		
		
	}//main

}

package Ex2_Function;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class Ex5_Function {
	public static void main(String[] args) {
//		메서드의 참조
/*		람다식을 더욱 간결하게 표현할 수 있게 해준다
 * 		람다식이 하나의 메서드만 호출하는 경우에는 메서드 참조(method reference)라는 방법으로
 * 		람다식을 간결하게 바꿀 수 있다
 * 		하나의 메서드 타입만 호출하는 람다식은 클래스이름::메서드이름 또는 참조변수:: 메서드이름
 * 		으로 바꿀 수 있다
 * 
 * 		참조타입 : (byte,short,char,int,long,double,float,boolean)과 같은 기본타입을 제외하고
 * 		배열, 열거형(Enum),클래스, 인터페이스를 의미한다
 */
		Function<String, Integer> f = (String s) -> Integer.parseInt(s);
		
		Function<String, Integer> f2 = Integer::parseInt; // 메서드 참조
		
		BiFunction<String, String, Boolean> f3 = (s1,s2) ->s1.equals(s2);
		BiFunction<String, String, Boolean> f4 = String::equals;
		
//		Boolean result = isEqualString("abc", "abc", (s1,s2)->s1.equals(s2));
		Boolean result = isEqualString("abc","abc",String::equals);
		System.out.println(result);
		
		
	}//main

	static Boolean isEqualString(String s1,String s2,BiPredicate<String, String> predicate) {
		return predicate.test(s1, s2);
	}
	
	
	
	
	
}

package Ex6_Object;

public class ExtendsMain {
	public static void main(String[] args) {
		ExtendsEx1 v1 = new ExtendsEx1();
		
		v1.setValue("TEST");
//		인자가 Object 이지만 String이 Object를 상속 받았으므로 인자로서 사용이 가능
				
		System.out.println(v1.getValue());
		
//		이번에는 정수(int)를 인자로 넣어보자
		ExtendsEx1 v2 = new ExtendsEx1();
		
		v2.setValue(100); //AutoBoxing(자동형변환:기본자료형->객체)
		
		System.out.println(v2.getValue());
		
		int i = (int)v2.getValue(); // Unboxing 객체->기본자료
		
		System.out.println(i+1);
		
		
		
		
		
		
	}//main

}

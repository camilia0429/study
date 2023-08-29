package Ex2_generic;

public class PersonMain {
	public static void main(String[] args) {
		Person<String, Integer> p1 = new Person<String, Integer>("홍길동", 30);
		Person<String, Integer> p2 = new Person<>("이상혁", 28);
		
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		System.out.println("--------------------");
		System.out.println(p2.getName());
		System.out.println(p2.getAge());
		
//		Gen클래스를 만들어 제네릭타입<T>를 갖는 printArr메서드를 생성산다
//		printArr메서드 내부에서 배열을 순차적으로 출력하는 코드 작성
		
//		Main클래스를 만들어 Integer[], Double[], Character[]를 만든뒤
//		Gen클래스의 prinArr메서드를 각각 호출하여 배열의 내용을 출력하도록 해보자
		
//		결과
//		1,2,3,4,5 //integer
//		1.1,2.2,3.3,4.4,5.5 double배열 출력
//		A B C D E //Character배열 출력
		
		
	}//main

}

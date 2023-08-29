package Ex2_Operator;

public class Ex1_Operator {
	public static void main(String[] args) {
//		operator = 연산자
//		2 + 3 (2,3은 피 연산자/+는 연산자)
		/*
		 * 1. 최고연산자 : . ()
		 * 2. 증감연산자 : ++, --
		 * 3. 산술연산자 : +, -, *, /(몫을 구하는 나누기), %(모듈러, 나머지를 구하는 나누기) (개발)
		 * 4. 시프트연산자 : >>, << (정보/보안,복호화,암호화에 사용)
		 * 5. 비교연산자 : >, <, >=, <=, ==(같다), !=(같지않다) (개발)
		 * 6. 비트연산자 : &, |(bar/역슬래쉬), ^, ~ (정보/보안,복호화,암호화에 사용)
		 * 7. 논리연산자 : &&, ||, !
		 * 8. 삼항연산자 : ? , :
		 * 9. 대입연산자 : =, (+=, -=, *=, /=, %= : 복합대입연산자)
		 */
		
//		산술연산자
		int n1,n2,n3; //정수형 변수 3개를 동시에 선언
		n1 = 20;
		n2 = 7;
		
		n3 = n1+n2;
//		우변에 수식이 나올 경우 계산 한 값을 좌변에 대입
		System.out.println("n3의 값 : "+n3);
		
		n3 = n1-n2;
		System.out.println("n3의 값 : "+n3);
		
		n3 = n1/n2;
		System.out.println("n3의 값 : "+n3);
		
		n3 = n1%n2;
		System.out.println("n3의 값 : "+n3);
		
//		자주 쓰이는 로직 나머지 구하는 경우
//		짝수홀수 구할 때
//		X % 2 == 0 -> 짝수
//		X % 2 == 1 -> 홀수
		
//		n의 배수인지 판별할 때
//		X % n == 0 -> X는 n의 배수
		
//		대입연산자 ( = )
//		첫날부터 가장 많이 사용했던 연산자
//		항상 우변의 값을 좌변에 대입한다고 생각
		
//		산술연산자와 대입연산자가 합쳐진 복합대입연사자
//		+=, -=, *=, /=, %=
		
		n1 = 10;
		n2 = 7;							  		//n1=n1+n2
		System.out.println("+=연산자 : n1 += n2 = "+(n1+=n2));
//		풀어서 쓰면 n1 = n1+n2
		System.out.println("n1의 값 : "+n1);
//		n1의 값이 변경되었다
		
		System.out.println("-=연산자 : n1 -= n2 = "+(n1-=n2));
		System.out.println("n1의 값 : "+n1);
		
		System.out.println("*=연산자 : n1 *= n2 = "+(n1*=n2));
		System.out.println("n1의 값 : "+n1);
		
		System.out.println("/=연산자 : n1 /= n2 = "+(n1/=n2));
		System.out.println("n1의 값 : "+n1);
		
		System.out.println("%=연산자 : n1 %= n2 = "+(n1%=n2));
		System.out.println("n1의 값 : "+n1);

	}

}

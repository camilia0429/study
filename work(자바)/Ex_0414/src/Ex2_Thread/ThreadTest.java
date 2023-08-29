package Ex2_Thread;

public class ThreadTest extends Thread {
//	스레드(thread) : 독립적인 실행단위
//	하나의 프로세스 안에서 두가지 이상의 일을 하도록 하는 것
//	프로세스 : 실행중인 프로그램
//	스레드 : 프로세스에서 작업을 수행하는 것
	
//	프로세스가 실행되는 방식
//	1. 시간 분할 방식 : 모든 프로세스에게 동일한 시간을 할당하고 골고루 실행되는 방식
//	2. 선점형 방식 : 각각의 프로세스에게 우선순위를 부여하고 우선순위가 높은 순서대로 실행되는 방식
	
//	jvm이 스레드 처리시 하는 일 -> 스레드 스케쥴링
//	- 스레드가 몇개 존재하는지
//	- 스레드가 실행되는 프로그램 코드의 메모리 위치가 어딘지
//	- 현재 스레드의 상태는 무엇인지
//	- 스레드의 우선순위는 몇인지
	
//	개발자가 스레드 처리시 하는 일
//	자바 스레드로 작동할 작업이 무엇인지 코드로 작성
//	스레드에 작성한 코드를 실행할 수 있도록 jvm에 요청
	
	@Override
	public void run() {
		// 작업 할 내용
	}
	

}

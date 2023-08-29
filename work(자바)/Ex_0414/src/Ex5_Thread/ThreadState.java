package Ex5_Thread;

public class ThreadState {
//	스레드의 라이프 사이클
//	스레드는 현재 상태에 따라 네 가지 상태로 분류할 수 있으며
//	형태가 변화하는 주기를 life cycle이라고 한다
	
//	new : 스레드가 new를 통해서 객체화 된 상태. runnable이 될 수 있는 상태이며 아직 대기열에 올라가지 못한 상태
//	Runnable : start()메서드가 호출 되면 new상태에서 Runnable상태가 된다.
//			   Runnable상태가 되면 실행할 수 있는 상태로 대기하게 되며 스케쥴러에 의해 선택되면
//			   run()메서드를 바로 수행한다
//	Blocked : 실행중인 스레드가 sleep(), yield(), join()메서드를 호출하게 되면
//	 		  Blocked 상태가 된다. Blocked상태가 되면 스케쥴러에 의해 선택받을 수 없다.
//	Dead : run()메서드의 실행을 모두 완료하게 되면 스레드는 Dead상태가 된다.
//		       할당받은 메모리와 정보 모두 삭제된다
	
	
	
	

}

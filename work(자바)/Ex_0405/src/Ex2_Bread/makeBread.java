package Ex2_Bread;

public class makeBread {
	public void result() {
		System.out.println("빵을 만들었습니다");
	}
	public void result(int x) {
		for(int i=1; i<=x; i++) {
			System.out.println("빵을 만들었습니다\n");
		}
		System.out.printf("요청하신 %d개의 빵을 만들었습니다\n",x);
	}
	public void result(int n,String s) {
		for(int i=1; i<=n; i++) {
			System.out.printf("%s빵을 만들었습니다\n",s);
		}
		System.out.printf("요청하신 %d개의 %s빵을 만들었습니다\n",n,s);
	}
}

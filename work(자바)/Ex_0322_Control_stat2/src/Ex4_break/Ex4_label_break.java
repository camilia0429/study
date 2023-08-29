package Ex4_break;

public class Ex4_label_break {
	public static void main(String[] args) {
		int n = 0;
		outer:while(true) {
			if(n >= 10) {
				break;
			}
			while(true) {
				n++;
				if(n % 3 == 0) {
					System.out.println("continue를 만남");
					continue outer;
				}
				System.out.println(n);
			}
		}
		
		System.out.println();
		System.out.println();

//		반복문 안에서 쓰인 스위치의 break는 어떻게 될까
		n = 0;
		
		w:while(n < 10) {
			n++;
			switch(n) {
			case 1:
				System.out.println("switch문 1번 거쳐감");
				break w; // switch문에서 break는 switch문을 빠져나가는 역할을 우선 수행한다.label을 사용하는 경우 제어가능
			case 2:
				System.out.println("switch문 2번 거쳐감");
//				switch문만 단독으로 사용을 할 때는 continue를 사용할 수 없다. 반복문 안이라서 continue가 사용 가능.
				continue;
			}
			System.out.println(n);
		}
		
		
	}//main

}

package Ex7_Work;

import java.util.Random;

public class Updown {

	Random rnd = new Random();
	int rand = rnd.nextInt(50)+1;

	public String check(int n1) {
		
	
	System.out.print("숫자를 입력해 주세요 : ");
	int num = scan.nextInt();
	
	if(num > rand) {
		System.out.println("Down");
	} else if (num < rand) {
		System.out.println("Up");
	} else if (num == rand) {
		System.out.println("정답");
	}
	}

}

package Ex7_Work;

import java.util.Random;

public class Updown {

	Random rnd = new Random();
	int rand = rnd.nextInt(50)+1;

	public String check(int n1) {
		
	
	System.out.print("���ڸ� �Է��� �ּ��� : ");
	int num = scan.nextInt();
	
	if(num > rand) {
		System.out.println("Down");
	} else if (num < rand) {
		System.out.println("Up");
	} else if (num == rand) {
		System.out.println("����");
	}
	}

}

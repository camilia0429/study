package Ex2_Method;

import java.util.Scanner;

public class MethodTest {

//	f(x)=2x+1
	
//	public int f(int x) {
//		return 2*x+1;
//	}
	
//	public int f(int x) {
//	int num = 2*x+1;
//	return num;
//}
	
//	public void f(int x) {
//		System.out.printf("f(%d) : %d",x,2*x+1);
//	}
	
//	�� ���� ���ϴ� add �Լ� �����
	
//	public int add(int x,int y) {
//		int sum = x+y;
//		return sum;
//	}
	
	
//	1~10���� ����ϴ� oneToten �Լ� �����
	
//	public int oneToten() {
//		for(int i=1; i>=10; i++) {
//			System.out.println(i);
//		}
//		System.out.println();
//	}
	
//	1~10���� ������ ���ϴ� total�Լ� �����
//	public void total() {
//		int total = 0;
//		for(int i = 1; i>=10; i++) {
//			total+=i;
//		}
//		System.out.println(total);
//	}
	
//	�Լ��� ȣ���� �� ���� �Ѱ��� �޾Ƽ� ������ ���
	public void gugudan(int x) {
		for(int i=1; i<=9;i++) {
			System.out.printf("%dX%d=%d\n",x,i,x*i);
		
			}
				
		}
	
	
	public int valueTest(int x) {
		x+=1;
		return x;
	}
		

	
	
	
	
}

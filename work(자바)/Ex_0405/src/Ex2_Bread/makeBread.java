package Ex2_Bread;

public class makeBread {
	public void result() {
		System.out.println("���� ��������ϴ�");
	}
	public void result(int x) {
		for(int i=1; i<=x; i++) {
			System.out.println("���� ��������ϴ�\n");
		}
		System.out.printf("��û�Ͻ� %d���� ���� ��������ϴ�\n",x);
	}
	public void result(int n,String s) {
		for(int i=1; i<=n; i++) {
			System.out.printf("%s���� ��������ϴ�\n",s);
		}
		System.out.printf("��û�Ͻ� %d���� %s���� ��������ϴ�\n",n,s);
	}
}

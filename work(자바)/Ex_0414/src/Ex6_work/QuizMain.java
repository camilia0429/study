package Ex6_work;

public class QuizMain {
	public static void main(String[] args) {
//		QuizThreadŬ������ ����� �����带 ��ӹ޴´�
//		startGame()�޼��带 ����� �� �ȿ��� 1~100������ ���� �ΰ��� ���ϴ� ������ ����
//		Ű���忡�� ���� �Է��Ͽ� 5������ ����ó�� �ɶ����� ������ �ݺ��Ѵ�
		
//		������ ������ �� �Ŀ� ��� ������ �����µ� �� �ʰ� �ɷȴ����� ȭ�鿡 ����Ͽ� ���α׷� ����
		
		QuizThread qt = new QuizThread();
		qt.start();
		qt.startGame();
		
		
//		���� ���
//		23+48 = 00
//		����  or ����
		
//		...
		
//		��� : 30��
		
	}

}

package Ex2_String_method;

public class Ex1_String_method {
	public static void main(String[] args) {
//		�ش� Ŭ������ ��ü�� ����� ��
//		Ŭ������ ��ü�� = new Ŭ������();
		
//		�Լ� ȣ���ϴ� ��
//		������ ���� ��ü�� ���� -> ��ü��.�Լ���();
		
		String str = "Kim Mal Dong";
		System.out.println("���ڿ� str�� ���� : "+str.length());
//		Ŭ������.length(); ������ �����Ͽ� ���̸� ��ȯ�Ѵ�.
		
		System.out.println("�� ó�� ���� K�� ��ġ : "+str.indexOf('K'));
//		Ŭ������.indexOf(''); ������ �����Ͽ� ������ ������ ��ġ���� ��ȯ
		
		System.out.println("������ ���� : "+str.charAt(4));
//		Ŭ������.charAt();���� ���� ���ڿ� ����
		
		System.out.println("���ϴ� ���ڿ� �����ϱ� : "+str.substring(4,7));
//		Ŭ������.substring(4,7); 4�̻�, 7�̸��� ���ڿ� ����
		
		
		String[] str2 = str.split(" ");
		for(int i = 0; i<str2.length; i++) {
			System.out.printf("str2[%d] : %s\n",i,str2[i]);
		}
//		Ŭ����.split("");��� ���ڸ� �������� �߶� �迭�� �־��ش�. 
		
		
//		���� ����� �ϰ� �ִ� ���ڿ��� ���� ���ڷ� �ٲٴ� �� (�ſ� ���� ����)
		String number = "100";
		int n = Integer.parseInt(number);
		System.out.println(n+1);
//		�ݴ��� ���
		int num = 10;
		String s = Integer.toString(num);
		System.out.println(s+1);
		
		
		
		
	}//main

}

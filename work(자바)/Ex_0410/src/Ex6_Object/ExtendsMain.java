package Ex6_Object;

public class ExtendsMain {
	public static void main(String[] args) {
		ExtendsEx1 v1 = new ExtendsEx1();
		
		v1.setValue("TEST");
//		���ڰ� Object ������ String�� Object�� ��� �޾����Ƿ� ���ڷμ� ����� ����
				
		System.out.println(v1.getValue());
		
//		�̹����� ����(int)�� ���ڷ� �־��
		ExtendsEx1 v2 = new ExtendsEx1();
		
		v2.setValue(100); //AutoBoxing(�ڵ�����ȯ:�⺻�ڷ���->��ü)
		
		System.out.println(v2.getValue());
		
		int i = (int)v2.getValue(); // Unboxing ��ü->�⺻�ڷ�
		
		System.out.println(i+1);
		
		
		
		
		
		
	}//main

}

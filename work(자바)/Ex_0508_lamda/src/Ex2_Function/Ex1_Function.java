package Ex2_Function;

import java.util.ArrayList;

public class Ex1_Function {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<11; i++) {
			list.add(i);
		}
		
		list.removeIf(x -> x%2 == 0); //Ȧ���� ��ȯ
		System.out.println(list);
		
		
		
		
		
		
		
	}//main
	
}

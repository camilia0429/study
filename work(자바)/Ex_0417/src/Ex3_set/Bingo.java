package Ex3_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Bingo {
	public static void main(String[] args) {
		
		HashSet<Integer> set = new HashSet<>();
		
		int[][] board = new int[5][5];
		while(set.size() != 25) {
			set.add(new Random().nextInt(50)+1);		
		}
		
//		Set구조는 특정값으로 접근할 수 없기 때문에
//		내용을 순차적으로 얻어오기 위해서는 iterator라고 하는 반복자를 사용해야 한다
		Iterator<Integer> it = set.iterator();
		
		for(int i = 0; i<board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				board[i][j] = it.next();
				System.out.printf("%02d ",board[i][j]);
			}
			System.out.println();
		}
		
		
		
		
		
	}//main

}

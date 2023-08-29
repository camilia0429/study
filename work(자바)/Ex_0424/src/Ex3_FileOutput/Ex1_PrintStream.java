package Ex3_FileOutput;

import java.io.IOException;
import java.io.PrintStream;

public class Ex1_PrintStream {
	public static void main(String[] args) {
		
		PrintStream ps = System.out;
		
//		ps.write('J');
//		ps.write('A');
//		ps.write('V');
//		ps.write('A');
		
		byte[] by = {'J','A','V','A'};
		try {
			ps.write(by);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ps.close();
		
		
		
		
	}//main

}

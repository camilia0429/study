package Ex5_CheckBox;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Ex3_ComboBox {
	public static void main(String[] args) {
		JFrame f = new JFrame("콤보박스 만들기");
		f.setLayout(null);
		String[] title = {"C","JAVA","PYTHON","JAVASCRIPT","REACT"};
		JComboBox<String> jcm1 = new JComboBox<String>(title);
		
		jcm1.setBounds(50, 50, 100, 30);
		f.add(jcm1);
		
		
		
		f.setBounds(300, 300, 300, 200);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}//main

}

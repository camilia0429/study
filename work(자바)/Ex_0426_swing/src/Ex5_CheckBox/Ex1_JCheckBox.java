package Ex5_CheckBox;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Ex1_JCheckBox {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		
//		체크박스
		JPanel jp1 = new JPanel();
		JCheckBox jcb1 = new JCheckBox("음악감상");
		JCheckBox jcb2 = new JCheckBox("등산");
		JCheckBox jcb3 = new JCheckBox("조깅");
		
		jp1.add(jcb1);
		jp1.add(jcb2);
		jp1.add(jcb3);
		
//		라디오버튼
		JPanel jp2 = new JPanel();
		ButtonGroup bg1 = new ButtonGroup();
		JRadioButton jrb1 = new JRadioButton("남자",true);   
		JRadioButton jrb2 = new JRadioButton("여자",true);
		bg1.add(jrb1);
		bg1.add(jrb2);
		
		jp2.add(jrb1);
		jp2.add(jrb2);
		
		f.add(jp2,"South");
		
		f.add(jp1,"North");
		
		f.setBounds(50, 50, 300, 250);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//main

}

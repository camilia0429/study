package Ex4_JText;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ex1_JText {
	public static void main(String[] args) {
		JFrame f = new JFrame("JText");
//		JLabel
//		정보 또는 텍스트를 위한 라벨을 생성
//		문자열이나 아이콘을 사용하여 객체를 생성한다
		
//		JTextField
//		한줄의 문자열을 입력할 수 있는 요소
//		JTextArea
//		JtextArea클래스는 여러줄의 문자열을 입력할 수 있는 요소
//		만든 크기보다 많은 문자열을 입력하더라도 스크롤바가 생기지 않는다
//		따라서 스크롤바의 기능을 사용하기 위해서 JScrollPane 클래스를 사용한다
		
		f.setLayout(new FlowLayout());
		JLabel lb1 = new JLabel("이름");
		JTextField tf = new JTextField(20);
		
		JLabel lb2 = new JLabel("주소");
		JTextArea ta = new JTextArea(7,20);
		
		JLabel lb3 = new JLabel("비밀번호");
		JPasswordField pf = new JPasswordField(20);
		
		f.add(lb1);
		f.add(tf);
		f.add(lb2);
		f.add(ta);
		f.add(lb3);
		f.add(pf);
		
		
		f.setBounds(50, 50, 300, 250);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//main

}

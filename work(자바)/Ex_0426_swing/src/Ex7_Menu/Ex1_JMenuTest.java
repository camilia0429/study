package Ex7_Menu;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Ex1_JMenuTest {
	public static void main(String[] args) {
		JFrame f = new JFrame("JMenuTest");
		
		JMenuBar jmb = new JMenuBar();
		JMenu jmu1 = new JMenu("파일");
		JMenu jmu2 = new JMenu("편집");
		JMenu jmu3 = new JMenu("보기");
		
		JMenuItem jmi1 = new JMenuItem("새로만들기");
		JMenuItem jmi2 = new JMenuItem("열기");
		JMenuItem jmi3 = new JMenuItem("저장");
		
		jmu1.add(jmi1);
		jmu1.add(jmi2);
		jmu1.add(jmi3);
		
		jmb.add(jmu1);
		jmb.add(jmu2);
		jmb.add(jmu3);
		
		f.setJMenuBar(jmb);
		
//		JMenu =>타이틀네비게이션
//		JMenuItem =>네비게이션 메뉴 하위 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		f.setBounds(300, 300, 300, 200);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//main

}

package Ex7_Menu;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Ex1_JMenuTest {
	public static void main(String[] args) {
		JFrame f = new JFrame("JMenuTest");
		
		JMenuBar jmb = new JMenuBar();
		JMenu jmu1 = new JMenu("����");
		JMenu jmu2 = new JMenu("����");
		JMenu jmu3 = new JMenu("����");
		
		JMenuItem jmi1 = new JMenuItem("���θ����");
		JMenuItem jmi2 = new JMenuItem("����");
		JMenuItem jmi3 = new JMenuItem("����");
		
		jmu1.add(jmi1);
		jmu1.add(jmi2);
		jmu1.add(jmi3);
		
		jmb.add(jmu1);
		jmb.add(jmu2);
		jmb.add(jmu3);
		
		f.setJMenuBar(jmb);
		
//		JMenu =>Ÿ��Ʋ�׺���̼�
//		JMenuItem =>�׺���̼� �޴� ���� 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		f.setBounds(300, 300, 300, 200);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//main

}

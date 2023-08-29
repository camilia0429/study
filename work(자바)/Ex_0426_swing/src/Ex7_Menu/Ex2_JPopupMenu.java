package Ex7_Menu;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;

public class Ex2_JPopupMenu {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		
		String[] title = {"사번","성명","부서"};
		JRadioButtonMenuItem[] rbm = new JRadioButtonMenuItem[3];
		
		JPopupMenu pmenu = new JPopupMenu();
		ButtonGroup tgroup = new ButtonGroup();
		
		for(int i = 0; i <rbm.length; i++) {
			rbm[i] = new JRadioButtonMenuItem(title[i]);
			pmenu.add(rbm[i]);
			tgroup.add(rbm[i]);
		}
		
		f.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				checkForTriggerEvent(e);
				super.mousePressed(e);
			}
			
			@Override
			public void mouseReleased(MouseEvent e) {
				checkForTriggerEvent(e);
				super.mouseReleased(e);
			}
//			마우스 오른쪽 버튼을 누르거나 해제할 때 발생
			private void checkForTriggerEvent(MouseEvent e) {
				if(e.isPopupTrigger()) {
					pmenu.show(e.getComponent(),e.getX(),e.getY());
				}
			}
			
		});
		
		
		
		
		f.setBounds(300, 300, 300, 200);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}//main

}

package Ex1_JFrame;

import javax.swing.JFrame;

public class Ex1_JFrame extends JFrame {
	
	public Ex1_JFrame() {
		super("����");
//		x��ǥ, y��ǥ, width, height
		setBounds(300,300,300,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		Ex1_JFrame f = new Ex1_JFrame();
		f.setDefaultCloseOperation(EXIT_ON_CLOSE); // ���������� ����
		
	}//main
	
	
	
	

}

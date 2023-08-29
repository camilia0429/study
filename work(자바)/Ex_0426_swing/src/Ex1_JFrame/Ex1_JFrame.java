package Ex1_JFrame;

import javax.swing.JFrame;

public class Ex1_JFrame extends JFrame {
	
	public Ex1_JFrame() {
		super("제목");
//		x좌표, y좌표, width, height
		setBounds(300,300,300,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		Ex1_JFrame f = new Ex1_JFrame();
		f.setDefaultCloseOperation(EXIT_ON_CLOSE); // 정상적으로 종료
		
	}//main
	
	
	
	

}

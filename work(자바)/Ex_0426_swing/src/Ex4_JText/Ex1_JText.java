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
//		���� �Ǵ� �ؽ�Ʈ�� ���� ���� ����
//		���ڿ��̳� �������� ����Ͽ� ��ü�� �����Ѵ�
		
//		JTextField
//		������ ���ڿ��� �Է��� �� �ִ� ���
//		JTextArea
//		JtextAreaŬ������ �������� ���ڿ��� �Է��� �� �ִ� ���
//		���� ũ�⺸�� ���� ���ڿ��� �Է��ϴ��� ��ũ�ѹٰ� ������ �ʴ´�
//		���� ��ũ�ѹ��� ����� ����ϱ� ���ؼ� JScrollPane Ŭ������ ����Ѵ�
		
		f.setLayout(new FlowLayout());
		JLabel lb1 = new JLabel("�̸�");
		JTextField tf = new JTextField(20);
		
		JLabel lb2 = new JLabel("�ּ�");
		JTextArea ta = new JTextArea(7,20);
		
		JLabel lb3 = new JLabel("��й�ȣ");
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

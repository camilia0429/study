package Ex8_Memo;

import java.awt.Color;
import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Memo {
	public static void main(String[] args) {
		JFrame f = new JFrame("�޸���");
		
		JPanel jp = new JPanel();
		jp.setBackground(Color.CYAN);
		jp.setLayout(null);
		
//		�ؽ�Ʈ�ʵ�
		JTextField tf = new JTextField();
		tf.setBounds(10, 15, 170, 30);
		
//		Ȯ�ι�ư
		JButton btn_input = new JButton("Ȯ��");
		btn_input.setBounds(190, 15, 60, 30);
		btn_input.setEnabled(false);//��ưŬ�� ��Ȱ��ȭ
		
//		�ؽ�Ʈ������
		JTextArea ta = new JTextArea();
		ta.setBounds(10, 60, 230, 280);
		ta.setEditable(false); // �ؽ�Ʈ������ ���� ��Ȱ��ȭ
		
//		����,�����ư
		JButton btnSave = new JButton("����");
		JButton btnClose = new JButton("����");
		btnSave.setBounds(10, 356, 110, 30);
		btnClose.setBounds(130, 356, 110, 30);
		
//		Ȯ�ι�ư Ŭ����, tf(�ؽ�Ʈ�ʵ�)�� ���� ta(�ؽ�Ʈ������)�� �����ؼ� �ֱ�
		btn_input.addActionListener(new InputButtonAdapter(tf,ta));
		
//		tf�� ���� �� �ִ��� Ȯ���Ͽ�  'Ȯ��'��ư Ȱ��ȭ �Ǵ� ��Ȱ��ȭ �ϴ� ���
		tf.getDocument().addDocumentListener(new TextAdapter(tf,btn_input));
		
//		�����ư�� ������ �� ta�� �ִ� ���� �����ϴ� �̺�Ʈ ������
		btnSave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String message = ta.getText();
				
				FileDialog fd = new FileDialog(f,"����",FileDialog.SAVE);
				
				fd.setVisible(true);
				
				String path = fd.getDirectory()+fd.getFile()+".txt";
//				System.out.println(path);
				
//				char����� ��Ʈ���� �����Ͽ� path ��ο� ������ ����
				try {
					FileWriter fw = new FileWriter(path);
					fw.write(message);
					ta.setText("");//���� �� �ؽ�Ʈ������ ����
					fw.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		
//		�����ư�� �̺�Ʈ ������
		btnClose.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				f.dispose();
			}
		});
		

		
		
		
		
		
		jp.add(tf);
		jp.add(btn_input);
		jp.add(ta);
		jp.add(btnSave);
		jp.add(btnClose);
		
		f.add(jp);
		f.setBounds(700, 200, 270, 440);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
	}//main
	

}

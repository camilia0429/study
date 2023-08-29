package Ex2_JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex1_JButton {
	public static void main(String[] args) {
		JFrame f = new JFrame("��ư(JButton)�߰�");
		
		JButton jbtn1 = new JButton("1");
		JButton jbtn2 = new JButton("2");
		JButton jbtn3 = new JButton("3");
//		�����ӿ� ��Ҹ� ��� ��ġ�� ������(���̾ƿ�) ������ ������
//		�⺻������ ��Ҹ� �� ä�� ��ġ�� �ȴ�.
		f.setLayout(null);
		
		jbtn1.setBounds(10, 10, 70, 70);
		jbtn2.setBounds(90, 10, 70, 70);
		jbtn3.setBounds(170, 10, 70, 70);
		
		f.add(jbtn1);
		f.add(jbtn2);
		f.add(jbtn3);
		
//		��ư�� �̺�Ʈ �����
//		~Listener : �̺�Ʈ ������(��κ� �������̽�)
		
//		�̸��� ����(Anonymous) Ŭ����
		ActionListener al = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
//				���� ���� ��ư�� �����ִ� ���ڸ� ��������� ���
				switch(e.getActionCommand()) {
				case "1":
					System.out.println("1����ư ����");
					break;
				case "2":
					System.out.println("2����ư ����");
					break;
				case "3":
					System.out.println("3����ư ����");
					break;
				}
				
			}
		};
		
		jbtn1.addActionListener(al);
		jbtn2.addActionListener(al);
//		jbtn2.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//		});
//		�̷��� ���� �̺�Ʈ �׼��� �ٸ������� ������� ����
		
		jbtn3.addActionListener(al);
		
		
		
		
		
		
		
		f.setBounds(50, 50, 300, 200);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}//main

}

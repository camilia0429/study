package Ex3_Layout;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex1_JPanel {
	public static void main(String[] args) {
		JFrame f = new JFrame("�гΰ� ���̾ƿ�");
		
		JPanel p1 = new JPanel();
		p1.setBackground(Color.YELLOW);
//		��ġ������
//		1. FlowLayout : ���ʿ��� ���������� ��ġ. �����ʿ� ���̻� ���� ������ �������� �Ʒ��� �̵�.
//		2. BorderLayout : ��,��,��,��,�߾� 5���� �������� ������ ��ġ
//		3. GridLayout : 2������ ǥ ������μ� n X n���� �������ָ�, ���ʿ��� ������, ������ �Ʒ� ������ ��ġ.
//		4. CardLayout : �����ͳ�Ʈ�� ������ ��ġ
//		5. nuoll : ���̾ƿ��� ���� �ʰ� ������Ʈ���� �������� ��ġ�� ����
		
//		p1.setLayout(new FlowLayout());
//		p1.setLayout(new GridLayout(3,2)); //3��(��) 2��(ĭ)
		
		p1.add(new JButton("1"));
		p1.add(new JButton("2"));
		p1.add(new JButton("3"));
		p1.add(new JButton("4"));
		p1.add(new JButton("5"));
		
		
		f.add(p1);
		
		
		
		 
		
		
		f.setBounds(50, 50, 300, 200);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}//main

}

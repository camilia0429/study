package Ex5_CheckBox;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Ex2_JCheckBox {
	public static void main(String[] args) {
		JFrame f = new JFrame("ItemEventó��");
		
		f.setLayout(new BorderLayout());
		
//		������ư ��ü �����ϱ�
		ButtonGroup rgroup = new ButtonGroup();
		JRadioButton r1 = new JRadioButton("����1");
		JRadioButton r2 = new JRadioButton("����2");
		JRadioButton r3 = new JRadioButton("����3");
		
//		�׷쿡 ������ư �߰�
		rgroup.add(r1);
		rgroup.add(r2);
		rgroup.add(r3);
		
//		�гο� ������ư �߰�
		JPanel jp1 = new JPanel();
		jp1.setBackground(Color.white);
		jp1.setLayout(new FlowLayout());
		jp1.add(r1);
		jp1.add(r2);
		jp1.add(r3);
		
//		�г��� �������� ��� ���̱�
		f.add(jp1, BorderLayout.CENTER); 
		
		JPanel jp2 = new JPanel(new FlowLayout());
		jp2.setBackground(Color.lightGray);
		JLabel txt1 = new JLabel("�����׸� : ");
		JLabel txt2 = new JLabel();
		jp2.add(txt1);
		jp2.add(txt2);
		
		f.add(jp2, BorderLayout.SOUTH);
		
//		������ư�� �̺�Ʈ�� ����� �޼��� �������ϱ�
		ItemListener il = new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
//			getStateChange() : Ŭ���� �Ǹ� 1, Ŭ���� �ȵǸ� 2�� ��ȯ
//			ItemEvent.SELECTED : 1�� ����
				if(e.getStateChange() == ItemEvent.SELECTED) {
					if(e.getSource() == r1) {
						txt2.setText("����1");
					}else if(e.getSource() == r2) {
						txt2.setText("����2");
					}else if(e.getSource() == r3) {
						txt2.setText("����3");
					}
				}//if
				
			}
		};
		
		r1.addItemListener(il);
		r2.addItemListener(il);
		r3.addItemListener(il);
		
		
		
		f.setBounds(300, 300, 300, 200);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}//main

}

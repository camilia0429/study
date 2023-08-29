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
		JFrame f = new JFrame("ItemEvent처리");
		
		f.setLayout(new BorderLayout());
		
//		라디오버튼 객체 생성하기
		ButtonGroup rgroup = new ButtonGroup();
		JRadioButton r1 = new JRadioButton("선택1");
		JRadioButton r2 = new JRadioButton("선택2");
		JRadioButton r3 = new JRadioButton("선택3");
		
//		그룹에 라디오버튼 추가
		rgroup.add(r1);
		rgroup.add(r2);
		rgroup.add(r3);
		
//		패널에 라디오버튼 추가
		JPanel jp1 = new JPanel();
		jp1.setBackground(Color.white);
		jp1.setLayout(new FlowLayout());
		jp1.add(r1);
		jp1.add(r2);
		jp1.add(r3);
		
//		패널을 프레임의 가운데 붙이기
		f.add(jp1, BorderLayout.CENTER); 
		
		JPanel jp2 = new JPanel(new FlowLayout());
		jp2.setBackground(Color.lightGray);
		JLabel txt1 = new JLabel("선택항목 : ");
		JLabel txt2 = new JLabel();
		jp2.add(txt1);
		jp2.add(txt2);
		
		f.add(jp2, BorderLayout.SOUTH);
		
//		라디오버튼의 이벤트를 담당할 메서드 제정의하기
		ItemListener il = new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
//			getStateChange() : 클릭이 되면 1, 클릭이 안되면 2를 반환
//			ItemEvent.SELECTED : 1과 같음
				if(e.getStateChange() == ItemEvent.SELECTED) {
					if(e.getSource() == r1) {
						txt2.setText("선택1");
					}else if(e.getSource() == r2) {
						txt2.setText("선택2");
					}else if(e.getSource() == r3) {
						txt2.setText("선택3");
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

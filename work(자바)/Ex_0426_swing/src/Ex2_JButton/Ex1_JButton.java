package Ex2_JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex1_JButton {
	public static void main(String[] args) {
		JFrame f = new JFrame("버튼(JButton)추가");
		
		JButton jbtn1 = new JButton("1");
		JButton jbtn2 = new JButton("2");
		JButton jbtn3 = new JButton("3");
//		프레임에 요소를 어떻게 배치할 것인지(레이아웃) 정하지 않으면
//		기본적으로 요소를 꽉 채워 배치가 된다.
		f.setLayout(null);
		
		jbtn1.setBounds(10, 10, 70, 70);
		jbtn2.setBounds(90, 10, 70, 70);
		jbtn3.setBounds(170, 10, 70, 70);
		
		f.add(jbtn1);
		f.add(jbtn2);
		f.add(jbtn3);
		
//		버튼별 이벤트 만들기
//		~Listener : 이벤트 감지자(대부분 인터페이스)
		
//		이름이 없는(Anonymous) 클래스
		ActionListener al = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
//				내가 누른 버튼에 쓰여있는 글자를 가져오라는 명령
				switch(e.getActionCommand()) {
				case "1":
					System.out.println("1번버튼 누름");
					break;
				case "2":
					System.out.println("2번버튼 누름");
					break;
				case "3":
					System.out.println("3번버튼 누름");
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
//		이렇게 만든 이벤트 액션은 다른곳에서 사용하지 못함
		
		jbtn3.addActionListener(al);
		
		
		
		
		
		
		
		f.setBounds(50, 50, 300, 200);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}//main

}

package Ex8_Memo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class InputButtonAdapter implements ActionListener{

	
	//	생성자의 특징
	//	1. 반환형X
	//	2. 클래스의 이름과 무조건 동일하다
	//	3. 객체 생성시 1회만 호출되며 그 후로 재호출 할 수 없다
	
	//	데이터 끌어오는 법
	//	1. 함수의 파라미터로 실어서 던지기
	//	2. 생성자에 파라미터로 실어서 던지기
	
	JTextField tf;
	JTextArea ta;
	
	public InputButtonAdapter(JTextField tf,JTextArea ta) {
		this.tf = tf;
		this.ta = ta;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
//		setText() : 괄호안의 내용으로 세팅하는 메서드
//		ta.setText(tf.getText());
		
//		ta가 가진 기존 값에 새로 들어온 값을 이어붙이자(append)
		ta.append(tf.getText()+"\n");
		
		tf.requestFocus(); //커서를 tf로 이동
		tf.setText("");
		
		
		
	}
	


}

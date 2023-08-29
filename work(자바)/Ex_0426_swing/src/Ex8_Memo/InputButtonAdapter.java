package Ex8_Memo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class InputButtonAdapter implements ActionListener{

	
	//	�������� Ư¡
	//	1. ��ȯ��X
	//	2. Ŭ������ �̸��� ������ �����ϴ�
	//	3. ��ü ������ 1ȸ�� ȣ��Ǹ� �� �ķ� ��ȣ�� �� �� ����
	
	//	������ ������� ��
	//	1. �Լ��� �Ķ���ͷ� �Ǿ ������
	//	2. �����ڿ� �Ķ���ͷ� �Ǿ ������
	
	JTextField tf;
	JTextArea ta;
	
	public InputButtonAdapter(JTextField tf,JTextArea ta) {
		this.tf = tf;
		this.ta = ta;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
//		setText() : ��ȣ���� �������� �����ϴ� �޼���
//		ta.setText(tf.getText());
		
//		ta�� ���� ���� ���� ���� ���� ���� �̾������(append)
		ta.append(tf.getText()+"\n");
		
		tf.requestFocus(); //Ŀ���� tf�� �̵�
		tf.setText("");
		
		
		
	}
	


}

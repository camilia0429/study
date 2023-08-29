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
		JFrame f = new JFrame("메모장");
		
		JPanel jp = new JPanel();
		jp.setBackground(Color.CYAN);
		jp.setLayout(null);
		
//		텍스트필드
		JTextField tf = new JTextField();
		tf.setBounds(10, 15, 170, 30);
		
//		확인버튼
		JButton btn_input = new JButton("확인");
		btn_input.setBounds(190, 15, 60, 30);
		btn_input.setEnabled(false);//버튼클릭 비활성화
		
//		텍스트에리어
		JTextArea ta = new JTextArea();
		ta.setBounds(10, 60, 230, 280);
		ta.setEditable(false); // 텍스트에리어 수정 비활성화
		
//		저장,종료버튼
		JButton btnSave = new JButton("저장");
		JButton btnClose = new JButton("종료");
		btnSave.setBounds(10, 356, 110, 30);
		btnClose.setBounds(130, 356, 110, 30);
		
//		확인버튼 클릭시, tf(텍스트필드)의 값을 ta(텍스트에리어)에 복사해서 넣기
		btn_input.addActionListener(new InputButtonAdapter(tf,ta));
		
//		tf에 값이 들어가 있는지 확인하여  '확인'버튼 활성화 또는 비활성화 하는 기능
		tf.getDocument().addDocumentListener(new TextAdapter(tf,btn_input));
		
//		저장버튼을 눌렀을 때 ta에 있는 값을 저장하는 이벤트 감지자
		btnSave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String message = ta.getText();
				
				FileDialog fd = new FileDialog(f,"저장",FileDialog.SAVE);
				
				fd.setVisible(true);
				
				String path = fd.getDirectory()+fd.getFile()+".txt";
//				System.out.println(path);
				
//				char기반의 스트림을 생성하여 path 경로에 실제로 저장
				try {
					FileWriter fw = new FileWriter(path);
					fw.write(message);
					ta.setText("");//저장 후 텍스트에리어 비우기
					fw.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		
//		종료버튼에 이벤트 감지자
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

package Ex8_Memo;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class TextAdapter implements DocumentListener {
	
	JTextField tf;
	JButton btn_iput;
	
	
	public TextAdapter(JTextField tf, JButton btn_input) {
		this.tf = tf;
		this.btn_iput = btn_input;
	}
	
	
	@Override
	public void changedUpdate(DocumentEvent e) {
		change();
		
	}
	
	@Override
	public void insertUpdate(DocumentEvent e) {
		change();
		
	}

	@Override
	public void removeUpdate(DocumentEvent e) {
		change();
		
	}
	
	public void change() {
		if(tf.getText().length() == 0) {
			btn_iput.setEnabled(false);
		}else {
			btn_iput.setEnabled(true);
		}
	}
}

package Graphics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class HiddenWord implements ActionListener {
	public static void main(String[] args) {
		HiddenWord word = new HiddenWord();	
		word.ActionListenersandText();
		word.setupFrames();
	}
	JButton b = new JButton();
	JButton b2 = new JButton();
	JButton b3 = new JButton();
	JButton b4 = new JButton();	
	JButton b5 = new JButton();
	JLabel text = new JLabel();
void setupFrames() {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
frame.setVisible(true);
frame.add(panel);
panel.add(b);
panel.add(b2);
panel.add(b3);
panel.add(b4);
panel.add(b5);
panel.add(text);
frame.pack();



}
void ActionListenersandText() {
	b.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	b5.addActionListener(this);
	b.setText("T");
	b2.setText("A");
	b3.setText("O");
	b4.setText("I");
	b5.setText("Submit!");
	
	
}
String record = "";
@Override
public void actionPerformed(ActionEvent e) {

	
if (e.getSource()==b) {
	record += b.getText();	
	text.setText(record);
	b.hide();
}
else if (e.getSource()==b2)
{
	record += b2.getText();	
	text.setText(record);
	b2.hide();
}
else if (e.getSource()==b3) {
	record += b3.getText();	
	text.setText(record);
	b3.hide();
}
else if (e.getSource()==b4) {
	record += b4.getText();	
	text.setText(record);
	b4.hide();
}
else if (e.getSource()==b5) {
	
	if (text.getText().equals("IOTA")) {
		text.setText("CORRECT! CONGRATULATIONS!");
		
	}
	else {
		text.setText("WRONG");
		b.show();
		b2.show();
		b3.show();
		b4.show();
		record = ("");
		
	}
}
	
}
	
	
	

}

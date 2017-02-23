package Graphics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Menu implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel l = new JLabel();
	JLabel l2 = new JLabel();
	JLabel l3 = new JLabel();
	JLabel l4 = new JLabel();
	JLabel l5 = new JLabel();
	JButton b = new JButton();
	JTextField input = new JTextField(10);
JTextField output = new JTextField(10);

	public Menu() {
		frame.setVisible(true);
		frame.setSize(1000, 1000);
		frame.add(panel);
		panel.add(l);
		panel.add(l2);
		panel.add(l3);
		panel.add(l4);
		panel.add(l5);
		panel.add(input);
		panel.add(output);
		panel.add(b);
		b.setText("Take Order");
		

	}
	void pack() {
		frame.pack();
	}
void setl(String food) {
	l.setText(food);
}
void setl2(String food) {
	l2.setText(food);
}
void setl3(String food) {
	l3.setText(food);
}
void setl4(String food) {
	l4.setText(food);;
}
void setl5(String food) {
	l5.setText(food);
}
void addListener(ActionListener controller) {
	b.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	System.out.println("merp");
}
}
	
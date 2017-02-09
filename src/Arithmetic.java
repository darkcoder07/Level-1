import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Arithmetic implements ActionListener {

public static void main(String[] args) {
	Arithmetic math = new Arithmetic();
	math.setup();
	
}	
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton add = new JButton();
JButton minus = new JButton();
JButton rand = new JButton();
JLabel label = new JLabel();
String bnum = label.getText();
	
int ibnum = Integer.parseInt(bnum);	
	
void setup() {
frame.setVisible(true);
frame.setSize(800,800);
frame.add(panel);
panel.add(add);
panel.add(minus);
panel.add(rand);
panel.add(label);
add.addActionListener(this);
minus.addActionListener(this);
rand.addActionListener(this);
add.setText("Add");
minus.setText("Subtract");
rand.setText("Set to a random number");

}



@Override
public void actionPerformed(ActionEvent e) {
JButton b = (JButton) e.getSource();



if (b.equals(add)) {
	ibnum++;
	label.setText("" + ibnum);
	
}
else if (b.equals(minus)) {
	ibnum=ibnum-1;
	label.setText("" + ibnum);
}
else if (b.equals(rand))
{
	int r = new Random().nextInt(10000);
	
	String sr = (r  + "");
	label.setText(sr);

}
	
	
}
	
	
	
	
	
	
	
	
	
	
	
}

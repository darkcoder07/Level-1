import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
public static void main(String[] args) {
	FortuneCookie fortune = new FortuneCookie();
	fortune.showButton();
}
void showButton() {
	System.out.println("button!");
	JFrame frame = new JFrame();
	frame.setVisible(true);
	JButton b = new JButton();
	frame.add(b);
	b.addActionListener(this);
	b.setText("Click me for your fortune! (Ooooh, spooky.)");
	frame.pack();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub

	int random = new Random().nextInt(5);
	if (random==0) {
		JOptionPane.showMessageDialog(null, "A thing you don't like will become your dearest treasure.");
	System.out.println("0");	
	}
	else if (random==1) {
		JOptionPane.showMessageDialog(null, "An opportunity will come incognito.");	
		System.out.println("1");
	}
	else if (random==2) {
		JOptionPane.showMessageDialog(null, "You will be very lucky with 2 things in the future.");
		System.out.println("2");
	}
	else if (random==3) {
		JOptionPane.showMessageDialog(null, "A good thing will have an evil edge.");
		System.out.println("3");
	}
	else if (random==4) {
		JOptionPane.showMessageDialog(null, "A bet you'll take will turn very scary.");
		System.out.println("4");
	}
	
}
}

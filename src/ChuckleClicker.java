import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class ChuckleClicker implements ActionListener {
	JButton b = new JButton();
	JButton b2 = new JButton();
	public static void main(String[] args) {
		

		ChuckleClicker cc = new ChuckleClicker();
		cc.makeButtons();
		
	}

	void makeButtons() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();
		b.setText("Joke");
		b2.setText("Punchline");
		b.addActionListener(this);
		b2.addActionListener(this);
		panel.add(b);
		panel.add(b2); 
		frame.add(panel);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	if (e.getSource()==b) {
		JOptionPane.showMessageDialog(null, "Why did the chicken cross the road?");	
	}
	else {
		JOptionPane.showMessageDialog(null, "Because it was 1 p.m, the perfect time to not become roadkill. Unless it's like New York, that is.");
	}
	}
	
		
	
}

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CompView implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton [] NArray = new JButton [6];
	JLabel label = new JLabel();
	JButton Randomize = new JButton();
    JButton Chloe = new JButton();
    JButton Lucas = new JButton();
    JButton David = new JButton();
    JButton Vish = new JButton();
    JButton Tina = new JButton();
    JButton Olivia = new JButton();
    

	public void setup() {
		frame.setVisible(true);
		frame.setSize(1000, 1000);
		frame.add(panel);
		NArray[0]=Chloe;
		NArray[1]=Vish;
		NArray[2]=David;
		NArray[3]=Tina;
		NArray[4]=Olivia;
		NArray[5]=Lucas;
     	David.setText("David");
		Tina.setText("Tina");
		Lucas.setText("Lucas");
		Olivia.setText("Olivia");
		Vish.setText("Vish");
		Chloe.setText("Chloe");
		panel.add(Randomize);
		panel.add(label);
		Randomize.setText("Randomize");
		
	}

	public void actionListeners(ActionListener a) {
		NArray[0].addActionListener(a);
		NArray[1].addActionListener(a);
		NArray[2].addActionListener(a);
		NArray[3].addActionListener(a);
		NArray[4].addActionListener(a);
		NArray[5].addActionListener(a);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}

}

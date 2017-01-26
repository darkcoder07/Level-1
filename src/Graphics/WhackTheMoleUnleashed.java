package Graphics;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackTheMoleUnleashed implements ActionListener {

	public static void main(String[] args) {
		WhackTheMoleUnleashed wtmu = new WhackTheMoleUnleashed();
		wtmu.drawButtons(7);
		wtmu.ActionListeners();
		wtmu.ArrayStuff();
	}

	JButton b = new JButton();
	JButton b2 = new JButton();
	JButton b3 = new JButton();
	JButton b4 = new JButton();
	JButton b5 = new JButton();
	JButton b6 = new JButton();
	JButton b7 = new JButton();
	JButton b8 = new JButton();
	int r = new Random().nextInt(7);
	int mole = 0;
	int random;
	JButton[] moleplace = new JButton[9];

	void drawButtons(int mole) {

		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(800, 800);
		frame.setName("DEATH TO MOLES");
		JPanel panel = new JPanel();
		frame.add(panel);

		panel.add(b);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		panel.add(b5);
		panel.add(b6);
		panel.add(b7);
		panel.add(b8);
		b.setText("mole?");
		b2.setText("mole?");
		b3.setText("mole?");
		b4.setText("mole?");
		b5.setText("mole?");
		b6.setText("mole?");
		b7.setText("mole?");
		b8.setText("mole?");

	}

	void ArrayStuff() {
		moleplace[0] = b;
		moleplace[1] = b2;
		moleplace[2] = b3;
		moleplace[3] = b4;
		moleplace[4] = b5;
		moleplace[5] = b6;
		moleplace[6] = b7;
		moleplace[7] = b8;
	}

	void ActionListeners() {
		b.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
	}

	void speak(String words) {
		try {
		Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
		e.printStackTrace();
		}
		}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		int fails = 0;
		int whacks = 0;
	
	
		JButton bpressed = (JButton) e.getSource();
		if (bpressed == moleplace[r]&&whacks%2==1) {
			speak("You whacked that mole so hard.");
			whacks++;
			int r = new Random().nextInt(7);
		}
			else if (bpressed != moleplace[r])	 {
		  speak("Ye dork.")	;
		  fails++;
		}
			else if (bpressed != moleplace[r]&&fails==2) {
			speak("You loser");
			fails++;
		}
			else if (bpressed != moleplace[r]&&fails==3) {
				
		speak("You must have had a downward spiral of sadness in your life.");		
fails++;
		}
			else {
				speak("You lose.");
			}
		
		if (whacks>3) {
			speak("You win! Yay.");
		}

	}

}

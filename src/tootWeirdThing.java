import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class tootWeirdThing implements ActionListener {
	public static void main(String[] args) {
		tootWeirdThing twt = new tootWeirdThing();
		twt.setup();
	}

	
	



	
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton b = new JButton();
JButton b2 = new JButton();
JButton b3 = new JButton();

void setup() {
	frame.setVisible(true);
	frame.setSize(800, 800);
	frame.add(panel);
	panel.add(b);
	panel.add(b2);
	panel.add(b3);
	b.addActionListener(this);
	b.addActionListener(this);
	b.addActionListener(this);
	b.setText("DO NOT PRESS");
	b2.setText("DO NOT PRESS");
	b3.setText("DO NOT PRESS");
}
private void playSound(String fileName) {
	AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
	sound.play();
}

@Override
public void actionPerformed(ActionEvent e) {
    JButton bb = (JButton) e.getSource();
    if (bb.equals(b)) {
    	playSound("Silly_Farts-Joe-1473367952.wav");
    }
    else if (bb.equals(b2)) {
    	playSound("Uh Oh Fart-SoundBible.com-581079889.wav");
    	
    }
    else if (bb.equals(b3)) {
    	playSound("Guy Farts While Watching Tv-SoundBible.com-1195822162.wav");
    }
	
}

	
	
	
	
	
	
	
	
	
	
	
}

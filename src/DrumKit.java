
// Copyright Wintriss Technical Schools 2013

import java.applet.AudioClip;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DrumKit extends MouseAdapter {

	JLabel snaredrumimage;
	JLabel cymbaldrumimage;
	JLabel kickdrumimage;

	public static void main(String[] args) throws Exception {
		new DrumKit().getGoing();
	}

	private void getGoing() throws MalformedURLException {
		// 1. Make a JFrame variable and initialize it using "new JFrame()"
		JFrame drum = new JFrame();
		// 2. Make the frame visible
		drum.setVisible(true);
		// 3. Set the size of the frame
		drum.setSize(700, 700);
		// 4. Set the title of the frame
		drum.setTitle("Drums");
		// 5. Make a JPanel and initialize it.
		JPanel drumstuff = new JPanel();

		// 6. Add the panel to the frame. (The panel is invisible.)
		drum.add(drumstuff);

		// 7. Download an image of a drum from the Internet. Drop it into your
		// Eclipse project under "default package".

		// 8. Put the name of your image in a String variable.
		String snaredrum;
		// 9. Use the "createLabelImage()" method to initialize the
		// drumLabelWithImage variable.
		snaredrumimage = createLabelImage("Dynasty-CS-S1450C.jpg");
		// 10. Add the image to the panel
		drumstuff.add(snaredrumimage);
		// 11. Set the layout of the panel to "new GridLayout()"
		drumstuff.setLayout(new GridLayout());
		// 12. call the pack() method on the frame
		drum.pack();
		// 13. add a mouse listener to drumLabelWithImage.
		snaredrumimage.addMouseListener(this);

		String cymbal;
		cymbaldrumimage = createLabelImage("hi hat.jpg");
		drumstuff.add(cymbaldrumimage);
		drum.pack();
		cymbaldrumimage.addMouseListener(this);

		String kick;
		kickdrumimage = createLabelImage("imgres.jpg");
		drumstuff.add(kickdrumimage);
		drum.pack();
		kickdrumimage.addMouseListener(this);
	}

	public void mouseClicked(MouseEvent e) {
		// 14. When the mouse is clicked, print "mouse clicked"
		System.out.println("mouse clicked");
		JLabel drumClicked = (JLabel) e.getSource();
		// 15. Download a drum sound and drop it into your "default package".
		// You can find it on freesound.org. To
		// download it, log in as leagueofamazing/code4life.
		// 16. If they clicked on the drumImage...
		if (drumClicked == snaredrumimage) {
			playSound("3195__noisecollector__ydd6snare.wav");
			System.out.println("mouse clicked");
			JLabel drumClicked2 = (JLabel) e.getSource();

		}
		if (drumClicked == cymbaldrumimage) {
			playSound("154719__mistorcaveman__cymbal-8-1-2 (1).aiff");
		}
		if (drumClicked == kickdrumimage) {
			playSound("331589__j-zealous__kick-j-zealous-hard-club.aiff");
		}

		// 17. ...use the playSound method to play a drum sound.

		// 18. Add more images to make a drumkit. Remember to add a mouse
		// listener to each one.
	}

	private JLabel createLabelImage(String fileName) throws MalformedURLException {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

}

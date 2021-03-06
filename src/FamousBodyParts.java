






import java.awt.Frame;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class FamousBodyParts {

	// Get 3 celebrity photos from the internet, save them to your computer, and fill
	// in their paths here. To get the path, right click on the image, and copy its Location.
	String firstImage = "/Users/league/Desktop/download.jpeg";
	String secondImage = "/Users/league/Desktop/images.jpg";
	String thirdImage = "/Users/league/Desktop/search.jpg";
	Frame window = new Frame();

	private void startQuiz() {
		// Set the size of the window so that you can only see part of the image.
		window.setSize(65, 65);
		// Make an int
		//variable to hold the score.
		int score = 0;
		// Ask the user who this person is and store their answer
String question1 = JOptionPane.showInputDialog("Who is this fine gentleman?");
		// If they got the answer right:
		// -- Tell them they are correct.
		// -- Increase the score by 1
if (question1.equalsIgnoreCase("martin luther king jr.")) {
	JOptionPane.showMessageDialog(null, "Nice! You got that right.");
	score++;
}
else {
JOptionPane.showMessageDialog(null, "I'm afraid you got that wrong. :P");}

JOptionPane.showMessageDialog(null, "Your score is " + score + ".");
showNextImage();
window.setSize(65, 65);
String question2 = JOptionPane.showInputDialog("Who is this ancient gentleman?");

if (question2.equalsIgnoreCase("leonardo da vinci")) {
JOptionPane.showMessageDialog(null, "Perfecto. You got that right.");
score++;
}
else {
JOptionPane.showMessageDialog(null, "I'm afraid you got that wrong. :P");}

JOptionPane.showMessageDialog(null, "Your score is " + score + ".");
showNextImage();
window.setSize(65, 65);
String question3 = JOptionPane.showInputDialog("Who is this fine gentleman....robot...scary thing?");
// If they got the answer right:
// -- Tell them they are correct.
// -- Increase the score by 1
if (question3.equalsIgnoreCase("nightmare fredbear")) {
JOptionPane.showMessageDialog(null, "Cool! You got that right.");
score++;
}
else {
JOptionPane.showMessageDialog(null, "I'm afraid you got that wrong. :P");}

JOptionPane.showMessageDialog(null, "Your score is " + score + ".");
showNextImage();
}


	
		// Otherwise:
		// -- Tell them they are wrong

		// Use the method below to show the next image
		// Show the score
		// .... repeat for all your images.....
	

	public void showNextImage() {
		window.removeAll();
		window.add(getNextImage());
		window.pack();
	}

	public static void main(String[] args) {
		FamousBodyParts quiz = new FamousBodyParts();
		quiz.initializeGui();
		quiz.startQuiz();
	}

	private void initializeGui() {
		initializeImageList();
		imageIterator = imageList.iterator();
		window.setVisible(true);
		showNextImage();
	}

	private JLabel loadImage(String fileName) {
		Icon icon = new ImageIcon(fileName);
		JLabel image = new JLabel(icon);
		return image;
	}

	ArrayList<JLabel> imageList = new ArrayList<JLabel>();
	Iterator<JLabel> imageIterator;

	private void initializeImageList() {
		JLabel imageLabel = loadImage(firstImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(secondImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(thirdImage);
		imageList.add(imageLabel);
	}

	private JLabel getNextImage() {
		if (imageIterator.hasNext())
			return imageIterator.next();
		window.dispose();
		return new JLabel();
	}
}

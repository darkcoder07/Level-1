
// Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class QuizofPhoto {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the
		// image, and select “Copy Image URL”)
		int score = 0;
		// 2. create a variable of type "Component" that will hold your image
		Component hyperdrive;

		// 3. use the "createImage()" method below to initialize your Component
		hyperdrive = createImage("http://media1.s-nbcnews.com/j/msnbc/Components/Photos/060106/060106_Wormhole_hmed_5p.grid-6x2.jpg");
		// 4. add the image to the quiz window
		quizWindow.add(hyperdrive);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String ftl = JOptionPane.showInputDialog("What is this fine spacecraft doing?");
		// 7. print "CORRECT" if the user gave the right answer
		if (ftl.equalsIgnoreCase("going faster than light")) {
			JOptionPane.showMessageDialog(null, "CORRECT! :D");
			score++;
		}

		// 8. print "INCORRECT" if the answer is wrong
		else {
			JOptionPane.showMessageDialog(null, "INCORRECT. D: The answer was: going faster than light. Sorry if you worded it differently!");
			score--;
		}
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
		quizWindow.remove(hyperdrive);
		// 10. find another image and create it (might take more than one line of code)
		Component immunelastresort;
		immunelastresort = createImage("http://mmbr.asm.org/content/76/1/16/F7.medium.gif");
		// 11. add the second image to the quiz window
		quizWindow.add(immunelastresort);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String cytokine = JOptionPane.showInputDialog(
				"What is THIS? It's a very hard question :) I'll give you a hint. It's an immune reaction-which I thought helped, but does more harm than good. Pretty sad D:");

		// 14+ check answer, say if correct or incorrect, etc.
		if (cytokine.equalsIgnoreCase("a cytokine storm")) {
			JOptionPane.showMessageDialog(null, "CORRECT :D");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "INCORRECT D: The answer was: a cytokine storm. Sorry if you worded it differently");
			score--;
		}
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener())
}

package Graphics;
import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.io.IOException;
public class SimonSays extends KeyAdapter {

 // Complete steps 1 - 7 before you test
 // 1. Make a JFrame variable 
 JFrame mehframe;
 	HashMap<Integer,String> images = new HashMap<Integer, String>();
	int points = 0;
 	private int imageIndex;
 	private int tries = 0;
 	private int simonSays = 0;
 	Date timeAtStart;
 	private  void makeAlbum() {
 // 2. add 4 images which match keyboard keys like this: images.put(new Integer(KeyEvent.VK_UP), "image.jpg");
 		images.put(new Integer(KeyEvent.VK_A), "computer_key_A.png");
 		images.put(new Integer(KeyEvent.VK_W), "imgres-1.jpg");
 		images.put(new Integer(KeyEvent.VK_D), "imgres.jpg");
 		images.put(new Integer(KeyEvent.VK_S), "imgres-2.jpg");
 // 3. Tell the user to "Press the matching key when 'Simon says' otherwise press a different key"
 JOptionPane.showMessageDialog(null, "Press the key Simon Says because he's bossy and stuff. If it's not Simon don't do it.");
 // 4. call the method to show an image
 timeAtStart = new Date();
showImage();
 	}
	public void keyPressed(KeyEvent e) {
    	int keyCode = e.getKeyCode();
    	// 16. make a points variable to track the score. tell the user their score at the end.

    	//17. if the keyCode matches the imageIndex and "Simon says..."  increase their score
    	if (keyCode==imageIndex&&(simonSays==1)) {
    		points++;
    		speak("Right!");
    	}
		
    
    	//18.   if the keyCode doesn't match the imageIndex and "Simon didn't say..."  increase their score	
    	else if (keyCode!=imageIndex&&(simonSays==0)) {
    			points++;
    			speak("Right!");
    		}
    		else {
    			speak("Wrong!");
    		}
    			
    	//19. Use the speak method to tell the user if they were correct or not
    		
    	//13. increment tries by 1
  	tries++;
    	//14. if tries is greater than 9 (or however many you want)
    	if (tries>3) {
    		Date timeAtEnd = new Date();
    		 System.out.println((timeAtEnd.getTime()-timeAtStart.getTime())/1000);
    		 JOptionPane.showMessageDialog(null," Good game! Your score was " + points + ", and your time was " + (timeAtEnd.getTime()-timeAtStart.getTime())/1000 + ".");
    		

    		System.exit(0);
    	}
    	//15.    	exit the program

    	//11. dispose of the frame
   	mehframe.dispose();
    	//12. call the method to show an image
    showImage();
	}
	private void showImage() {
		
    	//5. initialize your frame to a new JFrame()
	 mehframe = new JFrame();
    	//6. set the frame to visible
	mehframe.setVisible(true);
  	  mehframe.add(getNextRandomImage()); //7. rename to the name of your frame
    	
    	// 8. set the size of the frame 
     	mehframe.setSize(1000, 1000);
    	// 9. add a key listener to the frame
        mehframe.addKeyListener(this);
        int random = new Random().nextInt(2);
   	 //10. Use the speak method to either say "Simon says press this key" or "Press this key"
        if (random==1) {
        	simonSays=1;
        speak("Simon says press this key.");
        }
        
        else { speak("Simone says press this key."); 
        simonSays=0;
        }
	}
    	//Hint: use the simonSays int and a random number
	
	private Component getNextRandomImage() {
		int random2 = new Random().nextInt(4);
		if (random2==3) {
    	this.imageIndex = 65;
		}
		if (random2==2) {
	    	this.imageIndex = 87;
			}
		if (random2==1) {
	    	this.imageIndex = 68;
			}
		if (random2==0) {
	    	this.imageIndex = 83;
			}
		return loadImage(images.get(imageIndex));
	}
	private JLabel loadImage(String fileName) {
    	URL imageURL = getClass().getResource(fileName);
    	Icon icon = new ImageIcon(imageURL);
    	return new JLabel(icon);
	}
  void speak(String words) {
  	  try {
  	   Runtime.getRuntime().exec("say " + words).waitFor();
  	  } catch (Exception e) {
  	   e.printStackTrace();
  	  }
   	}
	public static void main(String[] args) throws Exception {
	 new SimonSays().makeAlbum();
	}
}

/* 
* 20. add a timer
* ~~~ where the code starts running ~~~
* timeAtStart = new Date();
*
* ~~~ where the code ends ~~~
* Date timeAtEnd = new Date();
* System.out.println((timeAtEnd.getTime()-timeAtStart.getTime())/1000);
* JOptionPane.showMessageDialog(null," Good game! Your score was " + points"
* System.exit(0);
*/



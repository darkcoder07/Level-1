import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SensitiveKeyboard implements KeyListener {
public static void main(String[] args) {
SensitiveKeyboard board = new SensitiveKeyboard();
board.ouchKeys();
}
void ouchKeys() {
JFrame frame = new JFrame();
JPanel panel = new JPanel();	
frame.add(panel);
frame.addKeyListener(this);
frame.setVisible(true);
}
@Override
public void keyTyped(KeyEvent e) {
	
JOptionPane.showMessageDialog(null, "ouch!!! D:");
System.out.println("ouch! D:");
}

@Override
public void keyPressed(KeyEvent e) {
	
System.out.println("ouch! D:");
}
	
	
	

@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
JOptionPane.showMessageDialog(null, "ouch!!! D:");
}
	
}


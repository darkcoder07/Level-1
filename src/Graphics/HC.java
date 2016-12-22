package Graphics;

import java.awt.Color;
import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class HC {
	boolean living;
	Robot merp;
	
	public HC(boolean living) {
	this.merp = new Robot();
	this.living = living;	
			
	}
	void doStuff() {
		merp.hashCode();
	}
	void moveToCorner() {
		merp.moveTo(60,830);
	}
	void GrassyHouse(String size, int r, int g, int b) {
		merp.penDown();
		
		merp.setSpeed(10);
		if (size.equalsIgnoreCase("small")) {
				for (int i=0; i<5; i++) {
			merp.move(60);
			merp.setPenColor(r, g, b);
			merp.turn(45);	
				}
			merp.turn(225);
				
			merp.setPenColor(Color.GREEN);
			merp.move(130);
			merp.turn(-90);
			merp.setPenColor(r,g,b);
		}
		else if (size.equalsIgnoreCase("medium")) {
			for (int i=0; i<5; i++) {
				merp.move(120);
				merp.setPenColor(r, g, b);
				merp.turn(45);
			}
				merp.turn(225);
				merp.setPenColor(Color.GREEN);
				merp.move(130);
				merp.turn(-90);
				merp.setPenColor(r,g,b);
			
		}
		else if (size.equalsIgnoreCase("weird floating futuristic city of doom")) {
			for (int i=0; i<9; i++) {
				
				merp.move(50);
				merp.setRandomPenColor();
				merp.turn(30);
			}
				merp.turn(-90);
				merp.setPenColor(Color.GREEN);
				int rand = new Random().nextInt(200);
				
				merp.move(rand);
				
				
					merp.move(rand);
				
				merp.turn(90);
				merp.setPenColor(r,g,b);
			
		}}
		
		
		
	}


import java.awt.Color;

import org.teachingextensions.logo.Tortoise;

public class Houses {

	public static void main(String[] args) {

		Tortoise.setSpeed(7);
		Tortoise.penUp();
		Tortoise.setX(0);
		Tortoise.setY(428);
		Tortoise.penDown();

	drawHouse("large","yellow");
	drawHouse("medium","yellow");
	drawHouse("small","yellow");
	drawHouse("large","red");
	drawHouse("medium","red");
	drawHouse("small","red");
	drawHouse("large","blue");
	drawHouse("medium","blue");
	drawHouse("small","blue");
		
	}

	static String userHeight;

	private static void drawHouse(String userHeight, String userColor) {
		
		if (userHeight.equals("small")) {
penColor(userColor);
			Tortoise.move(60);
			Tortoise.turn(90);
			Tortoise.move(50);
			Tortoise.turn(90);
			Tortoise.move(60);
			Tortoise.turn(-90);
			Tortoise.setPenColor(Color.GREEN);
			Tortoise.move(50);
			
			Tortoise.turn(-90);
		}
		if (userHeight.equals("medium")) {
			penColor(userColor);
			Tortoise.move(120);
			Tortoise.turn(90);
			Tortoise.move(50);
			Tortoise.turn(90);
			Tortoise.move(120);
			Tortoise.turn(-90);
			Tortoise.setPenColor(Color.GREEN);
			Tortoise.move(50);
			Tortoise.setPenColor(Color.BLACK);
			Tortoise.turn(-90);
		}
		if (userHeight.equals("large")) {
			penColor(userColor);
			Tortoise.move(250);
			Tortoise.turn(90);
			Tortoise.move(50);
			Tortoise.turn(90);
			Tortoise.move(250);
			Tortoise.turn(-90);
			Tortoise.setPenColor(Color.GREEN);
			Tortoise.move(50);
			Tortoise.setPenColor(Color.BLACK);
			Tortoise.turn(-90);
		}
	}

	private static void penColor(String userColor) {
		if (userColor.equalsIgnoreCase("red")) {
			Tortoise.setPenColor(Color.RED);
		}
		else if (userColor.equalsIgnoreCase("blue")) {
			Tortoise.setPenColor(Color.BLUE);
		}
		else if (userColor.equalsIgnoreCase("yellow")) {
			Tortoise.setPenColor(Color.YELLOW);
		}
	}

}

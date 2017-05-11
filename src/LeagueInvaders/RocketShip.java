package LeagueInvaders;

import java.awt.Color;
import java.awt.Graphics;

public class RocketShip extends GameObject {

	int speed;
    boolean right;
    boolean left;
	public RocketShip(int x, int y, int width, int height) {
		super(x,y,width,height);

		this.speed=5;
	}
	void update() {
		super.update();
		if (right==true) {
		
			x=x+speed;
		}
		if (left==true) {
			x=x-speed;
		}
	}
	void draw(Graphics g) {
		g.drawImage(GamePanel.rocketImg, x, y, width, height, null);

	}

}

package LeagueInvaders;

import java.awt.Color;
import java.awt.Graphics;

public class RocketShip extends GameObject {

	int x;
	int y;
	int width;
	int height;
	int speed;
    boolean right;
    boolean left;
	public RocketShip(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.speed=5;
	}
	void update() {
		if (right==true) {
			x=x+speed;
		}
		if (left==true) {
			x=x-speed;
		}
	}
	void draw(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(x,y,width,height);
	}

}
